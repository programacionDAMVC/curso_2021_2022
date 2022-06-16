package examenUsers;

import examenUsers.dao.User;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserDAO {
    Map< Integer, User> obtenerTodosLosDatos() throws SQLException;
    List<User> obtenerMayoresEdad() throws SQLException;
    boolean borrarUsuarioPorId(int id) throws SQLException;
    void volvarDatosFichero(Map< Integer, User > map, String path) throws FileNotFoundException;
    User obtenerUsuarioAleatoriamente() throws SQLException;
}
