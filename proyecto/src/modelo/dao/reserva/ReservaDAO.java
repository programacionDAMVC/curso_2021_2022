package modelo.dao.reserva;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface ReservaDAO {

    Reserva crearReserva(Reserva reserva) throws SQLException;
    List<Reserva> obtenerTodasReservas() throws SQLException;
    List<Reserva> obtenerReservarPorUsuario(String dniUsuario);
    boolean existeReserva (LocalDate fecha, int horaEntrada) throws SQLException;
    boolean eliminarReserva(Reserva reserva) throws SQLException;
    Reserva modificarReserva(Reserva oldReserva, Reserva newReservar);
    //guardar datos a fichero
    //recuperar datos a fichero
}
