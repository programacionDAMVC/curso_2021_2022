package layout;

import javax.swing.*;
import java.awt.*;

public class GUIGridLayout {
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
        GridLayout layout = new GridLayout(4,3, 5, 5);
        contenedor.setLayout(layout);
        for (int i = 1 ; i < 10; i++) {
            //contenedor.add(new JButton(i + ""));
            contenedor.add(new JButton(String.valueOf(i)));
        }
        contenedor.add(new JButton("*"));
        contenedor.add(new JButton("0"));
        contenedor.add(new JButton("#"));
        ventana.setVisible(true);

   }
}
