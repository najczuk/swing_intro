package pl.sda.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Workshop1 implements ActionListener{
	
	JLabel infoLog;
	
	public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Workshop1 w1 = new Workshop1();
                w1.createAndShowGUI();
            }
        });
    }

	public void createAndShowGUI() {
		
		// tworzenie i konfiguracja obiektu frame
		JFrame frame = new JFrame("Workspace 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setMinimumSize(new Dimension(1000,500));
		
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
		
		JTextField loginField = new JTextField("wpisz login...");
		JPasswordField passField = new JPasswordField();
		JButton loginButton = new JButton("Log in");
		loginButton.addActionListener(this);
		
		infoLog = new JLabel("info...");
		
		frame.getContentPane().add(loginField, BorderLayout.LINE_START);
		frame.getContentPane().add(passField, BorderLayout.CENTER);
		frame.getContentPane().add(loginButton, BorderLayout.LINE_END);
		frame.getContentPane().add(infoLog, BorderLayout.PAGE_END);
		
		//wyświetlenie okna
		frame.pack();
		frame.setVisible(true);
		
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Coś się klikło.");
		infoLog.setText("Próba logowania: "+ new Date());
	}

}
