package pl.sda.dbexplorer.app;


import javax.swing.*;
import java.awt.*;

/**
 * Created by RENT on 2017-01-28.
 */
public class DBExplorerApp {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //tworzymy okno
                JFrame frame = new JFrame("ExplorerApp");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                DBExplorerPanel explorerPanel = new DBExplorerPanel();

                frame.setContentPane(explorerPanel);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }

}
