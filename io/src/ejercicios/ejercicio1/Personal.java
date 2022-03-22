package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Personal {
    private List<Persona> personas = new ArrayList<>();
    //constructores 2

    public Personal(List<Persona> personas) {
        this.personas = personas;
    }

    public Personal() {
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public boolean anndirPersona(Persona persona){
        return personas.add(persona);
    }

    public List<Persona> obtenerPersonasDeUnPais(String pais){
        List<Persona> listaPersonasPais = new ArrayList<>();
        for (Persona persona : personas) {
            if (persona.getPais().equalsIgnoreCase(pais))
                listaPersonasPais.add(persona);
        }
        return listaPersonasPais;
    }

    public boolean eliminarPersonaPorEmail(String email) {
        for (Persona persona : personas) {
            if (persona.getEmail().equalsIgnoreCase(email))
                return personas.remove(persona);
           }
        return false;
    }
}
