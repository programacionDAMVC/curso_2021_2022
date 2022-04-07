package modelo.dao;

import java.util.List;

public interface UsuarioDAO {
    Usuario crearUsuario(Usuario usuario);
    boolean eliminarUsuario(String dni);
    boolean actulizarUsuario(String dni, Usuario newUsuario);
    Usuario buscarUsuario(String dni);
    List<Usuario> obtenerTodosUsuarios();
}
