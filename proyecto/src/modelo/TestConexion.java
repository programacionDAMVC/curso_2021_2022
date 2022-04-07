package modelo;

import java.sql.Connection;

public class TestConexion {
    public static void main(String[] args) {
        Connection conexion1 = ConexionSQLite.getConexionSQLite().getConexion();
        Connection conexion2 = ConexionSQLite.getConexionSQLite().getConexion();
        Connection conexion3 = ConexionSQLite.getConexionSQLite().getConexion();
        System.out.println(conexion1);
        System.out.println(conexion2);
        System.out.println(conexion3);
        ConexionSQLite conexion = ConexionSQLite.getConexionSQLite();
        conexion.cerrarConexion();

    }
}
