package teoria.interfaces.geometria18;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio, radio);
    }

    @Override
    public String nombrar() {
        return String.format("Círculo de radio %d", getEjeMayor());
    }

}
