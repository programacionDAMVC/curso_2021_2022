package modelo.dao;

import modelo.ConexionSQLite;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{
    Connection conexion = ConexionSQLite.getConexionSQLite().getConexion();
    @Override
    public Usuario crearUsuario(Usuario usuario) throws SQLException {
        //INSERT INTO usuarios (nombre, apellidos, telefono, dni, email, password )
        // VALUES ('juan', 'garcía garcía', '953272522', '01234567a', 'email@correo.es', 'djfdjfljdkf');
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

    @Override
    public boolean eliminarUsuario(String dni) {

        //semana santa
        return false;
    }

    @Override
    public boolean actualizarUsuario(String dni, Usuario newUsuario) throws SQLException {
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
    public Usuario buscarUsuarioPorDni(String dni) throws SQLException {
        Usuario usuario = null;
        String sql = " select * FROM usuarios WHERE dni = ?;";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1,dni);
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
}
