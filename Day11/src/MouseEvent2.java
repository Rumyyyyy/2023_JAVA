import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2 extends JFrame implements MouseListener{
	JButton btn;
	JLabel Lb;
	public MouseEvent2() {
		btn = new JButton("버튼을 동작하는 마우스 이벤트");
		btn.addMouseListener(this);
		Lb = new JLabel("마우스를 동작해보세요");
		setSize(300,200);
		setLayout(new FlowLayout());
		add(btn); add(Lb);
		setVisible(true);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		Lb.setText("마우스가 눌렸습니다");
		Lb.setForeground(Color.red);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// 비워두더라도 구현하지 않으면 오류
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Lb.setText("마우스가 클릭되었습니다");
		Lb.setForeground(Color.pink);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		Lb.setText("마우스가 들어왔습니다");
		btn.setBackground(Color.blue);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		Lb.setText("마우스가 나갔습니다.");
		btn.setBackground(Color.yellow);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseEvent2 f = new MouseEvent2();
	}

}
