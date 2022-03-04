package ejercicios.ejercicio1;

public enum Grado {
    PRIMERA(100), SEGUNDA(150), TERCERA(200);
    private double extra;

    Grado(double extra) {
        this.extra = extra;
    }

    public double getExtra() {
        return extra;
    }
}
