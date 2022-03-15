package teoria.salida.nivelCaracter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class EjemploCoche {
    public static void main(String[] args) {
        //creamos una lista de coches
        List<Coche> lista = new ArrayList<>();
        //creamos tres coches
        Coche coche1 = new Coche("1234QQQ", "seat", "león");
        //añadimos a la lista de coches
        lista.add(coche1);
        Coche coche2 = new Coche("3214JKN", "mercedes", "amg");
        lista.add(coche2);
        Coche coche3 = new Coche("6851JAR", "bmw", "m4");
        lista.add(coche3);
        String path = "FICHEROS/coches.txt";
        escribirFicheroDatosCoche(lista, path);

    }
    //crear un método con argumentos la lista y la ruta del fichero
    //que haga:
    //escribir en un fichero con formato
    //tres columnas
    //1234GTX    seat    ibiza
    //cada columna alineadas derecha con 15
    //usamos printf
    private static void escribirFicheroDatosCoche(List<Coche> lista, String path) {
        try (PrintWriter out = new PrintWriter(path, "ISO-8859-1")) {
            for (Coche coche: lista) {
                out.printf("%-15s%-15s%-15s%n",
                        coche.getMatricula(), coche.getMarca(), coche.getModelo());
                out.flush();
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("Escrito fichero");
    }
}
