package helpers;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Fechas {
    public static Date convertirFormatoFechas(LocalDate localDate) {
        Instant instant = localDate.atStartOfDay(
                ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        return date;
    }
}
