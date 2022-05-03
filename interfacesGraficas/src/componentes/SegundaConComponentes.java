package componentes;

import javax.swing.*;
import java.awt.*;

public class SegundaConComponentes {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {

        JFrame ventana = new JFrame("Título de la ventana");
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        //creamos los componentes
        JLabel etiqueta = new JLabel("TEXTO");
        JTextArea area = new JTextArea(5, 50);
        JButton boton = new JButton("Buscar");
        //obtener el panel para poder añadir componentes
        Container contenedor = ventana.getContentPane();
        //establecemos el layout del panel que tienen el contenedor
        FlowLayout layout = new FlowLayout();
        contenedor.setLayout(layout);
        //añadimos los componentes
        contenedor.add(etiqueta);
        contenedor.add(area);
        contenedor.add(boton);
        //hacemos visible la ventana
        ventana.pack();
        ventana.setVisible(true);
    }
}
