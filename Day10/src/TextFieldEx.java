import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	JLabel Lab1, Lab2, Lab3; JTextField Tf1, Tf2, Tf3;
	JPanel Pan1, Pan2, Pan3;
	
	public TextFieldEx() {
		// TODO Auto-generated constructor stub
		setTitle("텍스트 필드 예제"); setLayout(new BorderLayout());
		Lab1 = new JLabel("성명: "); Lab2 = new JLabel("전화번호: "); Lab3 = new JLabel("주소");
		Tf1 = new JTextField(10); Tf2 = new JTextField(20); Tf3 = new JTextField("실제 살고 있는 주소 기입",20);
		Pan1 = new JPanel();
		Pan1.add(Lab1); Pan1.add(Tf1);
		Pan2 = new JPanel();
		Pan2.add(Lab2); Pan2.add(Tf2);
		Pan3 = new JPanel();
		Pan3.add(Lab3); Pan3.add(Tf3);
		
		add("North", Pan1); add("Center",Pan2); add("South",Pan3);
		setSize(400, 130);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFieldEx app = new TextFieldEx();
	}

}
