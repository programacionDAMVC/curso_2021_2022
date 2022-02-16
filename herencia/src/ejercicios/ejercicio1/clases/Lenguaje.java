package ejercicios.ejercicio1.clases;

public enum Lenguaje {

    JAVA(10), JAVASCRIPT(20), PYTHON(30), KOTLIN(40); //constantes con su valor

    private int complemento;

    Lenguaje(int complemento) {
        this.complemento = complemento;
    }

    public int getComplemento() {
        return complemento;
    }
}
