import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckboxEx extends JFrame{
	JCheckBox Cb1, Cb2, Cb3, Cb4;
	public CheckboxEx() {
		setTitle("체크박스 예제");
		setLayout(new FlowLayout());
		Cb1 = new JCheckBox("포도");
		Cb2 = new JCheckBox("사과");
		Cb3 = new JCheckBox("수박",true); // 기본 값이 check
		Cb4 = new JCheckBox("자두");
		
		add(Cb1); add(Cb2); add(Cb3); add(Cb4);
		
		setSize(300, 120);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxEx app = new CheckboxEx();
	}

}
