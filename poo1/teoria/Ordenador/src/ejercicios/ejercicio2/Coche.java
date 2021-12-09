package ejercicios.ejercicio2;

public class Coche {
    //atributos
    private float cantidadCombustible = 5;
    private float consumoAlos100 = 7;
    //constructores (no creo ninguno porque así lo dice las especificaciones)
    //métodos
    //método para añadir combustible al depósito
    public float echarCombustible(float cantidad) {
        cantidadCombustible += cantidad;
        return cantidadCombustible;
    }
    //conocer la cantidad de combustible
    public float getCantidadCombustible() {
        return cantidadCombustible;
    }
    //conocer los km que puede realizar el coche
    public float saberAutonomia() {
        return cantidadCombustible * 100 / consumoAlos100;
    }
}
