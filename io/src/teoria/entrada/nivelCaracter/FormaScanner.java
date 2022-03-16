package teoria.entrada.nivelCaracter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FormaScanner {
    public static void main(String[] args) {
        File inFile  = new File("FICHEROS/coches.txt");
        File outFile = new File("FICHEROS/coches_backup_scanner.txt");
        if (!inFile.exists()) {
            System.out.println("no existe el fichero");
            return;
        }
        try (Scanner sc = new Scanner(inFile, "ISO-8859-1");
             PrintWriter out = new PrintWriter(outFile)) {
            while (sc.hasNextLine()){
                String linea = sc.nextLine();
                System.out.println(linea);
                out.println(linea);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
