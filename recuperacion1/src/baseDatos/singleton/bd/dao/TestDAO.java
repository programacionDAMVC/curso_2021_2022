package baseDatos.singleton.bd.dao;

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
            LocalDate fecha = LocalDate.of(2018, 10, 10);
            Metereologia metereologia = dao.obtenerDatoPorFecha(fecha);
            System.out.println(metereologia);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
