package teoria.execepcionesNoDeclarativas.nulos;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    //constructores


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format("%S, edad: %d", nombre, edad);
    }
}
