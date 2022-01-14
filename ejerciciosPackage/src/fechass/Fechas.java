package fechass;

import fechas.Helper;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Fechas {
    //Pasando como argumento tres número enteros que representan dı́a, mes
    //y año de un dı́a concreto, devuelva un objeto LocalDate que instancie
    //dicha fecha.
    public static LocalDate crearFecha(int dia, int mes, int anno){
        return LocalDate.of(anno, mes, dia);
    }
    //método que nos devuelva un objeto LocalDate correspondiente a la
    //fecha actual.
    public static LocalDate obtenerFechaActual() {
        return LocalDate.now();
    }
    //método que reciba como argumento un objeto LocalDate y devuelva
    //la fecha con formato español (en cadena)
    public static String devolverFechaEnCastellano(LocalDate fecha) {
        return Helper.formatearFecha(fecha);
    }
    //Usando la clase Period, crea un método que devuelva los años que transcu-
    //rren entre dos fechas determinadas
    public static int calcularAnnosTranscurridoEntreDosFechas(
            LocalDate fecha1, LocalDate fecha2){
        Period periodo = Period.between(fecha1, fecha2);
        return periodo.getYears();
    }
    //probar, pero teniendo en cuenta las especificaciones
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0, mes = 0, anno = 0;
        do {
            System.out.println("Introduce un día del mes válido:");
            dia = sc.nextInt();
        } while (dia < 1 || dia > 31);
        do {
            System.out.println("Introduce un mes válido:");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);
        do {
            System.out.println("Introduce un año superior a 1900:");
            anno = sc.nextInt();
        } while (anno < 1900);
        LocalDate fechaNacimiento = crearFecha(dia, mes, anno);
        System.out.printf("Fecha nacimiento %s%n",
                devolverFechaEnCastellano(fechaNacimiento));
        LocalDate fechaActual = obtenerFechaActual();
        System.out.printf("Fecha actual %s%n",
                devolverFechaEnCastellano(fechaActual));
        int annos = calcularAnnosTranscurridoEntreDosFechas(
                fechaNacimiento, fechaActual);
        System.out.printf("Tienes %d años%n", annos);

    }





}
