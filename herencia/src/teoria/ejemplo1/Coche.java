package teoria.ejemplo1;

public class Coche extends Vehiculo{

    private TipoVehiculo tipoVehiculo;
    private boolean descapotable;

    public Coche(String modelo, int numeroPasajeros, String propietario,
                 TipoVehiculo tipoVehiculo, boolean descapotable) {
        super(modelo, 4, numeroPasajeros, propietario);
        this.tipoVehiculo = tipoVehiculo;
        this.descapotable = descapotable;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return String.format("%s, Coche tipo de coche %s, descapotable %b",
               super.toString() ,tipoVehiculo, descapotable);
    }
}
