package baseDatos.singleton.bd.dao;

import java.time.LocalDate;

public class Helper {
    public static String obtenerTextoDeFecha(LocalDate fecha) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fecha.getDayOfMonth());
        stringBuilder.append('-');
        stringBuilder.append(fecha.getMonthValue());
        stringBuilder.append('-');
        stringBuilder.append(fecha.getYear());
        return stringBuilder.toString();
    }
}
