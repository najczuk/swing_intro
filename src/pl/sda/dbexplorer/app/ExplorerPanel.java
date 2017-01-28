package pl.sda.dbexplorer.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-01-28.
 */
public class ExplorerPanel extends JPanel implements ActionListener {
    String[] schemas, tables;
    JComboBox<String> schemasCombo, tablesCombo;
    JLabel schemaLabel, tableLabel;

    public ExplorerPanel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        schemaLabel = new JLabel("Schemas:");
        tableLabel = new JLabel("Tables:");

        schemas = getSchemas();
        tables = getTables("");

        schemasCombo = new JComboBox<>(schemas);
        schemasCombo.addActionListener(this);
        schemasCombo.setMaximumSize(new Dimension(150, 20));

        tablesCombo = new JComboBox<>(tables);
        tablesCombo.setMaximumSize(new Dimension(150, 20));

        add(schemaLabel);
        add(schemasCombo);
        add(tableLabel);
        add(tablesCombo);
    }

    private String[] getTables(String schema) {
        String[] tables = {schema + "." + "customer", "film", "payment", "city", "actor"};
        return tables;
    }

    private String[] getSchemas() {
        String[] schemas = {"sda", "saklia", "information_schema", "mysql"};
        return schemas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> schemasCombo = (JComboBox<String>) e.getSource();
        System.out.println("Kliknięty " + schemasCombo.getSelectedItem());

        DefaultComboBoxModel<String> comboBoxModel =
                new DefaultComboBoxModel<>(getTables(
                        (String) schemasCombo.getSelectedItem()));
        tablesCombo.setModel(comboBoxModel);
    }
}
