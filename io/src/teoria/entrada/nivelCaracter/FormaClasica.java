package teoria.entrada.nivelCaracter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FormaClasica {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(
                new FileReader(
                        "FICHEROS/coches.txt", StandardCharsets.ISO_8859_1));
             PrintWriter out = new PrintWriter("FICHEROS/coches_backup.txt")) {
            int caracter, contador = 0;
            while ((caracter = in.read()) != -1){
                System.out.print((char) caracter);
                contador++;
                out.write(caracter);
                out.flush();
                //quiero hacer una copia de seguridad, la llamo coches_backup.txt
            }
            System.out.printf("Leidos %d caracteres%n", contador);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
