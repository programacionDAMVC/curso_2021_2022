package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Comunidad {

    private String direccion;
    private List<Persona> personas = new ArrayList<>();

    public String getDireccion() {
        return direccion;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean annadirPersona(Persona persona){
        return  personas.add(persona);
    }
    //NOMBRE COMUNIDAD  \n
    //1. vecino 1          \n
    //2. vecino 2          \n
    //3. vecino 3          \n
    // .....
    //n. vecino n          \n


    @Override
    public String toString() {
        return String.format("COMUNIDAD: %S%n%s",direccion, listarVecinos());
    }

    private String listarVecinos() {
        int contador = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Persona persona: personas) {
            stringBuilder.append(++contador);
            stringBuilder.append(". ");
            stringBuilder.append(persona);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
