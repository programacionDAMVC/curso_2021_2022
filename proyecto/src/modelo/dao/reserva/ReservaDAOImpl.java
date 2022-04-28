package modelo.dao.reserva;

import modelo.ConexionSQLite;
import modelo.dao.usuario.Usuario;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReservaDAOImpl implements  ReservaDAO{
    private Connection conexion = ConexionSQLite.getConexionSQLite().getConexion();
    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    @Override
    public Reserva crearReserva(Reserva reserva) throws SQLException
    {
        boolean existeReserva = existeReserva(reserva.getFecha(), reserva.getHoraEntrada());
        if ( existeReserva )
            return null;
        String sql = "INSERT INTO reservas  (fecha, duracion, hora_entrada, tipo_reserva, id_usuario) VALUES (?, ?, ?, ?,  ?);";
        PreparedStatement sentencia = conexion.prepareStatement(sql);

        sentencia.setString(1, reserva.getFecha().toString());
        if (reserva.getHoraEntrada() < 1 || reserva.getHoraEntrada() > 8)
            return null;
        sentencia.setInt(3, reserva.getHoraEntrada());
        if (reserva.getHoraEntrada() + reserva.getDuracion() > 8)
            return null;
        sentencia.setInt(2, reserva.getDuracion());
        sentencia.setString(4, reserva.getTipoReserva().toString());
        int idUsuairo = usuarioDAO.buscarIDUsuarioPorDni(reserva.getDniUsuario());
        sentencia.setInt(5, idUsuairo);
        int resultado = sentencia.executeUpdate();
        if (resultado != 0)
            return reserva;
        return null;
    }

    @Override
    public List<Reserva> obtenerTodasReservas() throws SQLException {
        List<Reserva> lista = new ArrayList<>();
        Reserva reserva = null;
        LocalDate fecha = null;
        int duracion = 0, horaEntrada = 0, idUsuario = 0;
        TipoReserva tipoReserva = null;
        String dniUsuario = null, sTipoReserva = null;
        String sqlReserva = " SELECT * FROM reservas ;";
        Statement sentencia = conexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sqlReserva);


        while (resultado.next()) {
            fecha = LocalDate.parse(resultado.getString(2 ));
            duracion = resultado.getInt(3);
            horaEntrada = resultado.getInt("hora_entrada");
            sTipoReserva = resultado.getString(5);
            tipoReserva = TipoReserva.GUIADA;
            if (sTipoReserva.equals("NO_GUIADA"))
                tipoReserva = TipoReserva.NO_GUIADA;
            idUsuario = resultado.getInt("id_usuario");
            Usuario usuario = usuarioDAO.buscarUsuarioPorId(idUsuario);
            reserva = new Reserva(fecha, duracion, horaEntrada, usuario.getDni());
            reserva.setTipoReserva(tipoReserva);
            lista.add(reserva);
        }
        return lista;
    }

    @Override
    public List<Reserva> obtenerReservarPorUsuario(String dniUsuario) {
        return null;
    }

    @Override
    public boolean existeReserva(LocalDate fecha, int horaEntrada) throws SQLException {
        int id = -1;
        String sql = " SELECT id FROM reservas WHERE fecha = ? AND hora_entrada = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, fecha.toString());
        sentencia.setInt(2, horaEntrada);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next())
            id = resultado.getInt(1);
        if (resultado != null)
            resultado.close();
        if ( sentencia != null )
            sentencia.close();
        return id != -1;
    }

    @Override
    public boolean eliminarReserva(Reserva reserva) throws SQLException {
        String sql = "DELETE FROM reservas WHERE fecha = ? AND hora_entrada = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, reserva.getFecha().toString());
        sentencia.setInt(2, reserva.getHoraEntrada());
        int rows = sentencia.executeUpdate();
        if ( sentencia != null )
            sentencia.close();
        return rows != 0;
    }

    @Override
    public Reserva modificarReserva(Reserva oldReserva, Reserva newReserva) throws SQLException {
        //comprobamos que la nueva reserva no exista, evitamos el constrain
        boolean existe = existeReserva(newReserva.getFecha(), newReserva.getHoraEntrada());
        if ( existe )
            return null;
        if (newReserva.getHoraEntrada() < 1 || newReserva.getHoraEntrada() > 8)
            return null;
        if (newReserva.getHoraEntrada() + newReserva.getDuracion() > 8)
            return null;
        String sql = " UPDATE reservas SET fecha = ?, duracion = ?, hora_entrada = ?, tipo_reserva = ?, id_usuario = ? WHERE fecha = ? AND hora_entrada = ?;";
        int idUsuairo = usuarioDAO.buscarIDUsuarioPorDni(newReserva.getDniUsuario());
      //  System.out.println("id usuario " + idUsuairo);
        TipoReserva tipoReserva = TipoReserva.GUIADA;
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, newReserva.getFecha().toString());
        sentencia.setInt(2, newReserva.getDuracion());
        sentencia.setInt(3, newReserva.getHoraEntrada());
        sentencia.setString(4, newReserva.getTipoReserva().toString());
        sentencia.setInt(5, idUsuairo);
        sentencia.setString(6, oldReserva.getFecha().toString());
        sentencia.setInt(7, oldReserva.getHoraEntrada());
        int rows = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        if (rows != 0)
            return newReserva;
        return null;
    }

    @Override
    public boolean guardarDatosAFichero(String path) {
        String pathGuardar = "FICHEROS/" + path;
        File outFile = new File(pathGuardar);
        try (PrintWriter out = new PrintWriter(outFile)) {
            List<Reserva> lista = obtenerTodasReservas();
            for (Reserva reserva: lista) {
                out.println(reserva);
                out.flush();
            }
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return outFile.length() != 0;
    }

    @Override
    public boolean leerDatosFicheroVolcarABD(String path) {
        int contador = 0;
        String pathLectura = "FICHEROS/" + path;
        try (Scanner sc = new Scanner(new File(pathLectura))) {
            while (sc.hasNextLine()) {
                String[] tokens = sc.nextLine().split(",");
                System.out.println(Arrays.toString(tokens));
                LocalDate fecha = LocalDate.parse(tokens[0]);
                int duracion = Integer.parseInt(tokens[1]);
                int horaEntrada = Integer.parseInt(tokens[2]);
                Reserva reserva = new Reserva(fecha, duracion,
                        horaEntrada, tokens[4]);
                if (tokens[3].equals("NO_GUIADA"))
                    reserva.setTipoReserva(TipoReserva.NO_GUIADA);
                crearReserva(reserva);
                contador++;
            }
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return contador != 0;
    }
}
