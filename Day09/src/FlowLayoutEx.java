import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	public FlowLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("FlowLayout 예제");
		setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
		
		btn1 = new JButton("가");
		btn2 = new JButton("나");
		btn3 = new JButton("다");
		btn4 = new JButton("라");
		btn5 = new JButton("마");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutEx obj = new FlowLayoutEx();
	}

}
