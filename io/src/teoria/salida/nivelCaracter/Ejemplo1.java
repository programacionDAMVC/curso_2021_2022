package teoria.salida.nivelCaracter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) {
        File outFile = new File("FICHEROS/caracteres1.txt");
        String cadena1 = "En electrónica, un amplificador buffer es un dispositivo que acopla impedancias en un circuito. En su forma más sencilla es un complemento funcionando como seguidor. Por consiguiente el voltaje y la corriente no disminuyen en el circuito, ya que este toma el voltaje de la fuente de alimentación del operacional y no de la señal que se está introduciendo, por lo que si una señal llegara con poca corriente, el circuito seguidor compensaría esa pérdida con la fuente de alimentación del amplificador operacional, ya sea este unipolar o bipolar.";
        String cadena2 = "    En el ámbito de los Sistemas de Información Geográfica, un buffer o zona de influencia es el polígono que encierra el área de dominio resultante de dar una determinada distancia en torno a un objeto geográfico. Se utiliza frecuentemente para procesos de análisis espacial.";
        //no hay que obtener la colección de bytes (byte[])
        try (BufferedWriter out = new BufferedWriter(new FileWriter(outFile))) {
            out.write(cadena1);
            out.newLine();
            out.write(cadena2);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Escritos %d bytes en el fichero %s%n",
                outFile.length(), outFile);

    }
}
