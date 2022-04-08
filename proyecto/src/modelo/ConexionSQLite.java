package modelo;

import modelo.singleton.Unico;
import org.sqlite.SQLiteConfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionSQLite {
    private static ConexionSQLite conexionSQLite;
    private static Connection conexion;
    private ConexionSQLite() {
        try {
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            Properties properties  = new Properties();
            properties.load(new FileReader("resources/bd.properties"));
            String driver = properties.getProperty("DRIVER");
            String url    = properties.getProperty("URL_BD");
            conexion = DriverManager.getConnection(driver + url, config.toProperties());

        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConexionSQLite getConexionSQLite() {
        if (conexionSQLite == null)
            conexionSQLite = new ConexionSQLite();
        return conexionSQLite;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion () {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Cerrando la conexión...");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
