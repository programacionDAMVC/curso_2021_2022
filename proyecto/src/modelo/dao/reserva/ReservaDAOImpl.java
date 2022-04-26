package modelo.dao.reserva;

import helpers.Fechas;
import modelo.ConexionSQLite;
import modelo.dao.usuario.Usuario;
import modelo.dao.usuario.UsuarioDAO;
import modelo.dao.usuario.UsuarioDAOImpl;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservaDAOImpl implements  ReservaDAO{
    private Connection conexion = ConexionSQLite.getConexionSQLite().getConexion();
    @Override
    public Reserva crearReserva(Reserva reserva) throws SQLException
    {
 //INSERT INTO reservas  (fecha, duracion, hora_entrada,tipo_reserva, id_usuario) VALUES ('2022-04-01', 2, 6, 1);
        String sql = "INSERT INTO reservas  (fecha, duracion, hora_entrada, tipo_reserva, id_usuario) VALUES (?, ?, ?, ?,  ?);";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
      //  Date date = Fechas.convertirFormatoFechas(reserva.getFecha());
      //  sentencia.setDate(1, new java.sql.Date(date.getTime()));
        sentencia.setString(1, reserva.getFecha().toString());
        if (reserva.getHoraEntrada() < 1 || reserva.getHoraEntrada() > 8)
            return null;
        sentencia.setInt(3, reserva.getHoraEntrada());
        if (reserva.getHoraEntrada() + reserva.getDuracion() > 8)
            return null;
        sentencia.setInt(2, reserva.getDuracion());
        sentencia.setString(4, reserva.getTipoReserva().toString());
        Usuario usuario = new UsuarioDAOImpl().buscarUsuarioPorDni(reserva.getDniUsuario());
        if (usuario == null)
            return null;
        sentencia.setInt(5, 1);
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
            UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
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
    public boolean eliminarReserva(Reserva reserva) {
        return false;
    }

    @Override
    public Reserva modificarReserva(Reserva oldReserva, Reserva newReservar) {
        return null;
    }
}
