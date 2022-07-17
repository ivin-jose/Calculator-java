import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	
	public Calculator() {
		
		// Window Frame 
		JFrame frame=new JFrame("Calculator");
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setLocation(100, 50);
		
		// Label
		
		JLabel displayLabel=new JLabel("New calculator ");
		displayLabel.setBounds(30, 50, 500, 35);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		frame.add(displayLabel);
		
		// Buttons
		
		// 7
		JButton sevenbutton=new JButton("7");
		sevenbutton.setBounds(40, 120, 60, 60);
		sevenbutton.setBackground(Color.white);
		sevenbutton.setOpaque(true);
		frame.add(sevenbutton);
		
		// 4
		JButton fourbutton=new JButton("4");
		fourbutton.setBounds(40, 210, 60, 60);
		fourbutton.setBackground(Color.white);
		fourbutton.setOpaque(true);
		frame.add(fourbutton);
		
		// 1
		JButton oneButton=new JButton("1");
		oneButton.setBounds(40, 300, 60, 60);
		oneButton.setBackground(Color.white);
		oneButton.setOpaque(true);
		frame.add(oneButton);
		
		// 0
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(40, 400, 60, 60);
		zeroButton.setBackground(Color.white);
		zeroButton.setOpaque(true);
		frame.add(zeroButton);
		
		// 8
		JButton eightButton=new JButton("8");
		eightButton.setBounds(140, 120, 60, 60);
		eightButton.setBackground(Color.white);
		eightButton.setOpaque(true);
		frame.add(eightButton);
		
		// 5
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(140, 210, 60, 60);
		fiveButton.setBackground(Color.white);
		fiveButton.setOpaque(true);
		frame.add(fiveButton);
		
		// 6
		JButton twoButton=new JButton("2");
		twoButton.setBounds(140, 300, 60, 60);
		twoButton.setBackground(Color.white);
		twoButton.setOpaque(true);
		frame.add(twoButton);
		
		// 9
		JButton nineButton=new JButton("9");
		nineButton.setBounds(240, 120, 60, 60);
		nineButton.setBackground(Color.white);
		nineButton.setOpaque(true);
		frame.add(nineButton);
		
		// 6
		JButton sixButton=new JButton("9");
		sixButton.setBounds(240, 210, 60, 60);
		sixButton.setBackground(Color.white);
		sixButton.setOpaque(true);
		frame.add(sixButton);
		
		// 3
		JButton threeButton=new JButton("3");
		threeButton.setBounds(240, 300, 60, 60);
		threeButton.setBackground(Color.white);
		threeButton.setOpaque(true);
		frame.add(threeButton);
		
		
		// multiplication
		JButton multiplicationButton=new JButton("X");
		multiplicationButton.setBounds(340, 210, 60, 60);
		multiplicationButton.setBackground(Color.white);
		multiplicationButton.setOpaque(true);
		frame.add(multiplicationButton);
		
		// addition
		JButton additionButton=new JButton("+");
		additionButton.setBounds(340, 300, 60, 60);
		additionButton.setBackground(Color.white);
		additionButton.setOpaque(true);
		frame.add(additionButton);
		
		// division
		JButton divisionButton=new JButton("/");
		divisionButton.setBounds(440, 210, 60, 60);
		divisionButton.setBackground(Color.white);
		divisionButton.setOpaque(true);
		frame.add(divisionButton);
		
		// subtraction
		JButton subtractionButton=new JButton("-");
		subtractionButton.setBounds(440, 300, 60, 60);
		subtractionButton.setBackground(Color.white);
		subtractionButton.setOpaque(true);
		frame.add(subtractionButton);
		
		
		// delete
		JButton deleteButton=new JButton("DEL");
		deleteButton.setBounds(340, 120, 60, 60);
		deleteButton.setBackground(Color.white);
		deleteButton.setForeground(Color.red);
		deleteButton.setOpaque(true);
	    frame.add(deleteButton);
	    
	    // clear
	    JButton clearButton=new JButton("AC");
	    clearButton.setBounds(440, 120, 60, 60);
	    clearButton.setBackground(Color.white);
	    clearButton.setForeground(Color.red);
	    clearButton.setOpaque(true);
	    frame.add(clearButton);
	    
		// pie
		JButton pieButton=new JButton("Pie");
		pieButton.setBounds(240, 400, 60, 60);
		pieButton.setBackground(Color.white);
		pieButton.setOpaque(true);
		frame.add(pieButton);
		
		
	    // Dot(.)
		JButton dotButton=new JButton(".");
		dotButton.setBounds(140, 400, 60, 60);
		dotButton.setBackground(Color.white);
		dotButton.setOpaque(true);
		frame.add(dotButton);
		
		
		// equal
		JButton equalButton=new JButton("=");
		equalButton.setBounds(340, 400, 160, 60);
		equalButton.setBackground(Color.white);
		frame.add(equalButton);
		
		frame.setVisible(true);
		
	}

}
