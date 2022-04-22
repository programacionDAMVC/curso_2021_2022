package modelo.dao.reserva;

import java.time.LocalDate;

public class Reserva {

    private LocalDate fecha;
    private int duracion;
    private int horaEntrada;
    private TipoReserva tipoReserva = TipoReserva.GUIADA;
    private String dniUsuario; //lo puedo obtener del usuario logueado

    public Reserva() {
    }

    public Reserva(LocalDate fecha, int duracion, int horaEntrada, String dniUsuario) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.horaEntrada = horaEntrada;
        this.dniUsuario = dniUsuario;
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

    public String getDniUsuario() {
        return dniUsuario;
    }

/* public void setIdUsario(int idUsario) {
        this.idUsario = idUsario;
    }*/

    @Override
    public String toString() {
        return String.format("%s,%d,%d,%s,%s",
                fecha, duracion, horaEntrada, tipoReserva, dniUsuario);

    }
}
