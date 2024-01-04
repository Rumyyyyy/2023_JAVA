import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayoutEx extends JFrame {
	private JButton btn1, btn2, btn3, btn4;
	public NullLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("배치관리자 없는 예제");
		setLayout(null);
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		
		// btn1.setSize(60,30); btn1.setLocation(60,10); 
		btn1.setBounds(60,10,60,30); add(btn1); // 로케이션, 좌표
		// btn2.setSize(60,30); btn2.setLocation(20,30); 
		btn2.setBounds(20,30,60,30); add(btn2);
		// btn3.setSize(60,30); btn3.setLocation(100,30); 
		btn3.setBounds(100,30,60,30); add(btn3);
		// btn4.setSize(60,30); btn4.setLocation(60,50); 
		btn4.setBounds(60,50,60,30); add(btn4);
		setSize(200,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullLayoutEx app = new NullLayoutEx();

	}

}
