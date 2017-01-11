package pl.sda.calculator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel implements ActionListener{

	public CalculatorPanel() {
		super();
		setLayout(new GridBagLayout());
		initialize();
	}

	private void initialize() {

		GridBagConstraints calculationConstr = new GridBagConstraints();
		calculationConstr.gridx = 0;
		calculationConstr.gridy = 0;
		calculationConstr.gridwidth = 5;
		calculationConstr.fill = GridBagConstraints.HORIZONTAL;		
		JTextField calculationText = new JTextField("0");
		add(calculationText, calculationConstr);

		int currDigit = 1;
		GridBagConstraints buttonConstraints = new GridBagConstraints();
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < 3; j++, currDigit++) {
				buttonConstraints.gridx = j;
				buttonConstraints.gridy = i;
				JButton button = new JButton(Integer.toString(currDigit));
				button.addActionListener(this);
				add(button, buttonConstraints);
			}
		}
		
		buttonConstraints.gridx = 0; buttonConstraints.gridy = 4;
		JButton button = new JButton("C"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 1; buttonConstraints.gridy = 4;
		button = new JButton("0"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 2; buttonConstraints.gridy = 4;
		button = new JButton("."); button.addActionListener(this);
		add(button,buttonConstraints);
		
		buttonConstraints.gridx = 3; buttonConstraints.gridy = 1;
		button = new JButton("/"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 3; buttonConstraints.gridy = 2;
		button = new JButton("*"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 3; buttonConstraints.gridy = 3;
		button = new JButton("-"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 3; buttonConstraints.gridy = 4;
		button = new JButton("+"); button.addActionListener(this);
		add(button,buttonConstraints);
		

		buttonConstraints.gridx = 4; buttonConstraints.gridy = 1;
		button = new JButton("^"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 4; buttonConstraints.gridy = 2;
		button = new JButton("("); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 4; buttonConstraints.gridy = 3;
		button = new JButton(")"); button.addActionListener(this);
		add(button,buttonConstraints);
		buttonConstraints.gridx = 4; buttonConstraints.gridy = 4;
		button = new JButton("="); button.addActionListener(this);
		add(button,buttonConstraints);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
