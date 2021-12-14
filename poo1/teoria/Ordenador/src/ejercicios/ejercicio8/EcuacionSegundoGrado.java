package ejercicios.ejercicio8;
/**
 * ecuación segundo grado: a · x² + b · x + c = 0
 * Resoluble si b² - 4 · a · c >=0, la ráiz cuadrada debe ser positiva o cero
 * x1 = (-b + Math.sqrt(b² - 4 · a·c) / (2·a)
 * x2 = (-b - Math.sqrt(b² - 4 · a·c) / (2·a)
 */
public class EcuacionSegundoGrado {
    //atributos: a, b y c
    private double a;
    private double b;
    private double c;
    //constructor
    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //métodos se puede añadir -si quisieramos- getters y setters
    ////esResoluble
    public boolean esResoluble() {
        return b * b - 4 * a * c >= 0;
    }
    ////calcularX1
    public double calcularX1(){
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    ////calcularX2
    public double calcularX2(){
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
