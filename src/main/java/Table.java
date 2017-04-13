import javax.swing.*;
import javax.swing.table.AbstractTableModel;

/**
 * Created by hl4350hb on 4/12/2017.
 */
public class Table extends JFrame {
    private JPanel containsTable;
    private JTable table1;

    protected Table() {
        setContentPane(containsTable);
        pack();
        setVisible(true);
    }
}

class HelloDataModel extends AbstractTableModel {
    public int getRowCount() {
        return 3;
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return "Hello";
    }
}
