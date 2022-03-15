package teoria.salida.nivelCaracter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

//SIEMPRE QUE TENGAMOS QUE ESCRIBIR FICHEROS DE TEXTOS
//LA CLASE PRINTWRITER ES UNA BUENA OPCIÓN
public class Ejemplo2 {
    public static void main(String[] args) {
        String path = "FICHEROS/caracteres2.txt";
        String cadena1 = "En electrónica, un amplificador buffer es un dispositivo que acopla impedancias en un circuito. En su forma más sencilla es un complemento funcionando como seguidor. Por consiguiente el voltaje y la corriente no disminuyen en el circuito, ya que este toma el voltaje de la fuente de alimentación del operacional y no de la señal que se está introduciendo, por lo que si una señal llegara con poca corriente, el circuito seguidor compensaría esa pérdida con la fuente de alimentación del amplificador operacional, ya sea este unipolar o bipolar.";
        String cadena2 = "En el ámbito de los Sistemas de Información Geográfica";
        try (PrintWriter out = new PrintWriter(path)) {
            out.println(cadena1);
            out.println(cadena2);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("fin de programa");
    }
}
