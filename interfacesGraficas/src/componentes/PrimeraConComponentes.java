package componentes;

import javax.swing.*;
import java.awt.*;

public class PrimeraConComponentes {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame ventana = new JFrame();
        ventana.setTitle("Componentes 1");
        ventana.setSize(500,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = ventana.getContentPane();
        JLabel label = new JLabel("nombre");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("GUARDAR");
        //añadimos los componentes al contenedor
        contenedor.setLayout(new FlowLayout());
        contenedor.add(label);
        contenedor.add(texto);
        contenedor.add(boton);
      //  ventana.pack();
        ventana.setVisible(true);
    }

}
