package ejercicios.tests;

import ejercicios.ejercicio3.Libro;

import java.util.ArrayList;

public class TestLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setIsbn("9780744525021");
        libro1.setTitulo("El Quijote");
        libro1.setAutor("Cervantes");
        libro1.setEditorial("SM");
        libro1.setNumeroEjemplares(5);
        System.out.println(libro1);

        Libro libro2 = new Libro("9788420617534", "El lazarillo de Tormes",
                "anónimo", "Anaya", 25);
        System.out.println(libro2.toString());
        //creamos una lista de objetos Libro y añadimos los dos anteriores
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        System.out.println(libros);
        //mostramos los isbn y el número de ejemplares:  isbn-25 de la lista libros
        mostraISBNyEjemplares(libros);
     //   mostrarISBNyEjemplares(libros);
    }

    private static void mostraISBNyEjemplares(ArrayList<Libro> libros) {
        for (Libro libro: libros) {
            System.out.printf("isbn: %s, nº ejemplares %d%n",
                    libro.getIsbn(), libro.getNumeroEjemplares());
        }
    }

    //método que muestra isbn y nº de ejemplares
    /*public static void mostrarISBNyEjemplares(ArrayList<Libro> libros) {
        for (Libro libro: libros) {
            System.out.printf("isbn: %s, nº ejemplares %d%n",
                    libro.getIsbn(), libro.getNumeroEjemplares());
        }
    }*/
}
