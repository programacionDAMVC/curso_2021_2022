package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion1 {
    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(
                "jdbc:sqlite:DATABASES/test.db")) {
            //System.out.println(conexion);
            crearTablas(conexion);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static void crearTablas(Connection conexion) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT, " +
                "edad INTEGER" +
                ")";
        Statement sentencia = conexion.createStatement();
        sentencia.executeUpdate(sql);
        if (sentencia != null)
            sentencia.close();
    }
}
