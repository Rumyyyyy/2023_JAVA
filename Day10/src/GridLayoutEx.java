import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7,
		btn8, btn9, btn10, btn11, btn12;
	public GridLayoutEx() {
		// TODO Auto-generated constructor stub
		// setTitle("GridLayout");
		super("GridLayout");
		setLayout(new GridLayout(4,3));
		btn1 = new JButton("1"); btn2 = new JButton("2"); btn3 = new JButton("3");
		btn4 = new JButton("4"); btn5 = new JButton("5"); btn6 = new JButton("6");
		btn7 = new JButton("7"); btn8 = new JButton("8"); btn9 = new JButton("9");
		btn10 = new JButton("0"); btn11 = new JButton("*"); btn12 = new JButton("#");
		
		add(btn1); add(btn2); add(btn3);
		add(btn4); add(btn5); add(btn6);
		add(btn7); add(btn8); add(btn9);
		add(btn10); add(btn11); add(btn12);
		
		setSize(150,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GridLayoutEx app = new GridLayoutEx();
	}

}
