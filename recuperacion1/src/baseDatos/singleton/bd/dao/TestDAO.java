package baseDatos.singleton.bd.dao;

import baseDatos.singleton.bd.conexion.Conexion;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class TestDAO {
    public static void main(String[] args) {
        /*String fecha0 = "2018-09-01";
        LocalDate parsedDate0 = LocalDate.parse(fecha0);
        System.out.println(parsedDate0);
        String fecha1 = "01-09-2018";
        LocalDate parsedDate1 = LocalDate.parse(fecha1);
        System.out.println(parsedDate1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fecha = "01-09-2018";
        LocalDate parsedDate = LocalDate.parse(fecha, formatter);
        System.out.println(parsedDate);*/
        MetereologiaDAO dao = new MetereologiaDAOImp();
        try {
            List<Metereologia> lista = dao.obtenerTodosDatos();
            for (Metereologia dato: lista) {
                System.out.println(dato);
            }
            System.out.println("----------------------------------------");
            LocalDate fecha = LocalDate.of(2018, 12, 30);
            Metereologia metereologia = dao.obtenerDatoPorFecha(fecha);
            System.out.println(metereologia);
            System.out.println("----------------------------------------");
            boolean borrado = dao.borrarDatoPorFecha(fecha);
            System.out.printf("Borrado %B%n", borrado);
            System.out.println("----------------------------------------");
            LocalDate lFecha = LocalDate.of(2018, 12, 30);
            float precipitaciones = 2.2f;
            float tMax = 10;
            float tMin = 5.2f;
            Metereologia metereologia1 = new Metereologia(lFecha, precipitaciones, tMax, tMin);
            boolean actualizado = dao.actualizarDatoPorFecha(metereologia1);
            System.out.printf("Actualizado %B%n", actualizado);
            System.out.println("----------------------------------------");
            Metereologia metereologia2 = new Metereologia(lFecha.plusYears(1), precipitaciones, tMax, tMin);
            boolean insertado = dao.insertarDatos(metereologia2);
            System.out.printf("Insertado %B%n", insertado);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        Conexion.getConexion().cierreConexion();


    }
}
