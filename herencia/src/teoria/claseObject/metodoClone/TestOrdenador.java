package teoria.claseObject.metodoClone;

import java.util.ArrayList;
import java.util.List;

public class TestOrdenador {
    public static void main(String[] args) {
        List<Ordenador> listaOrdenadores = new ArrayList<>();
        Ordenador ordenadorPlantilla = new Ordenador("HP", 8, 256); //plantilla
        Ordenador ordenadorProfesor = null;
        try {
             ordenadorProfesor = (Ordenador) ordenadorPlantilla.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // System.out.printf("%s%n", ordenadorPlantilla);
        listaOrdenadores.add(ordenadorProfesor);
        Ordenador ordenador2 = new Ordenador("HP", 8, 256);
        listaOrdenadores.add(ordenador2);
        Ordenador ordenador3 = ordenadorPlantilla;
        listaOrdenadores.add(ordenador3);
        Ordenador ordenador4 = ordenadorPlantilla;
        listaOrdenadores.add(ordenador4);
        Ordenador ordenador5 = ordenadorPlantilla;
        listaOrdenadores.add(ordenador5);
        //ampliamos la RAM del equipo del profesor 8G mas
        ordenadorProfesor.ampliarRAM(8);  //solo queremos ampliar memoria del primero equipo
        //ampliamos la RAM del resto 4G mas
        ordenadorPlantilla.ampliarRAM(4);
        mostrarOrdenadores(listaOrdenadores);


    }
    private static void mostrarOrdenadores (List<Ordenador> lista) {
        /*for (Ordenador ordenador: lista) {
            System.out.println(lista);
        }*/
        //lista.forEach(System.out::println);
        lista.forEach(ordenador -> System.out.println(ordenador));
    }
}
