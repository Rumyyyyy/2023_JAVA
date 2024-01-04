import java.awt.Color;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyEvent2 extends JFrame implements KeyListener{
	JButton Btn;
	int CurXSize, CurYSize;
	public KeyEvent2() {
		setTitle("키보드 이벤트 2");
		setLayout(null);
		Btn = new JButton("버튼입니다");
		Btn.setFocusable(false); // 버튼의 포커스를 자동으로 해제
		// Btn.setEnavled(false); // 버튼을 비활성화된 상태로 만듦
		Btn.setLocation(50, 30);
		CurXSize = 120; CurYSize = 30;
		Btn.setSize(CurXSize, CurYSize);
		add(Btn);
		addKeyListener(this);
		setSize(300, 200);
		setVisible(true);
		requestFocus(); // 키 이벤트를 받을 컴포넌트를 강제로 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void keyPressed(KeyEvent e) {
			int KeyCode = e.getKeyCode();
			
			switch(KeyCode) {
			case KeyEvent.VK_UP:
				Btn.setLocation(Btn.getX(),Btn.getY() -10);
				break;
			case KeyEvent.VK_DOWN:
				Btn.setLocation(Btn.getX(), Btn.getY()+10);
				break;
			case KeyEvent.VK_LEFT:
				Btn.setLocation(Btn.getX()-10, Btn.getY());
				break;
			case KeyEvent.VK_RIGHT:
				Btn.setLocation(Btn.getX()+10, Btn.getY());
				break;
				
				// F1키를 눌렀을 때, 버튼의 색 pink
			case KeyEvent.VK_F1:
				Btn.setBackground(Color.pink);
				break;
				
				// F2키를 눌렀을 때, 버튼의 색 yellow
			case KeyEvent.VK_F2:
				Btn.setBackground(Color.yellow);
				break;
				
			case KeyEvent.VK_F10:
				Btn.setSize(CurXSize+5,CurYSize+5);
				CurXSize += 5;
				CurYSize += 5;
				break;
				
			case KeyEvent.VK_F11:
				Btn.setSize(CurXSize-5,CurYSize-5);
				CurXSize -= 5;
				CurYSize -= 5;
				break;
			}
			
	}
	@Override // 사용하지 않지만 오버라이드는 해줘야함
	public void keyReleased(KeyEvent e) {	
	}
	@Override // 사용하지 않지만 오버라이드는 해줘야함
	public void keyTyped(KeyEvent e) {
	}
	public static void main(String[] args) {
		KeyEvent2 obj = new KeyEvent2();
	}

}
