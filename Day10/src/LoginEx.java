import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginEx extends JFrame{
	JLabel Lab1, Lab2; JTextField Tf1, Tf2;
	JPanel Pan1, Pan2;
	JButton btn1;
	
	public LoginEx() {
		// TODO Auto-generated constructor stub
		setTitle("AWT 기본예제"); setLayout(new BorderLayout());
		Lab1 = new JLabel("ID: "); Lab2 = new JLabel("Password: ");
		Tf1 = new JTextField(10); Tf2 = new JTextField(10);
		btn1 = new JButton("Login");
		Pan1 = new JPanel();
		Pan1.add(Lab1); Pan1.add(Tf1);
		Pan2 = new JPanel();
		Pan2.add(Lab2); Pan2.add(Tf2);
		Pan2.add(btn1);
		
		add("North", Pan1); add("South",Pan2);
		setSize(400, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginEx app = new LoginEx();
	}

}