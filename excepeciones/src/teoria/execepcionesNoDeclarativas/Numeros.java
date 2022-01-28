package teoria.execepcionesNoDeclarativas;

public class Numeros {
    public static void main(String[] args) {
        /*int numerador   = 10;
        int denominador = 0;
        int division = numerador / denominador;
        System.out.printf("%d / %d = %d%n", numerador, denominador, division);*/
        float numerador = 10.1f;
        float denominador = 10;
        float division = numerador / denominador;
        if (Float.isInfinite(division))
            System.out.println("División por cero");
        else
            System.out.printf("%.2f / %.2f = %.2f%n", numerador, denominador, division);
    }
}
