package teoria.generalidades;

public class EjemploFinal {

    private static double PI = 3.1416;
    private final String nombre;
    private final int edad;

    public EjemploFinal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
