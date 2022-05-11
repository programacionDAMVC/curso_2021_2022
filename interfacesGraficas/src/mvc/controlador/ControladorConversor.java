package mvc.controlador;

import mvc.helper.Comprobador;
import mvc.modelo.Moneda;
import mvc.vista.VistaConversor;

import javax.swing.*;
import java.awt.*;

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
        vista.getBotonConvertirADolares().addActionListener(actionEvent -> convertirADolares());
        vista.getBotonLimpiar().addActionListener(actionEvent -> limpiarDisplay());
    }

    private void limpiarDisplay() {
        vista.getTextoCantidad().setText("0");
        vista.getMensaje().setForeground(Color.GREEN);
        vista.getMensaje().setText("resultado de la conversión");
    }

    private void convertirADolares() {
        String sCantidad = vista.getTextoCantidad().getText().trim();
        sCantidad = sCantidad.replace(',', '.');
        System.out.println(sCantidad);
        if ( Comprobador.esUnFloat(sCantidad) ) {
            Float fCantidad = Float.parseFloat(sCantidad);
            modelo.setCantidad(fCantidad);
            float dolares = modelo.convertirADolares();
            String mensaje = String.format("%.2f $", dolares);
            vista.getMensaje().setForeground(Color.RED);
            vista.getMensaje().setText(mensaje);
            vista.getTextoCantidad().setText(String.format("%.2f €", fCantidad));

        } else {
            JOptionPane.showInternalMessageDialog(null, "Valor no válido", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
            limpiarDisplay();
        }
    }

    private void convertirAEuros() {
        String sCantidad = vista.getTextoCantidad().getText().trim();
        sCantidad = sCantidad.replace(',', '.');
        System.out.println(sCantidad);
        if ( Comprobador.esUnFloat(sCantidad) ) {
            Float fCantidad = Float.parseFloat(sCantidad);
            modelo.setCantidad(fCantidad);
            float euros = modelo.convertirAEuros();
            String mensaje = String.format("%.2f €", euros);
            vista.getMensaje().setForeground(Color.BLUE);
            vista.getMensaje().setText(mensaje);
            vista.getTextoCantidad().setText(String.format("%.2f $", fCantidad));
        } else {
            JOptionPane.showInternalMessageDialog(null, "Valor no válido", "INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
            limpiarDisplay();
        }
    }

    private void salirAplicacion() {
        System.exit(0);
    }
}
