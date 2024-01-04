import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadiobuttonEx extends JFrame{
	JRadioButton Rb1, Rb2, Rb3, Rb4;
	public RadiobuttonEx() {
		setTitle("라디오버튼 예제");
		setLayout(new FlowLayout());
		ButtonGroup grp = new ButtonGroup();
		Rb1 = new JRadioButton("포도");
		Rb2 = new JRadioButton("사과");
		Rb3 = new JRadioButton("수박",true); // 기본 값이 check
		Rb4 = new JRadioButton("자두");
		
		grp.add(Rb1); grp.add(Rb2); grp.add(Rb3); grp.add(Rb4);
		add(Rb1); add(Rb2); add(Rb3); add(Rb4);
		
		setSize(300, 120);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadiobuttonEx app = new RadiobuttonEx();
	}

}
