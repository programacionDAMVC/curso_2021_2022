package examenUsers.conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {
    public static void main(String[] args) {
        try {
            Conexion conexion1 = Conexion.getConexion();
            Connection connection1 = conexion1.getConnection();
            System.out.println(connection1);
            Connection connection2 = Conexion.getConexion().getConnection();
            System.out.println(connection2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
