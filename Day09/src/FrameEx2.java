import javax.swing.JFrame;

public class FrameEx2 extends JFrame { // JFrame을 상속받아 사용하는 방법

	public FrameEx2() {
		setTitle("두번째 윈도우");
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameEx2 obj = new FrameEx2();
	}

}
