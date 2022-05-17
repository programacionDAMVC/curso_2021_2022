package tablas.ejemplo2;

import javax.swing.*;
import javax.swing.table.TableModel;

public class Tabla2 {
    private JPanel panelPrincipal;
    private JScrollPane scrollPane;
    private JTable tabla;
    private ModeloTabla modeloTabla;

    public Tabla2() {
        JFrame ventana = new JFrame("Modelo tabla");

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
        modeloTabla = new ModeloTabla();
        tabla = new JTable(modeloTabla);
        tabla.getModel().addTableModelListener(e -> {
            int row = e.getFirstRow();
            int column = e.getColumn();
            TableModel model = (TableModel)e.getSource();
            String columnName = model.getColumnName(column);
            Object data = model.getValueAt(row, column);
            System.out.println(data);
        });
        tabla.setFillsViewportHeight(true);
        scrollPane.add(tabla);
    }

    public static void main(String[] args) {
        new Tabla2();
    }
}
