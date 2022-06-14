package baseDatos.singleton.bd.dao;

import baseDatos.singleton.bd.conexion.Conexion;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MetereologiaDAOImp implements MetereologiaDAO{
    private Connection connection = Conexion.getConexion().getConnection();
    @Override
    public List<Metereologia> obtenerTodosDatos() throws SQLException {
        List<Metereologia> lista = new ArrayList<>();
        String sql = " select * from metereologia ;";
        Statement sentencia = connection.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);
        while (resultado.next()){
            String sFecha           = resultado.getString("fecha");
            LocalDate lFecha        = LocalDate.parse(sFecha, formatter);
            float precipitaciones   = resultado.getFloat("precipitaciones");
            float temperaturaMaxima = resultado.getFloat("temperaturaMaxima");
            float temperaturaMinima = resultado.getFloat("temperaturaMinima");
            Metereologia metereologia = new Metereologia(lFecha, precipitaciones,
                    temperaturaMaxima, temperaturaMinima);
            lista.add(metereologia);
        }
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return lista;
    }

    @Override
    public Metereologia obtenerDatoPorFecha(LocalDate fecha) throws SQLException {
        String sql = "select * from metereologia  where fecha = ?;";
        PreparedStatement sentecia = connection.prepareStatement(sql);
        String ssFecha = Helper.obtenerTextoDeFecha(fecha);
        sentecia.setString(1, ssFecha);
        System.out.println("%%%%%%% " + ssFecha);
        ResultSet resultado = sentecia.executeQuery();
        Metereologia metereologia = null;
        while (resultado.next()){
            String sFecha           = resultado.getString("fecha");
            LocalDate lFecha        = LocalDate.parse(sFecha, formatter);
            float precipitaciones   = resultado.getFloat("precipitaciones");
            float temperaturaMaxima = resultado.getFloat("temperaturaMaxima");
            float temperaturaMinima = resultado.getFloat("temperaturaMinima");
            metereologia = new Metereologia(lFecha, precipitaciones,
                    temperaturaMaxima, temperaturaMinima);
        }
        return metereologia;
    }

    public static void main(String[] args) throws SQLException {
        MetereologiaDAO dao = new MetereologiaDAOImp();
        dao.obtenerTodosDatos();
    }
}
