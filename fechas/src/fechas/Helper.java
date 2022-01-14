package fechas;

import java.time.LocalDate;
import java.time.Period;
//import java.util.Arrays;

/**
 * Clase ayudante, para manejar fechas
 * Acciones: formatea a fechas en castellano, obtiene peridos de tiempo
 * en días, meses y años
 * @author Manuel Molino
 * @version 1.0.0
 */
public class Helper {
    /*public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        *//*System.out.println(fechaActual);
        System.out.println(formatearFecha(fechaActual));*//*
        LocalDate cumpl = LocalDate.of(2002, 8, 14);
        System.out.printf("Quien haya nacido %s tiene %d años%n",
                formatearFecha(cumpl), calcularAnnosTranscurridos(cumpl));
        System.out.println(Arrays.toString(calcularDiasMesesAnnosTranscurridos(cumpl)));
    }*/
    private Helper () {}
    /**
     * Método que con el argumento LocalDate devuelve una cadena de fecha
     * en castellano, ejemplo 2000-10-02 lo convierte a 2/10/2000
     * @param fecha la fecha a formatear
     * @return la cadena con la fecha formateada
     */
    public static String formatearFecha(LocalDate fecha){
        int dia  = fecha.getDayOfMonth();
        int mes  = fecha.getMonthValue();
        int anno = fecha.getYear();
        return String.format("%d/%d/%d", dia, mes, anno );
    }

    /**
     * Devuelve los años transcurridos desde la fecha que se le pasa
     * como argumento a la fecha actual (exclusive el día de hoy)
     * @param fecha a obtener años
     * @return años transcurridos
     */
    public static int calcularAnnosTranscurridos(LocalDate fecha) {
        Period periodo = Period.between(fecha, LocalDate.now());
        return periodo.getYears();
    }


    /**
     *Devuelve un array con tres posiciones correspondiente a
     * los días transcurridos, meses transcurridos y años transcurridos
     * desde la fecha que se le pasa como argumento
     * a la fecha actual (exclusive el día de hoy)
     * @param fecha a obtener días, meses y años
     * @return el array con formato [días, meses, años]
     */
    public static int[] calcularDiasMesesAnnosTranscurridos(LocalDate fecha) {
        int[] periodos = new int[3];
        Period periodo = Period.between(fecha, LocalDate.now());
        int dias  = periodo.getDays();
        int meses = periodo.getMonths();
        int annos = periodo.getYears();
        periodos[0] = dias;
        periodos[1] = meses;
        periodos[2] = annos;
        return  periodos;
    }

    /**
     *
     * @param fecha1
     * @param fecha2
     * @return
     */
    public static int calcularAnnosTranscurridoEntreDosFechas(
            LocalDate fecha1, LocalDate fecha2){
        Period periodo = Period.between(fecha1, fecha2);
        return periodo.getYears();
    }

}
