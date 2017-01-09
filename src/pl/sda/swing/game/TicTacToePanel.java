package pl.sda.swing.game;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToePanel extends JPanel implements ActionListener {
	private int noOfFields;
	private int size;
	public static String CROSS = "X";
	public static String CIRCLE = "O";
	private String currSymbol = CROSS;
	private ArrayList<JButton> buttons;
	private int[][] crossClicks;
	private int[][] circleClicks;

	public TicTacToePanel(int noOfFields) {
		super();
		this.noOfFields = noOfFields;
		size = (int) Math.sqrt(noOfFields);
		setLayout(new GridLayout(size, size, 5, 5));
		crossClicks = new int[size][size];
		circleClicks = new int[size][size];
		initialize();
	}

	private void initialize() {
		buttons = new ArrayList<JButton>();

		for (int i = 0; i < noOfFields; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			button.setActionCommand(Integer.toString(i));
			buttons.add(button);
			add(button);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(e.getActionCommand());
		int currIndex = Integer.valueOf(e.getActionCommand());
		JButton clickedButton = getClickedButton(e);

		if (clickedButton.getText().equals("")) {
			clickedButton.setText(currSymbol);
			System.out.println("Index: " + currIndex + " Iloraz:" + currIndex / size + " Reszta: " + currIndex % size);
			if (currSymbol.equals(CROSS)) {
				crossClicks[currIndex / size][currIndex % size] = 1;
			} else {
				circleClicks[currIndex / size][currIndex % size] = 1;
			}
			if(isWinner(currSymbol)){
				JOptionPane.showMessageDialog(null, "Wygrał "+currSymbol);
			}
			switchCurrSymbol();
		}	

	}
	
	private boolean isWinner(String symbolToCheck){
		int[][] currClicksArr = symbolToCheck.equals(CROSS) ? crossClicks : circleClicks;
		
		for(int i = 0;i<size;i++){
			int sumH = 0;
			int sumV = 0;
			for(int j=0;j<size;j++){
				sumH += currClicksArr[i][j];
				sumV += currClicksArr[j][i];
			}
			if(sumH == size || sumV == size){
				return true;
			}
		}
		
		int sumD1 = 0;
		int sumD2 = 0;
		for(int i =0;i<size;i++){
			sumD1 += currClicksArr[i][i];
			sumD2 += currClicksArr[i][size-i-1];					
		}
		if(sumD1 == size || sumD2 == size){
			return true;
		}
		
		return false;
	}
	
	private JButton getClickedButton(ActionEvent e) {
		JButton clickedButton = buttons.get(Integer.valueOf(e.getActionCommand()));
		return clickedButton;
	}

	private void switchCurrSymbol() {
		currSymbol = currSymbol.equals(CROSS) ? CIRCLE : CROSS;

		// if(currSymbol.equals(CROSS)){
		// currSymbol = CIRCLE;
		// } else {
		// currSymbol = CROSS;
		// }

		// switch(currSymbol){
		//
		// case "X":
		// currSymbol = CIRCLE;
		// break;
		// case "O":
		// currSymbol = CROSS;
		// break;
		// }
	}

}
