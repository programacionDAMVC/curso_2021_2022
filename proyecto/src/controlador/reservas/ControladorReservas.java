package controlador.reservas;

import modelo.dao.reserva.ReservaDAO;
import modelo.dao.reserva.ReservaDAOImpl;
import modelo.dao.usuario.Usuario;
import modelo.dao.usuario.UsuarioDAO;
import vista.logueo.Login;
import vista.reservas.Reserva;

public class ControladorReservas {
    private ReservaDAO modelo;
    private Reserva vista;
    private Usuario usuario;

    public ControladorReservas(Usuario usuario) {
        this.modelo = new ReservaDAOImpl();
        this.vista = new Reserva();
        this.usuario = usuario;
        inicializarVista();
    }

    private void inicializarVista() {
        vista.getVentanaReservas().setVisible(true);
        vista.getLabelPrueba().setText(usuario.toString());
    }
    public void inicializarControlador() {

    }
}
