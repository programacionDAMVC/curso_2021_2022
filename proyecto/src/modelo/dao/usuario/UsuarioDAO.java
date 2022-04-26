package modelo.dao.usuario;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDAO {
    Usuario crearUsuario(Usuario usuario) throws SQLException;
    boolean eliminarUsuarioPorDNI(String dni) throws SQLException;
    boolean actualizarUsuarioPorDNI(String dni, Usuario newUsuario) throws SQLException;
    int buscarIDUsuarioPorDni(String dni) throws SQLException;
    Usuario buscarUsuarioPorId(int id) throws SQLException;
    List<Usuario> obtenerTodosUsuarios() throws SQLException;
    Usuario loguearUsuarios(String email, String password) throws SQLException;
    boolean mandarDatosAFichero(String path);
    boolean guardarDatosBD(String path);
}
