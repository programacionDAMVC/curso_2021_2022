package ejercicios.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TestPoligonoRegular1 {

    private static List<PoligoRegular> listaPoligonos = new ArrayList<>();

    public static void main(String[] args) {
        //crearListaPoligonosRegulares();
        try {
            crearListaPoligonosRegulares("FILES/figuras.csv");

        } catch (FileNotFoundException e) {
            System.err.printf("No existe el fichero con los polígonos");
            return;
        }
        //mostramos polígonos antes de ordenar
        mostrarDatosPoligonos();
        //ordenamos los polígonos, por criterio de ordenación
        Collections.sort(listaPoligonos);
        System.out.println("=============================================");
        //mostramos polígonos después de ordenar
        mostrarDatosPoligonos();
        System.out.println("=============================================");
        //seleccionamos aleatoriamente un poligono y mostramos cuantos iguales hay
        seleccionarAleatorioyMostrarIguales();
    }

    private static void crearListaPoligonosRegulares(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        //leer línea a línea del fichero
        //mostramos con sout las líneas del fichero
        //una vez hecho esto, mostrar igualmente, pero sin la cabecera
    }

    private static void seleccionarAleatorioyMostrarIguales() {
        Random random = new Random();
        int posicionAleatoria = random.nextInt(listaPoligonos.size());
        PoligoRegular pAleatorio = listaPoligonos.get(posicionAleatoria);
        System.out.printf("Seleccionado polígono %s%n", pAleatorio);
        int contador = 0;
        for (PoligoRegular poligoRegular: listaPoligonos) {
            if (poligoRegular.equals(pAleatorio))
                contador++;
        }
        System.out.printf("Encontrados %d iguales", (contador - 1));
    }

    private static void mostrarDatosPoligonos() {
        listaPoligonos.forEach(System.out::println);
        /*for (PoligoRegular poligoRegular: listaPoligonos) {
            System.out.println(poligoRegular);
        }*/
    }

    private static void crearListaPoligonosRegulares() {

        PoligoRegular tEquilatero1 = new TrianguloEquilatero(3);
        PoligoRegular tEquilatero2 = new TrianguloEquilatero(6);
        PoligoRegular cuadrado1 = new Cuadrado(1);
        PoligoRegular cuadrado2 = new Cuadrado(5);
        PoligoRegular hexagono1 = new Hexagono(2);
        PoligoRegular hexagono2 = new Hexagono(3);
        PoligoRegular hexagono3 = new Hexagono(3);
        PoligoRegular hexagono4 = new Hexagono(3);
        PoligoRegular hexagono5 = new Hexagono(3);
        PoligoRegular hexagono6 = new Hexagono(3);

        listaPoligonos.add(tEquilatero1); listaPoligonos.add(tEquilatero2);
        listaPoligonos.add(cuadrado1); listaPoligonos.add(cuadrado2);
        listaPoligonos.add(hexagono1); listaPoligonos.add(hexagono2);
        listaPoligonos.add(hexagono3); listaPoligonos.add(hexagono4);
        listaPoligonos.add(hexagono5); listaPoligonos.add(hexagono6);



    }
}
