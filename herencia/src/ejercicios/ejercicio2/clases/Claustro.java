package ejercicios.ejercicio2.clases;

import java.util.ArrayList;
import java.util.List;

public class Claustro {
    //atributos nombre del claustro, colección profesores
    private String nombreClaustro;
    private List<Profesor> listaProfesores;
    //constructor

    public Claustro(String nombreClaustro) {
        this.nombreClaustro = nombreClaustro;
        this.listaProfesores = new ArrayList<>();
    }

    public Claustro(String nombreClaustro, List<Profesor> listaProfesores) {
        this.nombreClaustro = nombreClaustro;
        this.listaProfesores = listaProfesores;
    }

    public Claustro() {
    }

    //getters los necesarios, setters  y toString
    public String getNombreClaustro() {
        return nombreClaustro;
    }

    public void setNombreClaustro(String nombreClaustro) {
        this.nombreClaustro = nombreClaustro;
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    //nombre del claustro y número de profesores
    @Override
    public String toString() {
        return String.format("Claustro: %S con %d profesores",
                nombreClaustro, listaProfesores.size());
    }
    //métodos: añadir profesores al claustro, quitar profesores al claustro, buscar profesor

    public boolean annadirProfesor(Profesor profesor) {
        return listaProfesores.add(profesor);
    }
    public boolean eliminarProfesor(Profesor profesor) {
        return listaProfesores.remove(profesor);
    }
    public Profesor buscarProfesor(String dni) {
        /*Profesor profesorABuscar = null;
        for (Profesor profesor: listaProfesores) {
            if (profesor.getDni().equals(dni)) {
                profesorABuscar = profesor;
                break;
            }
        }
        return profesorABuscar;*/
        for (Profesor profesor: listaProfesores) {
            if (profesor.getDni().equals(dni))
                return profesor;
        }
        return null;
    }
}