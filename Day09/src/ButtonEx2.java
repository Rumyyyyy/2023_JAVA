import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx2 extends JFrame{
	private JButton btn1, btn2, btn3, btn4;
	public ButtonEx2() {
		setTitle("버튼 예제");
		setLayout(new FlowLayout());
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		btn4 = new JButton("버튼4");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonEx2 obj = new ButtonEx2();
	}

}
