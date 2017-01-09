package pl.sda.swing.game;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import pl.sda.swing.Workshop1;

public class Game {
	
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//tworzymy okno
            	JFrame frame = new JFrame("Gra");
            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	
            	//dodajmy do okna panel z grą
            	TicTacToePanel ticTacToePanel = new TicTacToePanel(9);
            	frame.getContentPane().add(ticTacToePanel, BorderLayout.CENTER);
            	frame.pack();
            	frame.setVisible(true);
            }
        });
    }

}
