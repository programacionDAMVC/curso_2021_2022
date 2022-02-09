package teoria.ejemplo1;

public class Motocicleta extends Vehiculo{
    private TipoCarnet tipoCarnet;
    private int cilindrada;

    public Motocicleta(String modelo,  int numeroPasajeros, String propietario,
                       TipoCarnet tipoCarnet, int cilindrada) {
        super(modelo, 2, numeroPasajeros, propietario);
        this.tipoCarnet = tipoCarnet;
        this.cilindrada = cilindrada;
    }

    public TipoCarnet getTipoCarnet() {
        return tipoCarnet;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return String.format("%s, Motocicleta de carnet %s, de cilindrada %d",
                super.toString(), tipoCarnet, cilindrada);
    }
}
