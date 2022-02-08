package teoria.ejemplo1;

import java.time.LocalDate;

public class Vehiculo {
    private int numeroRuedas;
    private int numeroPasajeros;
    private String propietario;
    private LocalDate fechaAdquisicion;

    public Vehiculo(int numeroRuedas, int numeroPasajeros, String propietario) {
        this.numeroRuedas = numeroRuedas;
        this.numeroPasajeros = numeroPasajeros;
        this.propietario = propietario;
        this.fechaAdquisicion = LocalDate.now();
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public String getPropietario() {
        return propietario;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    //vehiculo ford fiesta, de 4 ruedas, de 5 pasajeros, adquirido el 12-12-2000
    @Override
    public String toString() {
        return null;
    }
}
