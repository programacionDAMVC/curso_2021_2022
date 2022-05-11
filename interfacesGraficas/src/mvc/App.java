package mvc;

import mvc.controlador.ControladorConversor;
import mvc.modelo.Moneda;
import mvc.vista.VistaConversor;

public class App {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Moneda modelo = new Moneda();
                VistaConversor vista = new VistaConversor();
                ControladorConversor controlador  =
                        new ControladorConversor(vista, modelo);
                controlador.initController();
            }
        });
    }
}
