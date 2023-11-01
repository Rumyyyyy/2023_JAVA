import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LableEx extends JFrame{
	private JLabel lb1, lb2;
	public LableEx() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout()); // 배치관리자
		lb1 = new JLabel("성명:       ");
		lb2 = new JLabel("주빈번호:     ");
		add(lb1);
		add(lb2);
		
		setTitle("라벨예제");
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LableEx  obj = new LableEx();
	}	

}
