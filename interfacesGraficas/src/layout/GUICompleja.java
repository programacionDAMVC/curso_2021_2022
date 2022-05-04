package layout;

import javax.swing.*;
import java.awt.*;

public class GUICompleja {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame ventana = new JFrame();
        ventana.setTitle("Ventana compleja");
        ventana.setSize(600,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        Container contenedor = ventana.getContentPane();
        contenedor.setLayout(new BorderLayout());
        contenedor.add(obtenerPanelDatos(), BorderLayout.CENTER);
        contenedor.add(obtenerPanelBotones(), BorderLayout.SOUTH);
        ventana.pack();
        ventana.setVisible(true);
    }

    private static JPanel obtenerPanelBotones() {
        JPanel panel = new JPanel();
        JButton botonAceptar = new JButton("Aceptar");
        panel.add(botonAceptar);
        JButton botonCancelar = new JButton("Cancelar");
        panel.add(botonCancelar);
        return panel;
    }

    private static JPanel obtenerPanelDatos() {
        GridLayout layout = new GridLayout(3,2, 5, 5);
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        JLabel etiquetaNombre = new JLabel("Nombre:");
        panel.add(etiquetaNombre);
        JTextField textoNombre = new JTextField(15);
        panel.add(textoNombre);
        JLabel etiquetaDNI = new JLabel("DNI:");
        panel.add(etiquetaDNI);
        JTextField textoDNI = new JTextField(15);
        panel.add(textoDNI);
        JLabel etiquetaFecha = new JLabel("Fecha Nacimiento:");
        panel.add(etiquetaFecha);
        JPanel panelFecha  = crearPanelFecha();
        panel.add(panelFecha);
        return panel;
    }

    private static JPanel crearPanelFecha() {
        JPanel panel = new JPanel();
        //no establezco layout, porque un JPanel por defecto usa FlowLayout
        JTextField dias = new JTextField(2);
        panel.add(dias);
        JLabel labelSeparador1  = new JLabel("/");
        panel.add(labelSeparador1);
        JTextField mes = new JTextField(2);
        panel.add(mes);
        JLabel labelSeparador2  = new JLabel("/");
        panel.add(labelSeparador2);
        JTextField anno = new JTextField(4);
        panel.add(anno);
        return panel;
    }
}
