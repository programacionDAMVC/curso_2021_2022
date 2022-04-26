package modelo.dao.reserva;

import java.sql.SQLException;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

public class TestReservas {
    public static void main(String[] args) throws SQLException {
       /*LocalDate date1 = LocalDate.now();
        Instant instant = date1.atStartOfDay(ZoneId.systemDefault()).toInstant();
        Date date2 = Date.from(instant);
        java.sql.Date sqlDate = new java.sql.Date(date2.getTime());
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(sqlDate);*/
        ReservaDAO dao  = new ReservaDAOImpl();
        /*Reserva reserva = new Reserva(LocalDate.now(), 1, 3, "11111111S");
        Reserva reserva1 = dao.crearReserva(reserva);
        if (reserva1 != null)
            System.out.println(reserva1);
        else
            System.out.println("no se puede insertar");*/
        List<Reserva> lista = dao.obtenerTodasReservas();
        lista.forEach(System.out::println);
    }
}
