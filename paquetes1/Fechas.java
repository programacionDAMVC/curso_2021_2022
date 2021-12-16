package es.javautodidacta;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

public class Fechas {
    
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
    }
}
