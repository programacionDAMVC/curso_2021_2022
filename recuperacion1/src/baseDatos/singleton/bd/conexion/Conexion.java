package baseDatos.singleton.bd.conexion;

import baseDatos.singleton.Uno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Conexion conexion;
    private Connection connection;
    private Conexion() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:BASES_DATOS/datosMetereologicos.db");
    }
    public static Conexion getConexion()  {
        if (conexion == null) {
            try {
                conexion = new Conexion();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexion;
    }

    public Connection getConnection() {
        return connection;
    }

    public void cierreConexion() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
