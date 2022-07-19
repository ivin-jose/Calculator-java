import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

// to take actions implement action listener

public class Calculator implements ActionListener{
	
	//to store the number temporarily 
	
	String oldvalue;
	String result;
	
	boolean isoperaterClicked=false;
	
	JFrame frame;
	JLabel label;
	JTextField displayLabel;
	
	JButton sevenbutton;
	JButton fourButton;
	JButton oneButton;
	JButton zeroButton;
	JButton eightButton;
	JButton fiveButton;
	JButton twoButton;
	JButton nineButton;
	JButton sixButton;
	JButton threeButton;
	JButton dotButton;
	JButton multiplicationButton;
	JButton additionButton;
	JButton subtractionButton;
	JButton divisionButton;
	JButton equalButton;
	JButton pieButton;
	JButton clearButton;
	JButton deleteButton;
	
	// theme button
	JButton grayButton;
	JButton redButton;
	JButton yellowButton;
	JButton greenButton;
	JButton defaultButton;
	
	
	
	public Calculator() {

		
		// Window Frame 
		frame=new JFrame("Calculator");
		frame.setLayout(null);
		frame.setSize(550, 600);
		frame.setLocation(100, 50);
		
		// Label
		label=new JLabel();
		label.setBounds(449, 15, 50, 30);
		label.setBackground(Color.gray);
		label.setOpaque(true);
		label.setForeground(Color.white);
		label.setFont(new Font("areal",Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(label);
		
		// TextField
		
		displayLabel=new JTextField();
		displayLabel.setBounds(30, 50, 470, 35);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		frame.add(displayLabel);
		
		// Buttons
		
		// 7
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(40, 120, 60, 60);
		sevenbutton.setBackground(Color.white);
		sevenbutton.setOpaque(true);
		sevenbutton.setFont(new Font("italic",Font.ITALIC,20));
		sevenbutton.addActionListener(this);
		frame.add(sevenbutton);
		
		// 4
		fourButton=new JButton("4");
		fourButton.setBounds(40, 210, 60, 60);
		fourButton.setBackground(Color.white);
		fourButton.setOpaque(true);
		fourButton.setFont(new Font("italic",Font.ITALIC,20));
		fourButton.addActionListener(this);
		frame.add(fourButton);
		
		// 1
		oneButton=new JButton("1");
		oneButton.setBounds(40, 300, 60, 60);
		oneButton.setBackground(Color.white);
		oneButton.setOpaque(true);
		oneButton.setFont(new Font("italic",Font.ITALIC,20));
		oneButton.addActionListener(this);
		frame.add(oneButton);
		
		// 0
		zeroButton=new JButton("0");
		zeroButton.setBounds(40, 400, 60, 60);
		zeroButton.setBackground(Color.white);
		zeroButton.setOpaque(true);
		zeroButton.setFont(new Font("italic",Font.ITALIC,20));
		zeroButton.addActionListener(this);
		frame.add(zeroButton);
		
	    eightButton=new JButton("8");
		eightButton.setBounds(140, 120, 60, 60);
		eightButton.setBackground(Color.white);
		eightButton.setOpaque(true);
		eightButton.setFont(new Font("italic",Font.ITALIC,20));
		eightButton.addActionListener(this);
		frame.add(eightButton);
		
		// 5
		fiveButton=new JButton("5");
		fiveButton.setBounds(140, 210, 60, 60);
		fiveButton.setBackground(Color.white);
		fiveButton.setOpaque(true);
		fiveButton.setFont(new Font("italic",Font.ITALIC,20));
		fiveButton.addActionListener(this);
		frame.add(fiveButton);
		
		// 6
		twoButton=new JButton("2");
		twoButton.setBounds(140, 300, 60, 60);
		twoButton.setBackground(Color.white);
		twoButton.setOpaque(true);
		twoButton.setFont(new Font("italic",Font.ITALIC,20));
		twoButton.addActionListener(this);
		frame.add(twoButton);
		
		// 9
		nineButton=new JButton("9");
		nineButton.setBounds(240, 120, 60, 60);
		nineButton.setBackground(Color.white);
		nineButton.setOpaque(true);
		nineButton.setFont(new Font("italic",Font.ITALIC,20));
		nineButton.addActionListener(this);
		frame.add(nineButton);
		
		// 6
		sixButton=new JButton("6");
		sixButton.setBounds(240, 210, 60, 60);
		sixButton.setBackground(Color.white);
		sixButton.setOpaque(true);
		sixButton.setFont(new Font("italic",Font.ITALIC,20));
		sixButton.addActionListener(this);
		frame.add(sixButton);
		
		// 3
		threeButton=new JButton("3");
		threeButton.setBounds(240, 300, 60, 60);
		threeButton.setBackground(Color.white);
		threeButton.setOpaque(true);
		threeButton.setFont(new Font("italic",Font.ITALIC,20));
		threeButton.addActionListener(this);
		frame.add(threeButton);
		
		
		// multiplication
		multiplicationButton=new JButton("X");
		multiplicationButton.setBounds(340, 210, 60, 60);
		multiplicationButton.setBackground(Color.white);
		multiplicationButton.setOpaque(true);
		multiplicationButton.addActionListener(this);
		frame.add(multiplicationButton);
		
		// addition
		additionButton=new JButton("+");
		additionButton.setBounds(340, 300, 60, 60);
		additionButton.setBackground(Color.white);
		additionButton.setOpaque(true);
		additionButton.setFont(new Font("italic",Font.ITALIC,20));
		additionButton.addActionListener(this);
		frame.add(additionButton);
		
		// division
		divisionButton=new JButton("/");
		divisionButton.setBounds(440, 210, 60, 60);
		divisionButton.setBackground(Color.white);
		divisionButton.setOpaque(true);
		divisionButton.setFont(new Font("italic",Font.PLAIN,20));
		divisionButton.addActionListener(this);
		frame.add(divisionButton);
		
		// subtraction
		subtractionButton=new JButton("-");
		subtractionButton.setBounds(440, 300, 60, 60);
		subtractionButton.setBackground(Color.white);
		subtractionButton.setOpaque(true);
		subtractionButton.setFont(new Font("italic",Font.PLAIN,30));
		subtractionButton.addActionListener(this);
		frame.add(subtractionButton);
		
		
		// delete
		deleteButton=new JButton("DEL");
		deleteButton.setBounds(340, 120, 60, 60);
		deleteButton.setBackground(Color.white);
		deleteButton.setForeground(Color.red);
		deleteButton.setOpaque(true);
		deleteButton.setFont(new Font("italic",Font.BOLD,13));
		deleteButton.addActionListener(this);
	    frame.add(deleteButton);
	    
	    // clear
	    clearButton=new JButton("AC");
	    clearButton.setBounds(440, 120, 60, 60);
	    clearButton.setBackground(Color.white);
	    clearButton.setForeground(Color.red);
	    clearButton.setOpaque(true);
	    clearButton.setFont(new Font("italic",Font.PLAIN,13));
	    clearButton.addActionListener(this);
	    frame.add(clearButton);
	    
		// pie
		pieButton=new JButton("Pie");
		pieButton.setBounds(240, 400, 60, 60);
		pieButton.setBackground(Color.white);
		pieButton.setForeground(Color.blue);
		pieButton.setOpaque(true);
		pieButton.setFont(new Font("italic",Font.ITALIC,13));
		pieButton.addActionListener(this);
		frame.add(pieButton);
		
		
	    // Dot(.)
		dotButton=new JButton(".");
		dotButton.setBounds(140, 400, 60, 60);
		dotButton.setBackground(Color.white);
		dotButton.setOpaque(true);
		dotButton.setFont(new Font("italic",Font.BOLD,30));
		dotButton.addActionListener(this);
		frame.add(dotButton);
		
		
		// equal
		equalButton=new JButton("=");
		equalButton.setBounds(340, 400, 160, 60);
		equalButton.setBackground(Color.white);
		frame.add(equalButton);
		equalButton.setForeground(Color.ORANGE);
		equalButton.setFont(new Font("italic",Font.PLAIN,30));
		equalButton.addActionListener(this);
		
		// green Button
		
		greenButton=new JButton("green");
		greenButton.setBounds(125, 480, 80, 20);
		greenButton.setBackground(Color.green);
		greenButton.setForeground(Color.black);
		greenButton.setOpaque(true);
		greenButton.setFont(new Font("italic",Font.PLAIN,13));
		greenButton.addActionListener(this);
		frame.add(greenButton);
		
		// yellow button
		yellowButton=new JButton("yellow");
		yellowButton.setBounds(225, 480, 80, 20);
		yellowButton.setBackground(Color.yellow);
		yellowButton.setForeground(Color.black);
		yellowButton.setOpaque(true);
		yellowButton.setFont(new Font("italic",Font.PLAIN,13));
		yellowButton.addActionListener(this);
		frame.add(yellowButton);
		
		// gray button
		grayButton=new JButton("grey");
		grayButton.setBounds(325, 480, 80, 20);
		grayButton.setBackground(Color.LIGHT_GRAY);
		grayButton.setForeground(Color.black);
		grayButton.setOpaque(true);
		grayButton.setFont(new Font("italic",Font.PLAIN,13));
		grayButton.addActionListener(this);
		frame.add(grayButton);
		
		// red button
		redButton=new JButton("red");
		redButton.setBounds(425, 480, 80, 20);
		redButton.setBackground(Color.RED);
		redButton.setForeground(Color.black);
		redButton.setOpaque(true);
		redButton.setFont(new Font("italic",Font.PLAIN,13));
		redButton.addActionListener(this);
		frame.add(redButton);
		
		// default button
	    defaultButton=new JButton("Default");
	    defaultButton.setBounds(25, 480, 80, 20);
		defaultButton.setBackground(Color.white);
		defaultButton.setForeground(Color.black);
		defaultButton.setOpaque(true);
		defaultButton.setFont(new Font("italic",Font.PLAIN,13));
		defaultButton.addActionListener(this);
		frame.add(defaultButton);
		
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		// checking button action 
		
		// number buttons
		
		if(e.getSource()==oneButton){
			
			if (isoperaterClicked) {
				displayLabel.setText("1");
				isoperaterClicked=false;
			}
			else {
				//displayLabel.getText()+ for concatenate the values in text field
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}	
		else if (e.getSource()== twoButton){
			if (isoperaterClicked) {
				displayLabel.setText("2");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		else if (e.getSource()== threeButton){
			if (isoperaterClicked) {
				displayLabel.setText("3");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		else if (e.getSource()== fourButton){
			if (isoperaterClicked) {
				displayLabel.setText("4");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		else if (e.getSource()== fiveButton){
			if (isoperaterClicked) {
				displayLabel.setText("5");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		else if (e.getSource()== sixButton){
			if (isoperaterClicked) {
				displayLabel.setText("6");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		else if (e.getSource()== sevenbutton){
			if (isoperaterClicked) {
				displayLabel.setText("7");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		else if (e.getSource()== eightButton){
			if (isoperaterClicked) {
				displayLabel.setText("8");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		else if (e.getSource()== nineButton){
			if (isoperaterClicked) {
				displayLabel.setText("9");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		else if (e.getSource()== pieButton){
			if (isoperaterClicked) {
				displayLabel.setText("3.14");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3.14");
			}
		}
		else if (e.getSource()== dotButton){
			if (isoperaterClicked) {
				displayLabel.setText(".");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
		}
		else if (e.getSource()== zeroButton) {
			if (isoperaterClicked) {
				displayLabel.setText("0");
				isoperaterClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		
		// operators
		
		else if (e.getSource()== additionButton) {
			oldvalue = displayLabel.getText();
			isoperaterClicked=true;
			label.setText("+");
			
			
		}
		else if (e.getSource()== divisionButton) {
			oldvalue = displayLabel.getText();
			isoperaterClicked=true;
			label.setText("/");
			
		}
		else if (e.getSource()== multiplicationButton) {
			oldvalue = displayLabel.getText();
			isoperaterClicked=true;
			label.setText("X");
			
		}
		else if (e.getSource()== subtractionButton) {
			oldvalue = displayLabel.getText();
			isoperaterClicked=true;
			label.setText("-");
			
		}
		
		
		// mode changing
		
		else if (e.getSource()== greenButton){
			displayLabel.setText("Mode changed to 'green' ");
			label.setText("G");
			frame.getContentPane().setBackground(Color.GREEN);
			isoperaterClicked=true;
		}
		else if (e.getSource()== yellowButton){
			displayLabel.setText("Mode changed to 'yellow' ");
			label.setText("Y");
			frame.getContentPane().setBackground(Color.YELLOW);
			isoperaterClicked=true;
		}
		else if (e.getSource()== grayButton){
			displayLabel.setText("Mode changed to 'gray' ");
			label.setText("Gy");
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
			isoperaterClicked=true;
		}
		else if (e.getSource()== redButton){
			displayLabel.setText("Mode changed to 'red' ");
			label.setText("R");
			frame.getContentPane().setBackground(Color.RED);
			isoperaterClicked=true;
		}
		else if (e.getSource()== defaultButton){
			displayLabel.setText("Mode changed to 'Default' ");
			label.setText("D");
			frame.getContentPane().setBackground(Color.white);
			isoperaterClicked=true;
		}
		
		// clear button
		
		else if (e.getSource()== clearButton){
			displayLabel.setText("");
			label.setText("");
			frame.getContentPane().setBackground(Color.GRAY);
			isoperaterClicked=true;
		}
		
		// equals button
		else if (e.getSource()== equalButton){
			displayLabel.setText(oldvalue);
			label.setText("Ans");
			isoperaterClicked=true;
		}
			
			
			
		
	}

}

