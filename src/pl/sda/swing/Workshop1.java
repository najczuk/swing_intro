package pl.sda.swing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

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
		frame.setSize(500,500);
		
		//tworzenie i konfiguracja paska menu
		JMenuBar greenMenuBar = new JMenuBar();
		greenMenuBar.setOpaque(true);
		greenMenuBar.setBackground(new Color(0,200,50));
		greenMenuBar.setPreferredSize(new Dimension(500,50));
		
		//dodanie paska menu do okna
		frame.setJMenuBar(greenMenuBar);
		
		//wyświetlenie okna
		frame.pack();
		frame.setVisible(true);
		
	
		
	}

}
