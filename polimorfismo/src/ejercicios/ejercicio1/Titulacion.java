package ejercicios.ejercicio1;

public enum Titulacion {

    SUPERIOR(500), MEDIO(400), CICLO_FORMATIVO(300);
    private double extra;

    Titulacion(double extra) {
        this.extra = extra;
    }

    public double getExtra() {
        return extra;
    }
}
