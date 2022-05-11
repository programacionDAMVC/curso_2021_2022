package mvc.controlador;

import mvc.helper.Comprobador;
import mvc.modelo.Moneda;
import mvc.vista.VistaConversor;

import javax.swing.*;

public class ControladorConversor {
    private VistaConversor vista;
    private Moneda modelo;

    public ControladorConversor(VistaConversor vista, Moneda modelo) {
        this.vista = vista;
        this.modelo = modelo;
        inicilizarLaVista();
    }

    private void inicilizarLaVista() {
        vista.getTextoCantidad().setText("0");
    }

    public void initController() {
        vista.getBotonSalir().addActionListener( actionEvent -> salirAplicacion());
        vista.getBotonConvertirAEuros().addActionListener(actionEvent -> convertirAEuros());
    }

    private void convertirAEuros() {
        String sCantidad = vista.getTextoCantidad().getText();
        sCantidad = sCantidad.replace(',', '.');
        System.out.println(sCantidad);
        if ( Comprobador.esUnFloat(sCantidad) ) {
            Float fCantidad = Float.parseFloat(sCantidad);
            modelo.setCantidad(fCantidad);
            float euros = modelo.convertirAEuros();
            String mensaje = String.format("%.2f €", euros);
            vista.getMensaje().setText(mensaje);
        } else {
            JOptionPane.showInternalMessageDialog(null, "Valor no válido", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void salirAplicacion() {
        System.exit(0);
    }
}
