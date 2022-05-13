package controlador.logueo;

import controlador.reservas.ControladorReservas;
import modelo.dao.usuario.Usuario;
import modelo.dao.usuario.UsuarioDAO;
import vista.logueo.Login;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Arrays;

public class ControladorLogin {
    private UsuarioDAO modelo;
    private Login vista;

    public ControladorLogin(UsuarioDAO modelo, Login vista) {
        this.modelo = modelo;
        this.vista = vista;
        inicializarVista();
    }

    private void inicializarVista() {
        vista.getLabelError().setText("");
        vista.getVentanaLogin().setVisible(true);
    }
    public void inicializarControlador() {
        vista.getBotonSalir().addActionListener(actionEvent -> salirApp());
        vista.getBotonLoguear().addActionListener(actionEvent -> loguearUsuario());
    }

    private void loguearUsuario() {
        vista.getLabelError().setText("");
        String email    = vista.getTextEmail().getText().trim();
        char[] cPassword = vista.getTextPassword().getPassword();
        String sPassword = new String(cPassword);
        try {
            Usuario usuario = modelo.loguearUsuarios(email, sPassword.trim());
            if (usuario == null)
                vista.getLabelError().setText("Ese usuario no existe");
            //System.out.println(usuario);
            else {
                vista.getVentanaLogin().setVisible(false);
                new ControladorReservas(usuario).inicializarControlador();
            }
            //crear una ventana con una etiqueta y esa etiqueta
            //son los datos del usuario
            //crear una vista en reservas
            //crear el controlador, exactamente igual que el de login
            //ventana login que no se vea
            //arrancar el controlador de reservas que pinte la interface de reservas
        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "Error en la apliación",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        // System.out.println(email + " " + sPassword);
    }

    private void salirApp() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de salir?",
                "SALIR", JOptionPane.YES_NO_OPTION);
        if (opcion == 0)
            System.exit(0);
    }

}
