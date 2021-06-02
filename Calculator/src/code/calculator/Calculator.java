package code.calculator;
/**
 * @author Aykut Acarer
 * 
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator implements ActionListener {

	//Creat JFrame, JPanel and TextFiel
	JFrame jFrame = new JFrame();
	JPanel jPanel = new JPanel();
	JTextField txt = new JTextField();

	//Creat Buttons
	JButton jButton1 = new JButton();
	JButton jButton2 = new JButton();
	JButton jButton3 = new JButton();
	JButton jButton4 = new JButton();
	JButton jButton5 = new JButton();
	JButton jButton6 = new JButton();
	JButton jButton7 = new JButton();
	JButton jButton8 = new JButton();
	JButton jButton9 = new JButton();
	JButton jButton0 = new JButton();

	JButton jButtonEqual = new JButton();
	JButton jButtonPlus = new JButton();
	JButton jButtonSub = new JButton();
	JButton jButtonDiv = new JButton();
	JButton jButtonMul = new JButton();
	JButton jButtonCLR = new JButton();
	JButton jButtonM = new JButton();
	JButton jButtonMM = new JButton();
	JButton jButtonDot = new JButton();

	//Declare variables
	int n1, n2, result;
	String operation, m;

	public Calculator() {
		
		//Configuration JFrame
		jFrame.setTitle("Calculator");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(100, 100, 300, 300);
		jFrame.setVisible(true);
		
		//Adding JPanel and Configuration
		jFrame.add(jPanel);
		jPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		jPanel.setLayout(null);

		//Configuration TextField
		txt.setBounds(10, 11, 265, 30);
		// numbers are written from right-side of textField
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setColumns(20);
		jPanel.add(txt);

		//Configuration Buttons
		jButtonM.setText("M");
		jButtonM.setBounds(80, 58, 60, 23);
		jPanel.add(jButtonM);
		jButtonM.addActionListener(this);
		
		jButtonMM.setText("M+");
		jButtonMM.setBounds(10, 58, 60, 23);
		jPanel.add(jButtonMM);
		jButtonMM.addActionListener(this);
		
		jButtonCLR.setText("CLR");
		jButtonCLR.setBounds(220, 58, 55, 23);
		jButtonCLR.setFont(new Font("Arial", Font.BOLD, 10));
		jPanel.add(jButtonCLR);
		jButtonCLR.addActionListener(this);

		jButton7.setText("7");
		jButton7.setBounds(10, 92, 60, 23);
		jPanel.add(jButton7);
		jButton7.addActionListener(this);

		jButton8.setText("8");
		jButton8.setBounds(80, 92, 60, 23);
		jPanel.add(jButton8);
		jButton8.addActionListener(this);

		jButton9.setText("9");
		jButton9.setBounds(150, 92, 60, 23);
		jPanel.add(jButton9);
		jButton9.addActionListener(this);

		jButtonDiv.setText("/");
		jButtonDiv.setBounds(220, 92, 55, 23);
		jPanel.add(jButtonDiv);
		jButtonDiv.addActionListener(this);

		jButton4.setText("4");
		jButton4.setBounds(10, 126, 60, 23);
		jPanel.add(jButton4);
		jButton4.addActionListener(this);

		jButton5.setText("5");
		jButton5.setBounds(80, 126, 60, 23);
		jPanel.add(jButton5);
		jButton5.addActionListener(this);

		jButton6.setText("6");
		jButton6.setBounds(150, 126, 60, 23);
		jPanel.add(jButton6);
		jButton6.addActionListener(this);

		jButtonMul.setText("*");
		jButtonMul.setBounds(220, 126, 55, 23);
		jPanel.add(jButtonMul);
		jButtonMul.addActionListener(this);

		jButton1.setText("1");
		jButton1.setBounds(10, 160, 60, 23);
		jPanel.add(jButton1);
		jButton1.addActionListener(this);

		jButton2.setText("2");
		jButton2.setBounds(80, 160, 60, 23);
		jPanel.add(jButton2);
		jButton2.addActionListener(this);

		jButton3.setText("3");
		jButton3.setBounds(150, 160, 60, 23);
		jPanel.add(jButton3);
		jButton3.addActionListener(this);

		jButtonSub.setText("-");
		jButtonSub.setBounds(220, 160, 55, 23);
		jPanel.add(jButtonSub);
		jButtonSub.addActionListener(this);

		jButton0.setText("0");
		jButton0.setBounds(10, 197, 60, 23);
		jPanel.add(jButton0);
		jButton0.addActionListener(this);
		
		jButtonDot.setText(".");
		jButtonDot.setBounds(80, 197, 60, 23);
		jPanel.add(jButtonDot);
		jButtonDot.addActionListener(this);
		
		jButtonEqual.setText("=");
		jButtonEqual.setBounds(150, 197, 60, 23);
		jPanel.add(jButtonEqual);
		jButtonEqual.addActionListener(this);

		jButtonPlus.setText("+");
		jButtonPlus.setBounds(220, 197, 55, 23);
		jPanel.add(jButtonPlus);
		jButtonPlus.addActionListener(this);

	}

	public static void main(String[] args) throws Exception{
		
		//Called the Constructor 
		Calculator cal = new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.jButton0) {
			txt.setText(txt.getText() + "0");
			
		}
		if (e.getSource() == this.jButton1) {
			txt.setText(txt.getText() + "1");

		}
		if (e.getSource() == this.jButton2) {
			txt.setText(txt.getText() + "2");

		}
		if (e.getSource() == this.jButton3) {
			txt.setText(txt.getText() + "3");

		}
		if (e.getSource() == this.jButton4) {
			txt.setText(txt.getText() + "4");

		}
		if (e.getSource() == this.jButton5) {
			txt.setText(txt.getText() + "5");

		}
		if (e.getSource() == this.jButton6) {
			txt.setText(txt.getText() + "6");

		}
		if (e.getSource() == this.jButton7) {
			txt.setText(txt.getText() + "7");

		}
		if (e.getSource() == this.jButton8) {
			txt.setText(txt.getText() + "8");

		}
		if (e.getSource() == this.jButton9) {
			txt.setText(txt.getText() + "9");

		}
		if (e.getSource() == jButtonPlus) {	//Addition

			n1 = Integer.parseInt(txt.getText());
			operation = "sum";
			txt.setText("");
		}
		if (e.getSource() == jButtonSub) {//subtraction

			n1 = Integer.parseInt(txt.getText());
			operation = "sub";
			txt.setText("");
		}
		if (e.getSource() == jButtonMul) {	//multiplication

			n1 = Integer.parseInt(txt.getText());
			operation = "mult";
			txt.setText("");
		}
		if (e.getSource() == jButtonDiv) {	//Division

			n1 = Integer.parseInt(txt.getText());
			operation = "div";
			txt.setText("");
		}
		if (e.getSource() == jButtonEqual) {
			n2 = Integer.parseInt(txt.getText());

			if (operation.equals("sum")) {

				result = n1 + n2;
				txt.setText(Integer.toString(result));
			} else if (operation.equals("sub")) {

				result = n1 - n2;
				txt.setText(Integer.toString(result));
			} else if (operation.equals("mult")) {

				result = n1 * n2;
				txt.setText(Integer.toString(result));
			} else if (operation.equals("div")) {

				result = n1 / n2;
				txt.setText(Integer.toString(result));
			}

		}
		if(e.getSource()==jButtonCLR) {	//to clear the TextField
			txt.setText("");
		}
		
		if(e.getSource()==jButtonM) {	// to get memory the number from textField
			 m = txt.getText();
		}
		if(e.getSource()==jButtonMM) {	// to write the number from Memory to textField
			txt.setText(m);
		}

	}

}
