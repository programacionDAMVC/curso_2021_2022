package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo1 {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {

        JFrame ventanta = new JFrame("Eventos");
        ventanta.setSize(700,100);
        ventanta.setLocationRelativeTo(null);
        ventanta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contenedor = ventanta.getContentPane();
        JPanel panel = new JPanel();  //por defecto incorpora FlowLayout
        JLabel label = new JLabel("NOMBRE: ");
        panel.add(label);
        JTextField nombre = new JTextField("introduce nombre...", 40);
        nombre.setForeground(Color.GRAY);
        panel.add(nombre);
        JButton botonNombre = new JButton("PULSAR");
        //listener con clase anónima
        botonNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               String texto = nombre.getText();
               System.out.printf("hola %s%n", texto);
               nombre.setText("");
                JOptionPane.showInternalMessageDialog(null, String.format("hola %s%n", texto),
                        "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(botonNombre);
        JButton botonSalir = new JButton("SALIR");
        //usando una expresión labmda
        botonSalir.addActionListener( actionEvent -> {
            int opcion = JOptionPane.showInternalConfirmDialog(null,"¿Realmente quieres salir?",
                    "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            System.out.println(opcion);
            if (opcion == 1) //opcion 0 es confirmación y opción 1 es no confirmación
                return;
            System.exit(0);
            //diálogo de confirmación (si/no)
        });
        panel.add(botonSalir);
        contenedor.add(panel);
        ventanta.setVisible(true);
    }
}
