package tablas.ejemplo2;

import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel {
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

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return data[0].length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return data[row][column];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 3)
            return true;
        return false;
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        data[row][column] = value;
        fireTableCellUpdated(row, column);
    }
}
