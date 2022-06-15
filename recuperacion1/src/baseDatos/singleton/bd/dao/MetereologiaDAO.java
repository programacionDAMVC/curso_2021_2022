package baseDatos.singleton.bd.dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface MetereologiaDAO {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    List<Metereologia> obtenerTodosDatos() throws SQLException;
    Metereologia obtenerDatoPorFecha(LocalDate fecha) throws SQLException;
    boolean borrarDatoPorFecha(LocalDate fecha) throws SQLException;
    boolean actualizarDatoPorFecha(Metereologia metereologia) throws SQLException;
    boolean insertarDatos(Metereologia metereologia) throws SQLException;

}
