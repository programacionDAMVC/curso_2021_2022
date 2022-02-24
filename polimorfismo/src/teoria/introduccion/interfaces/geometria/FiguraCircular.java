package teoria.introduccion.interfaces.geometria;

public class FiguraCircular implements Figura{

    private int ejeMayor;
    private int ejeMenor;

    public FiguraCircular(int ejeMayor, int ejeMenor) {
        if (ejeMayor < ejeMenor){   // 3 y 5 eM = 3 em = 5
            int tmp = ejeMayor;  // tmp = 3
            ejeMayor = ejeMenor; // eM = 5
            ejeMenor = tmp;  //em = 3
        }
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
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
