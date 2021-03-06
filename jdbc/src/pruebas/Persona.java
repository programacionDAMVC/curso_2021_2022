package pruebas;

public class Persona {
    //nombre y edad
    private String nombrePersona;
    private int edad;
    private String dni;

    public Persona(String nombrePersona, int edad, String dni) {
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return String.format("%S;%d;%s", nombrePersona, edad, dni);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        return dni != null ? dni.equals(persona.dni) : persona.dni == null;
    }

    @Override
    public int hashCode() {
        return dni != null ? dni.hashCode() : 0;
    }
}
