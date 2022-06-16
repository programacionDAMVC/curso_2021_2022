package examenUsers.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion conexion;
    private Connection connection;

    private Conexion() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:BASES_DATOS/users.db");
    }

    public static Conexion getConexion() throws SQLException {
        if (conexion == null)
            conexion = new Conexion();
        return conexion;
    }

    public Connection getConnection() {
        return connection;
    }

    public void cierreConexion () throws SQLException {
        if (connection != null)
            connection.close();
    }
}
