import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrEx1 extends JFrame{
	public GrEx1() {
		setTitle("문자열 출력하기");
		MyPanel pan = new MyPanel();
		add("Center",pan);
		setSize(400,330);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class MyPanel extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 문자열, x, y
			g.drawString("drawString()을 이용한 문자열 출력", 50, 100);
			g.drawLine(50, 30, 250, 150); // x1, y1, x2, y2
			g.drawLine(50, 120, 270, 60);
			g.drawRect(50, 120, 300, 120); // x, y, w, h
			g.drawRect(80, 40, 140, 220);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrEx1 f = new GrEx1();
	}

}
