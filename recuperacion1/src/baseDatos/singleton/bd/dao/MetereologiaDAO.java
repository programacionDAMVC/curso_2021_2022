package baseDatos.singleton.bd.dao;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public interface MetereologiaDAO {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    List<Metereologia> obtenerTodosDatos() throws SQLException;
    Metereologia obtenerDatoPorFecha(LocalDate fecha) throws SQLException;
    //método para borrar por fecha

}
