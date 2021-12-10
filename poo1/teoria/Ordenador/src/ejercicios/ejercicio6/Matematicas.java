package ejercicios.ejercicio6;

/**
 * Clase con métodos para resolver operaciones matemáticas,
 * ejemplo el cálculo de la raíz cuadrada...
 * @author Manuel Molino
 * @version 1.0.0
 */
public class Matematicas {
    /**
     * Un metodo que devuelva la raiz cuadrada de un número.
     * @param numero de valor double, para realizar el cálculo
     * @return la raíz cuadrada de dicho número
     */
    public static double calcularRaizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    /**
     * Un metodo que devuelva la raiz cúbica de un número.
     * @param numero de valor double, para realizar el cálculo
     * @return la raíz cúbica de dicho número
     */
    public static double calcularRaizCubica(double numero) {
        return Math.cbrt(numero);
    }

    /**
     * Un metodo que redondee el número de tipo double a entero
     * @param numero de valor double, para realizar el cálculo
     * @return el valor redondeado de dicho número, si es negativo
     * devuelve el valor positivo.
     */
    public static int redondearAPositivoNumero(double numero) {
        return Math.abs((int) Math.round(numero));
    }

    /**
     * Un metodo que devuelva número aleatorios en el intervalo de 0 y numero
     * @param numero de valor double, para realizar el cálculo
     * @return valor entero redondeado entre 0 y el número redondeado
     */
    public static int devolverAleatorioDe0ANumero(double numero) {
        return (int) Math.round (Math.random() * Math.abs(numero));
    }
}
