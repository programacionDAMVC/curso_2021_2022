package layout;

import javax.swing.*;
import java.awt.*;

public class GUIFlowLayout {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame ventanta = new JFrame("FlowLayout");
        ventanta.setSize(500,300);
        ventanta.setLocationRelativeTo(null);
        ventanta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = ventanta.getContentPane();
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(20);
        layout.setVgap(20);
        contenedor.setLayout(layout);
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
       // ventanta.pack();
        ventanta.setVisible(true);


    }
}
