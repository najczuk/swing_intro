package pl.sda.swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Workshop1 {
	
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

	private static void createAndShowGUI() {
		
		// tworzenie i konfiguracja obiektu frame
		JFrame frame = new JFrame("Workspace 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(1000,500));
		
		//tworzenie i konfiguracja paska menu
		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(0,200,50));
		greenMenuBar.setPreferredSize(new Dimension(500,50));
		
		//dodanie paska menu do okna
		frame.setJMenuBar(greenMenuBar);
		
		JMenu firstMenu = new JMenu("File");
		greenMenuBar.add(firstMenu);
		JMenuItem firstMenuItem = new JMenuItem("Open");
		firstMenu.add(firstMenuItem);
		
		//wyświetlenie okna
		frame.pack();
		frame.setVisible(true);
		
	
		
	}

}
