package pl.sda.calculator;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import pl.sda.swing.game.TicTacToePanel;

public class Calculator {
	
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//tworzymy okno
            	JFrame frame = new JFrame("Calculator");
            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	
            	//dodajmy do okna panel z kalkulatorem
            	CalculatorPanel calculatorPanel = new CalculatorPanel();
            	frame.getContentPane().add(calculatorPanel, BorderLayout.CENTER);
            	frame.pack();
            	frame.setVisible(true);
            }
        });
    }

}
