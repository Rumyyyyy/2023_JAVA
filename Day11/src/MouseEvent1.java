import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame implements MouseListener{
	JLabel Lb;
	public MouseEvent1() {
		// TODO Auto-generated constructor stub
		setTitle("Mouse 이벤트 1");
		setLayout(new FlowLayout());
		Lb = new JLabel("마우스를 동작해보세요.");
		add(Lb);
		addMouseListener(this);
		setSize(300, 200);
		setVisible(true);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Lb.setText("마우스가 눌렸습니다");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		Lb.setText("마우스가 떨어졌습니다");
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Lb.setText("마우스가 클릭되었습니다");
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
		MouseEvent1 obj = new MouseEvent1();
	}

}
