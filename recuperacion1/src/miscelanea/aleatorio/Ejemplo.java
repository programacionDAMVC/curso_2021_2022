package miscelanea.aleatorio;

import java.util.Random;

public class Ejemplo {
    public static void main(String[] args) {
        //primera forma, usando de la clase Math el método random
        //OJO, devuelve un double entre 0.0 y 1.0, último exclusive
        for (int i = 1; i < 16; i++) {
            System.out.printf("%d.- %.3f%n", i, Math.random());
        }
        //usando la clase Random
        //tiene un método muy interesante, que es nextInt(v) que te da desde 0 a v exclusivo, y son enteros
        System.out.println("-----------------------------------------");
        Random random = new Random();
        for (int i = 1; i < 16; i++) {
            System.out.printf("%d.- %d%n", i, random.nextInt(11));
        }
    }
}
