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
            if (listaPoligonos.size() == 0)
                return;

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
        mostrarDatosPoligonosOrdenadorPorNumeroLados();
        System.out.println("=============================================");
        //seleccionamos aleatoriamente un poligono y mostramos cuantos iguales hay
        seleccionarAleatorioyMostrarIguales();
    }

    private static void mostrarDatosPoligonosOrdenadorPorNumeroLados() {
        listaPoligonos.sort(new Comparator<PoligoRegular>() {
            @Override
            public int compare(PoligoRegular p1, PoligoRegular p2) {
                return p1.numeroLados - p2.numeroLados;
            }
        });
        mostrarDatosPoligonos();
    }

    private static void crearListaPoligonosRegulares(String path) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));

        /*while (sc.hasNextLine()){
            String linea = sc.nextLine();
            System.out.println(linea);
        }*/
        sc.nextLine(); //quito la cabecera
        //leer línea a línea del fichero
        //mostramos con sout las líneas del fichero
        while (sc.hasNextLine()){
            String linea = sc.nextLine();
          //  System.out.println(linea);
            //las líneas tienen el formato 3,9   6,8 ...
            //indican el nº de lados y la longitud de lado
            //ejemplo 3,9: tres lados de longitud 9
            //sirve para crear un triángulo equilatero
            //ejemplo 6,8: seis lados de longitud 8
            //sirve para crear un hexágo de longitud 8
            //cada linea se desmuneza en dos datos, nº lador y longitud
            //usando el método split de la clase String
            String[] tokens = linea.split(",");
            //en función del primer campo creo un tipo de objeto
            //ejemlo 3,9 hacemos new TrianguloEquilatero(9)
            //ejemplo 6,8 new Hexagon(8)
            //tokens[0] nos dice el nº de lados, tokens[1] la longitud de lado, como entero
            if (!tokens[1].matches("[1-9][0-9]*")) //ejem. 6,nueve
                continue; //las línea de abajo se dejan sin ejecutar
            int valorLado = Integer.parseInt(tokens[1]);
            switch (tokens[0]) {
                case "3" :
                    listaPoligonos.add(new TrianguloEquilatero(valorLado));
                    break;
                case "4" :
                    listaPoligonos.add(new Cuadrado(valorLado));
                    break;
                case "6" :
                    listaPoligonos.add(new Hexagono(valorLado));
                    break;
                default:
                    break;
            }
            //lo añadimos a la lista
        }
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
