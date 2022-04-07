package modelo.dao;

import modelo.ConexionSQLite;

import java.sql.Connection;
import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{
    Connection conexion = ConexionSQLite.getConexionSQLite().getConexion();
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        //INSERT INTO usuarios (nombre, apellidos, telefono, dni, email, password )
        // VALUES ('juan', 'garcía garcía', '953272522', '01234567a', 'email@correo.es', 'djfdjfljdkf');
        return null;
    }

    @Override
    public boolean eliminarUsuario(String dni) {
        return false;
    }

    @Override
    public boolean actulizarUsuario(String dni, Usuario newUsuario) {
        return false;
    }

    @Override
    public Usuario buscarUsuario(String dni) {
        return null;
    }

    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return null;
    }
}
