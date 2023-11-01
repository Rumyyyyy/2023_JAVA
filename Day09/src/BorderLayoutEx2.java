import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEx2 extends JFrame{
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JPanel pan1, pan2, pan3;
	public BorderLayoutEx2() {
		// TODO Auto-generated constructor stub
		setTitle("BorderLayout 예제");
		setLayout(new BorderLayout());
		pan1 = new JPanel(); // north
		pan2 = new JPanel(); // center
		pan3 = new JPanel(); // south
		pan1.setBackground(Color.gray);
		pan3.setBackground(Color.gray);
		
		btn1 = new JButton("이순신");
		btn2 = new JButton("강감찬");
		btn3 = new JButton("홍길동");
		btn4 = new JButton("임꺽정");
		btn5 = new JButton("채현석");
		
		pan1.add(btn1);
		pan1.add(btn2);
		pan2.add(btn3);
		pan3.add(btn4);
		pan3.add(btn5);
		
		add("North", pan1);
		add("Center", pan2);
		add("South", pan3);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayoutEx2 obj = new BorderLayoutEx2();
	}

}
