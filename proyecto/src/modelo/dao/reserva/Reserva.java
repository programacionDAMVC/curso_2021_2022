package modelo.dao.reserva;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fecha;
    private int duracion;
    private int horaEntrada;
    private TipoReserva tipoReserva = TipoReserva.GUIADA;
    private int idUsario;

    public Reserva() {
    }

    public Reserva(LocalDate fecha, int duracion, int horaEntrada, int idUsario) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.horaEntrada = horaEntrada;
        this.idUsario = idUsario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public TipoReserva getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(TipoReserva tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public int getIdUsario() {
        return idUsario;
    }

   /* public void setIdUsario(int idUsario) {
        this.idUsario = idUsario;
    }*/

    @Override
    public String toString() {
        return String.format("%s,%d,%d,%s,%d",
                fecha, duracion, horaEntrada, tipoReserva, idUsario);

    }
}
