package pl.sda.dbexplorer.app;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by RENT on 2017-01-28.
 */
public class DataTable extends JPanel {
    JTable dataTable;
    JScrollPane scrollPane;

    public DataTable() {
        super(new GridLayout(1, 1));
        dataTable = new JTable();
        dataTable.setPreferredScrollableViewportSize(new Dimension(500, 300));
        dataTable.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(dataTable);
        add(scrollPane);
    }

    public void fillTableWithDummyData(String table) {
        String[] columns = {"Imię", "Nazwisko", "Miasto", "Płeć"};
        String[][] tableData = {{"Adrian" + table, "Najczuk", "Wrocław", "M"},
                {"Jan" + table, "Kowalski", "Wrocław", "M"},
                {"Anna" + table, "Kowalska", "Warszawa", "K"},
                {"Michał" + table, "Pazdan", "Mur", "M"}};

        dataTable.setModel(new DefaultTableModel(tableData,columns));
    }
}
