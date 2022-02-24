package teoria.introduccion.interfaces.geometria;

public class Elipse extends FiguraCircular{

    public Elipse(int ejeMayor, int ejeMenor) {
        super(ejeMayor, ejeMenor);
    }

    @Override
    public String nombrar() {
        return String.format("Elipse de eje mayor %d y eje menor %d",
                getEjeMayor(), getEjeMenor());
    }
}
