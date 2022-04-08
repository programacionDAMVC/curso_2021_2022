package modelo.dao;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    Usuario crearUsuario(Usuario usuario) throws SQLException;
    boolean eliminarUsuario(String dni);
    boolean actualizarUsuario(String dni, Usuario newUsuario) throws SQLException;
    Usuario buscarUsuarioPorDni(String dni) throws SQLException;
    List<Usuario> obtenerTodosUsuarios() throws SQLException;
    /* Semana santa
    método de logueo: email, password: Usuario (SQL)
    método que vuelque los datos de la bd a un fichero csv, argumento nombre fichero
    método que vuelque los datos de un fichero csv a la BD, argumento nombre fichero
     */
}
