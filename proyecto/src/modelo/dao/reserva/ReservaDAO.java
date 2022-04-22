package modelo.dao.reserva;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface ReservaDAO {

    Reserva crearReserva(Reserva reserva) throws SQLException;
    List<Reserva> obtenerTodasReservas();
    //constrain en BD único el par fecha y hora_entrada
    //hacemos el método siguiente:
    List<Reserva> obtenerReservarPorUsuario(String dniUsuario);
    boolean eliminarReserva(Reserva reserva);
    Reserva modificarReserva(Reserva oldReserva, Reserva newReservar);
    //guardar datos a fichero
    //recuperar datos a fichero
}
