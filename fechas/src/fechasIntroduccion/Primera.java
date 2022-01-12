package fechasIntroduccion;

import java.time.LocalDate;

public class Primera {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        System.out.println(formatearFecha(fechaActual));
    }
    //método que devuelva una fecha como cadena con formato dd/mm/aaaa
    public static String formatearFecha(LocalDate fecha){
        int dia  = fecha.getDayOfMonth();
        int mes  = fecha.getMonthValue();
        int anno = fecha.getYear();
        return String.format("%d/%d/%d", dia, mes, anno );
    }
}
