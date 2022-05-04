package layout;

import javax.swing.*;
import java.awt.*;

public class GUIBorderLayout {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {

        JFrame ventana = new JFrame();
        ventana.setTitle("Ventana calculadora");
        ventana.setSize(400,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        Container contenedor = ventana.getContentPane();
        BorderLayout layout = new BorderLayout();
        contenedor.setLayout(layout);
        JLabel labelLogin = new JLabel("login");
        JTextField textoLogin = new JTextField(10);
        JPanel panelNorte = new JPanel();
        panelNorte.add(labelLogin);
        panelNorte.add(textoLogin);
        contenedor.add(panelNorte, BorderLayout.NORTH);
      /*  contenedor.add(labelLogin, BorderLayout.NORTH);
        contenedor.add(textoLogin, BorderLayout.NORTH);*/
        JButton botonAceptar = new JButton("Aceptar");
        contenedor.add(botonAceptar, BorderLayout.WEST);
        JTextArea area = new JTextArea("Hello", 5, 40);
        contenedor.add(area, BorderLayout.CENTER);
        JButton botonSalir = new JButton("Exit");
        contenedor.add(botonSalir, BorderLayout.EAST);
        JPanel panelSur = new JPanel();
        JLabel labelAutor = new JLabel("Autor de la aplicación");
        panelSur.add(labelAutor);
        FlowLayout layoutSur = new FlowLayout(FlowLayout.RIGHT);
        panelSur.setLayout(layoutSur);
        contenedor.add(panelSur, BorderLayout.SOUTH);
       // contenedor.add(labelAutor, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}
