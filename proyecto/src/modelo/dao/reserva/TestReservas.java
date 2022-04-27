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
        Reserva reserva = new Reserva(LocalDate.now(), 1,
                1, "11111111S");
        Reserva reserva1 = dao.crearReserva(reserva);
        if (reserva1 != null)
            System.out.println(reserva1);
        else
            System.out.println("no se puede insertar");
        List<Reserva> lista = dao.obtenerTodasReservas();
        lista.forEach(System.out::println);
        // fecha ='2022-04-26' AND hora_entrada= 8;
        LocalDate fecha = LocalDate.of(2022,4,27);
        int hora = 5;
        boolean existeReserva = dao.existeReserva(fecha, hora);
        System.out.printf("Existe reserva en la fecha %s y para la hora %d: %B%n",
                fecha, hora, existeReserva);
        Reserva rDelete = new Reserva(fecha, 0, hora, null);
        boolean borrado = dao.eliminarReserva(rDelete);
        System.out.printf("Borrada reserva en la fecha %s y para la hora %d: %B%n",
                fecha, hora, borrado);
    }
}
