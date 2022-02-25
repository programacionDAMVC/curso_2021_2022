package teoria.interfaces.geometria18;

public class FiguraCircular implements Figura {

    private int ejeMayor;
    private int ejeMenor;

    public FiguraCircular(int ejeMayor, int ejeMenor) {
        int[] ordenado = Figura.ordenarValores(ejeMayor, ejeMenor);
        this.ejeMayor = ordenado[0];
        this.ejeMenor = ordenado[1];
    }

    public int getEjeMayor() {
        return ejeMayor;
    }

    public int getEjeMenor() {
        return ejeMenor;
    }

    @Override
    public double calcularArea() {
        return PI * ejeMayor * ejeMenor;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * Math.sqrt((Math.pow(ejeMayor, 2) + Math.pow(ejeMenor, 2)) / 2.0);
    }

    @Override
    public String nombrar() {
        return "Figura circular";
    }
}
