package disennador;

import javax.swing.*;
import java.awt.*;

public class Login {

    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JLabel etiqSup;
    private JTextArea areaTexto;
    private JPanel panelInferior;
    private JButton salirButton;
    private JButton buscarButton;

    public Login() {
        JFrame frame = new JFrame("primera ventana");
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(pantalla.width / 4, pantalla.height / 4);
        frame.setContentPane(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JTextArea getAreaTexto() {
        return areaTexto;
    }

    public JButton getSalirButton() {
        return salirButton;
    }

    public JButton getBuscarButton() {
        return buscarButton;
    }
}
