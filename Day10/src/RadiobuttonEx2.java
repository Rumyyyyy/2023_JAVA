
import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadiobuttonEx2 extends JFrame{
	JLabel Lb1, Lb2, Lb3, Lb4; // 이름, 주소, 성별, 취미
	JTextField Tf1, Tf2; // 이름, 주소
	JRadioButton Rb1, Rb2; // 남, 여
	JCheckBox Cb1, Cb2, Cb3, Cb4; // 게임, 등산, 여행, 공부
	JPanel Pan1, Pan2, Pan3; // North, Center, South
	
	public RadiobuttonEx2() {
		Lb1 = new JLabel("이름: ");
		Lb2 = new JLabel("주소: ");
		Lb3 = new JLabel("성별: ");
		Lb4 = new JLabel("취미: ");
		
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(20);
		
		ButtonGroup grp = new ButtonGroup();
		Rb1 = new JRadioButton("남");
		Rb2 = new JRadioButton("여", true);
		grp.add(Rb1); grp.add(Rb2);
		
		Cb1 = new JCheckBox("게임");
		Cb2 = new JCheckBox("등산");
		Cb3 = new JCheckBox("여행");
		Cb4 = new JCheckBox("공부");
		
		Pan1 = new JPanel();
		Pan1.add(Lb1); Pan1.add(Tf1); Pan1.add(Lb2); Pan1.add(Tf2);
		
		Pan2 = new JPanel();
		Pan2.add(Lb3); Pan2.add(Rb1); Pan2.add(Rb2);
		
		Pan3 = new JPanel();
		Pan3.add(Lb4); Pan3.add(Cb1); Pan3.add(Cb2); Pan3.add(Cb3); Pan3.add(Cb4);
		
		add("North", Pan1); add("Center",Pan2); add("South",Pan3);
		
		setSize(450,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadiobuttonEx2 app = new RadiobuttonEx2();
	}

}