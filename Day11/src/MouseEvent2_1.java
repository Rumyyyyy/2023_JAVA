import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2_1 extends JFrame implements MouseListener{
	JButton btn1, btn2;
	JLabel Lb;
	public MouseEvent2_1() {
		setTitle("마우스 이벤트_2");
		btn1 = new JButton("버튼 1");
		btn2 = new JButton("버튼 2");
		
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		
		Lb = new JLabel("버튼을 클릭해보세요");
		
		setSize(400,200);
		setLayout(new FlowLayout());
		add(Lb);
		add(btn1); add(btn2);
		setVisible(true);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		Lb.setText("마우스가 눌렸습니다");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// 비워두더라도 구현하지 않으면 오류
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Lb.setText("마우스가 클릭되었습니다");
		if(e.getSource()==btn1) {Lb.setText("버튼 1이 클릭 되었습니다.");}
		if(e.getSource()==btn2) {Lb.setText("버튼 2이 클릭 되었습니다.");}
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		Lb.setText("마우스가 들어왔습니다");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		Lb.setText("마우스가 나갔습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseEvent2_1 f = new MouseEvent2_1();
	}

}
