package modelo;

import org.sqlite.SQLiteConfig;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            //properties
            properties.load(new FileReader("resources/bd.properties"));
            String driver = properties.getProperty("DRIVER");
            String db     = properties.getProperty("URL_BD");
            //integridad referencial (PRAGMA FOREING_KEYS = ON)
            SQLiteConfig config = new SQLiteConfig();
            config.enforceForeignKeys(true);
            //crear la conexión
            Connection conexion1 = DriverManager.getConnection(driver + db, config.toProperties());
            System.out.println(conexion1);
            Connection conexion2 = DriverManager.getConnection(driver + db, config.toProperties());
            System.out.println(conexion2);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}
