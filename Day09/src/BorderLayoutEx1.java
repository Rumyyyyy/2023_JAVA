import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	public BorderLayoutEx1() {
		setTitle("BorderLayout 예제");
		// BorderLayout(int hGap, int bGap)
		setLayout(new BorderLayout(30, 20));
		btn1 = new JButton("가");
		btn2 = new JButton("나");
		btn3 = new JButton("다");
		btn4 = new JButton("라");
		btn5 = new JButton("마");
		
		add("East",btn1);
		add("West",btn2);
		add("South",btn3);
		add("North",btn4);
		add("Center",btn5);
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayoutEx1 obj = new BorderLayoutEx1();
	}

}
