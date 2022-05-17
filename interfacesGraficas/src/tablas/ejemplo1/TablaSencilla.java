package tablas.ejemplo1;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

public class TablaSencilla {
    private static final String[] columnNames = {"First Name",
            "Last Name",
            "Sport",
            "# of Years",
            "Vegetarian"};
    private static final Object[][] data = {
            {"Kathy", "Smith",
                    "Snowboarding", 5, false},
            {"John", "Doe",
                    "Rowing", 3, true},
            {"Sue", "Black",
                    "Knitting", 2, false},
            {"Jane", "White",
                    "Speed reading", 20, true},
            {"Joe", "Brown",
                    "Pool", 10, false}
    };
    private JPanel panelPrincipal;
    private JScrollPane scrollPane;
    private JTable tabla;

    public TablaSencilla() {
        JFrame ventana = new JFrame("Tabla simple");
        createUIComponents();
        ventana.setContentPane(panelPrincipal);
     //   ventana.setSize(500,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        scrollPane = new JScrollPane();
        tabla = new JTable(data, columnNames);
        TableColumn column = null;
        for (int i = 0; i < 5; i++) {
            column = tabla.getColumnModel().getColumn(i);
            if (i == 2) {
                column.setPreferredWidth(200); //third column is bigger
            } else {
                column.setPreferredWidth(50);
            }
        }
        tabla.setRowSelectionAllowed(false);
        tabla.setFillsViewportHeight(true);
        scrollPane.add(tabla);


    }

    public static void main(String[] args) {
        new TablaSencilla();
    }
}
