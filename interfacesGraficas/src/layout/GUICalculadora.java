package layout;

import javax.swing.*;
import java.awt.*;

public class GUICalculadora {
    private static Font fuenteDisplay = new Font("Serif", Font.BOLD, 36);
    private static Font fuenteBotones = new Font("Serif", Font.ITALIC, 20);

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame ventana = new JFrame();
        ventana.setTitle("CALCULADORA");
        ventana.setSize(500,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        Container contenedor = ventana.getContentPane();
        contenedor.setLayout(new BorderLayout());
        JPanel panelCentral = crearPanelCentral();
        contenedor.add(panelCentral, BorderLayout.CENTER);
        JPanel panelSuperior = crearPanelSuperior();
        contenedor.add(panelSuperior, BorderLayout.NORTH);
        JPanel panelLateral = crearPanelLateral();
        contenedor.add(panelLateral, BorderLayout.EAST);
        ventana.pack();
        ventana.setVisible(true);
    }

    private static JPanel crearPanelLateral() {
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(0, 1, 5, 5);
        panel.setLayout(layout);
        JButton botonClear = new JButton("C");
        botonClear.setFont(fuenteBotones);
        botonClear.setForeground(Color.BLUE);
        panel.add(botonClear);
        JButton botonSumar = new JButton("+");
        botonSumar.setFont(fuenteBotones);
        botonSumar.setForeground(Color.BLUE);
        panel.add(botonSumar);
        JButton botonRestar = new JButton("-");
        botonRestar.setFont(fuenteBotones);
        botonRestar.setForeground(Color.BLUE);
        panel.add(botonRestar);
        JButton botonMultiplicar = new JButton("*");
        botonMultiplicar.setFont(fuenteBotones);
        botonMultiplicar.setForeground(Color.BLUE);
        panel.add(botonMultiplicar);
        JButton botonDividir = new JButton("/");
        botonDividir.setFont(fuenteBotones);
        botonDividir.setForeground(Color.BLUE);
        panel.add(botonDividir);
        return panel;
    }

    private static JPanel crearPanelSuperior() {
        JPanel panel = new JPanel();
        JTextField display = new JTextField("0", 13);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(fuenteDisplay);
        panel.add(display);
        return panel;
    }

    private static JPanel crearPanelCentral() {
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(4,3, 8,8);
        panel.setLayout(layout);
        JButton[] botones = new JButton[10];
        for (int i = 1; i < 10; i++) {
            botones[i] = crerBoton(i);
            panel.add(botones[i]);
        }
        JButton botonPunto = new JButton(".");
        botonPunto.setFont(fuenteBotones);
        panel.add(botonPunto);
        botones[0] = crerBoton(0);
        panel.add(botones[0]);
        JButton botonIgual = new JButton("=");
        botonIgual.setFont(fuenteBotones);
        botonIgual.setForeground(Color.RED);
        panel.add(botonIgual);
        return panel;
    }

    private static JButton crerBoton(int i) {
        JButton boton = new JButton(i + "");
        boton.setFont(fuenteBotones);
        return boton;
    }
}
