package modelo.dao.usuario;

import modelo.ConexionSQLite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuarioDAOImpl implements UsuarioDAO{
    private Connection conexion = ConexionSQLite.getConexionSQLite().getConexion();
    @Override
    public Usuario crearUsuario(Usuario usuario) throws SQLException {
        //llamamos al método existeEmailOdni, si existe no se inserta el usuario, si no si se inserta
        if (existeEmailOdni(usuario.getDni(), usuario.getEmail()))
            return null;
        String sql = "INSERT INTO usuarios (nombre, apellidos, telefono, dni, email, password ) VALUES (?, ?, ?, ?, ?, ?);";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, usuario.getNombre());
        sentencia.setString(2, usuario.getApellidos());
        sentencia.setString(3, usuario.getTelefono());
        sentencia.setString(4, usuario.getDni());
        sentencia.setString(5, usuario.getEmail());
        sentencia.setString(6, usuario.getPassword());
        int resultado = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        if (resultado != 0)
            return usuario;
        return null;
    }
    private boolean existeEmailOdni (String dni, String email) {
        String sql = "SELECT * FROM usuarios WHERE dni = ? OR email = ?;";
        int contador = 0;
        try (PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            sentencia.setString(1, dni);
            sentencia.setString(2, email);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next())
                contador++;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contador != 0;
    }
    @Override
    public boolean eliminarUsuarioPorDNI(String dni) throws SQLException {
        String sql = " DELETE FROM usuarios WHERE dni = ? ;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, dni);
        int resultado = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return resultado != 0;
    }

    @Override
    public boolean actualizarUsuarioPorDNI(String dni, Usuario newUsuario) throws SQLException {
        if (existeEmailOdni(newUsuario.getDni(), newUsuario.getEmail()))
            return false;
        String sql = "UPDATE usuarios SET nombre = ?, apellidos = ?, telefono = ?, dni = ?, email = ?, rol = ?, password = ? WHERE dni = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, newUsuario.getNombre()); sentencia.setString(2, newUsuario.getApellidos());
        sentencia.setString(3, newUsuario.getTelefono()); sentencia.setString(4, newUsuario.getDni());
        sentencia.setString(5, newUsuario.getEmail()); sentencia.setInt(6, newUsuario.getRol());
        sentencia.setString(7, newUsuario.getPassword());
        sentencia.setString(8, dni);
        int resultado = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return resultado != 0;
    }

    @Override
    public int buscarIDUsuarioPorDni(String dni) throws SQLException {
        int id = -1;
        String sql = " select id FROM usuarios WHERE dni = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1,dni);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) { //id|nombre|apellidos|telefono|dni|email|rol|password
            id = resultado.getInt(1);
        }
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return id;
    }

    @Override
    public Usuario buscarUsuarioPorId(int id) throws SQLException {
        Usuario usuario = null;
      //  System.out.println(id);
        String sql = " select * FROM usuarios WHERE id = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setInt(1,id);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) { //id|nombre|apellidos|telefono|dni|email|rol|password
            usuario = new Usuario(resultado.getString("nombre"), resultado.getString("apellidos"),
                    resultado.getString("telefono"), resultado.getString("dni"),
                    resultado.getString("email"), resultado.getString("password"));
        }
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return usuario;
    }

    @Override
    public List<Usuario> obtenerTodosUsuarios() throws SQLException {
        List<Usuario> lista = new ArrayList<>();
        String sql = " SELECT * FROM usuarios ;";
        Statement sentecia = conexion.createStatement();
        ResultSet resultados = sentecia.executeQuery(sql);
        while (resultados.next()) {
            Usuario usuario = new Usuario(resultados.getString("nombre"), resultados.getString("apellidos"),
                    resultados.getString("telefono"), resultados.getString("dni"),
                    resultados.getString("email"), resultados.getString("password"));
            usuario.setRol(resultados.getInt("rol"));
            lista.add(usuario);
        }
        if (resultados != null)
            resultados.close();
        if (sentecia != null)
            sentecia.close();
        return lista;
    }

    @Override
    public Usuario loguearUsuarios(String email, String password) throws SQLException {
        Usuario usuario = null;
        String sql = " SELECT * FROM usuarios WHERE email = ? AND password = ? ;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, email);
        sentencia.setString(2, password);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next())
            usuario = new Usuario(resultado.getString("nombre"), resultado.getString("apellidos"),
                    resultado.getString("telefono"), resultado.getString("dni"),
                    resultado.getString("email"), resultado.getString("password"));
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return usuario;
    }

    @Override
    public boolean mandarDatosAFichero(String path) {
        String ruta = "FICHEROS/" + path;
        File inFile = new File(ruta);
        try (PrintWriter out = new PrintWriter(inFile)) {
            List<Usuario> lista = obtenerTodosUsuarios();
            for (Usuario usuario: lista) {
               // System.out.println(usuario);
                out.println(usuario);
                out.flush();
            }
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return inFile.length() != 0;
    }

    @Override
    public boolean guardarDatosBD(String path) {
        int contador = 0;
        String inFile = "FICHEROS/" + path;
        try (Scanner sc = new Scanner(new File(inFile))) {
//juani,garcía garcía,953272522,01234567b,email11@correo.es,0,djfdjfljdkf
            while (sc.hasNextLine()) {
                String[] tokens = sc.nextLine().split(",");
                Usuario usuario = new Usuario(tokens[0], tokens[1], tokens[2], tokens[3],
                        tokens[4], tokens[6]);
                usuario.setRol(Integer.parseInt(tokens[5]));
                if (crearUsuario(usuario) != null)
                    contador++;
            }
        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        //leer fichero con Scanner
        //introducimos datos a la BD
        System.out.printf("Insertados %d usuarios en la BD%n", contador);
        return contador != 0;
    }
}
