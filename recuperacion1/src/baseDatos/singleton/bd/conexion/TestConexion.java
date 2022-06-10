package baseDatos.singleton.bd.conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {
    public static void main(String[] args) {
        Connection connection1 = null, connection2 = null, connection3 = null;
        try {
            connection1 = Conexion.getConexion().getConnection();
            connection2 = Conexion.getConexion().getConnection();
            connection3 = Conexion.getConexion().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);
        try {
            Conexion.getConexion().cerrarConexion();
            Thread.sleep(10_000L);
            System.out.println(connection1);
            System.out.println(connection2);
            System.out.println(connection3);
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }



            
    }
    
}
