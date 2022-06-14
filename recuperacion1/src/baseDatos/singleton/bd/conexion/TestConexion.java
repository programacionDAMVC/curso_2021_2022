package baseDatos.singleton.bd.conexion;

import baseDatos.singleton.bd.dao.Metereologia;
import baseDatos.singleton.bd.dao.MetereologiaDAO;
import baseDatos.singleton.bd.dao.MetereologiaDAOImp;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TestConexion {
    public static void main(String[] args) {

        Conexion conexion1 = Conexion.getConexion();
        Connection connection1 = conexion1.getConnection();

        Connection connection2 = Conexion.getConexion().getConnection();
        System.out.println(connection1);
        System.out.println(connection2);

    }
    
}
