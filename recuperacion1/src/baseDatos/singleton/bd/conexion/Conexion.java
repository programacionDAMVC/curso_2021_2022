package baseDatos.singleton.bd.conexion;

import baseDatos.singleton.Uno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion conexion; //uno de los atributos es un objeto de la misma clase
    private Connection connection;

    private Conexion() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:BASES_DATOS/test.db");
    }

    public static Conexion  getConexion() throws SQLException {
        if (conexion == null)
            conexion = new Conexion();
        return conexion;
    }

    public Connection getConnection() {
        return connection;
    }

    public void cerrarConexion() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
