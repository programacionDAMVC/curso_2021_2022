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
        PreparedStatement sentencia = connection.prepareStatement(sql);
        String ssFecha = Helper.obtenerTextoDeFecha(fecha);
        sentencia.setString(1, ssFecha);
     //   System.out.println("%%%%%%% " + ssFecha);
        ResultSet resultado = sentencia.executeQuery();
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
        if (resultado != null)
            resultado.close();
        if (sentencia != null)
            sentencia.close();
        return metereologia;
    }

    @Override
    public boolean borrarDatoPorFecha(LocalDate fecha) throws SQLException {
        String sql = " DELETE FROM metereologia WHERE fecha = ?;";
        String ssFecha = Helper.obtenerTextoDeFecha(fecha); //10-02-2000
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, ssFecha);
        int rows = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return rows != 0;
    }

    @Override
    public boolean actualizarDatoPorFecha(Metereologia metereologia) throws SQLException {
        if (obtenerDatoPorFecha(metereologia.getFecha()) == null) {
            System.out.println("no existe el dato");
            return false;
        }
        String sql = "UPDATE metereologia SET precipitaciones = ?, temperaturaMaxima = ?, temperaturaMinima = ? WHERE fecha = ?;";
        LocalDate lFecha = metereologia.getFecha();
        String sFecha = Helper.obtenerTextoDeFecha(lFecha);
        float precipitaciones = metereologia.getPrecipitaciones();
        float temperaturaMaxima = metereologia.getTemperaturaMaxima();
        float temperaturaMinima = metereologia.getTemperaturaMinima();
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setFloat(1, precipitaciones);
        sentencia.setFloat(2, temperaturaMaxima);
        sentencia.setFloat(3, temperaturaMinima);
        sentencia.setString(4, sFecha);
        int rows = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return rows != 0;
    }

    @Override
    public boolean insertarDatos(Metereologia metereologia) throws SQLException {
        if (obtenerDatoPorFecha(metereologia.getFecha()) != null) {
            System.out.println("existe el dato");
            return false;
        }
        String sql = "INSERT INTO metereologia VALUES (?, ?, ?, ?);";
        PreparedStatement sentencia = connection.prepareStatement(sql);
        LocalDate lFecha = metereologia.getFecha();
        String sFecha = Helper.obtenerTextoDeFecha(lFecha);
        sentencia.setString(1, sFecha);
        float precipitaciones = metereologia.getPrecipitaciones();
        sentencia.setFloat(2, precipitaciones);
        float tMax = metereologia.getTemperaturaMaxima();
        sentencia.setFloat(3,tMax);
        float tMin = metereologia.getTemperaturaMinima();
        sentencia.setFloat(4, tMin);
        int rows = sentencia.executeUpdate();
        if (sentencia != null)
            sentencia.close();
        return rows != 0;
    }

    public static void main(String[] args) throws SQLException {
        MetereologiaDAO dao = new MetereologiaDAOImp();
        dao.obtenerTodosDatos();
       // System.out.println();
    }
}
