package mvc.vista;

import javax.swing.*;
import java.awt.*;

public class VistaConversor {
    //como atributos: JFrame, JTextField, ....
    private static Font fuenteDisplay = new Font("Serif", Font.BOLD, 36);
    private static Font fuenteLabel = new Font("Serif", Font.ITALIC, 25);


    private JFrame ventana;
    private JTextField textoCantidad;
    private JLabel mensaje;
    private JButton botonConvertirAEuros;
    private JButton botonConvertirADolares;
    private JButton botonSalir;

    public VistaConversor () {
        ventana = new JFrame("CONVERSOR MONEDA");
        ventana.setSize(600,200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        GridLayout layout = new GridLayout(4,1, 5,5);
        Container contenedor = ventana.getContentPane();
        contenedor.setLayout(layout);
        textoCantidad = new JTextField("",15);
        textoCantidad.setHorizontalAlignment(JTextField.CENTER);
        textoCantidad.setFont(fuenteDisplay);
        contenedor.add(textoCantidad);
        //la etiqueta color verde, tamaño mas grande y cursiva
        //PROYECTO LOGUIN DE USUARIO
        JPanel panelTexto = new JPanel();
        mensaje = new JLabel("resultado de la conversión");
        mensaje.setForeground(Color.GREEN);
        mensaje.setFont(fuenteLabel);

        panelTexto.add(mensaje);
        contenedor.add(panelTexto);
        JPanel panelBotones = crearPanelBotones();
        contenedor.add(panelBotones);
        JPanel panelSalir = new JPanel();
        botonSalir = new JButton("Salir");
        panelSalir.add(botonSalir);
        contenedor.add(panelSalir);
       // ventana.pack();
        ventana.setVisible(true);
    }

    private JPanel crearPanelBotones() {
        JPanel panel = new JPanel();
        botonConvertirADolares = new JButton("A Dolares");
        panel.add(botonConvertirADolares);
        botonConvertirAEuros = new JButton("A Euros");
        panel.add(botonConvertirAEuros);
        return panel;
    }

    public JTextField getTextoCantidad() {
        return textoCantidad;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public JButton getBotonConvertirAEuros() {
        return botonConvertirAEuros;
    }

    public JLabel getMensaje() {
        return mensaje;
    }
    //constructor: crear frame
    //getter JTextField, JLabel, los dos JButton
    //main para probar la interfaz de fora sencilla
  /*  public static void main(String[] args) {
        new VistaConversor();
    }*/
}
