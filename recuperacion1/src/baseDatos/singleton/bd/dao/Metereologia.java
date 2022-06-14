package baseDatos.singleton.bd.dao;

import java.time.LocalDate;

public class Metereologia {
    private LocalDate fecha;
    private float precipitaciones;
    private float temperaturaMaxima;
    private float temperaturaMinima;

    public Metereologia(LocalDate fecha, float precipitaciones,
                        float temperaturaMaxima, float temperaturaMinima) {
        this.fecha = fecha;
        this.precipitaciones = precipitaciones;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;

    }

    public LocalDate getFecha() {
        return fecha;
    }

   /* public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }*/

    public float getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(float precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    public float getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(float temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public float getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(float temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
    //31-12-2018|0.0|15.1|3.7
    //2018-12-31,0.0,15.1,3.7
    //31-12-2018;0.0;15.1;3.7

    @Override
    public String toString() {
        return String.format("%d/%d/%d;%.1f;%.1f;%.1f", fecha.getDayOfMonth(), fecha.getMonthValue(),
                fecha.getYear(),precipitaciones, temperaturaMaxima,temperaturaMinima);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Metereologia that = (Metereologia) o;

        return fecha.equals(that.fecha);
    }

    @Override
    public int hashCode() {
        return fecha.hashCode();
    }
}
