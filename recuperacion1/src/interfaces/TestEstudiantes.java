package interfaces;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TestEstudiantes {
    public static void main(String[] args) {
        List<Estudiante> lista = new ArrayList<>();
        Estudiante estudiante1 = new EstudianteCiclo("manuel",
                "molina garcía", 7.3, EspecialidadesCiclos.AC);
        lista.add(estudiante1);
        Estudiante estudiante2 = new EstudianteCiclo("manuela",
                "molinos gómez", 5.3, EspecialidadesCiclos.DAM);
        lista.add(estudiante2);
        Estudiante estudiante3 = new EstudianteBachillerato("marisa",
                "menéndez garcía", 7.3, EspecialidadesBachillerato.MIXTO);
        lista.add(estudiante3);
        Estudiante estudiante4 = new EstudianteBachillerato("lara",
                "muñoz muñoz", 2.3, EspecialidadesBachillerato.CIENCIAS);
        lista.add(estudiante4);

        mostrarDatosLista(lista);
        try {
            Helper.guardarDatosFichero(lista);
            Helper.leerDatosFichero("datos.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarDatosLista(List<Estudiante> lista) {
        for (Estudiante estudiante: lista) {
            System.out.println(estudiante.mostrarDatos());
        }
    }
}
