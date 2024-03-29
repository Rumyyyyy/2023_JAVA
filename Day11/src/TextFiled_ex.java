import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFiled_ex extends JFrame implements ActionListener{
	JTextField Tf1, Tf2, Tf3; // 성명, 학번, 점수
	JLabel Lab1, Lab2, Lab3, Lab4; // 성명, 학번, 점수, 결과값
	JPanel Pan1, Pan2, Pan3;
	JButton Btn;
	
	public TextFiled_ex() {
		setTitle("텍스트 필드 예제");
		setLayout(new BorderLayout());
		
		Tf1 = new JTextField(10);
		Tf2 = new JTextField(10);
		Tf3 = new JTextField(10);
		
		Lab1 = new JLabel("성명: ");
		Lab2 = new JLabel("학번: ");
		Lab3 = new JLabel("점수를 입력하세요: ");
		Lab4 = new JLabel("당신의 성적은?");
		
		Btn = new JButton("확인");
		Btn.addActionListener(this);
		
		Pan1 = new JPanel();
		Pan2 = new JPanel();
		Pan3 = new JPanel();
		Pan1.add(Lab1); Pan1.add(Tf1); Pan1.add(Lab2); Pan1.add(Tf2);
		Pan2.add(Lab3); Pan2.add(Tf3); Pan2.add(Btn);
		Pan3.add(Lab4);
		add("North", Pan1); add("Center",Pan2); add("South",Pan3);
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFiled_ex f = new TextFiled_ex();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(Tf3.getText());
		String t1 = Tf1.getText();
		String t2 = Tf2.getText();
		if(e.getSource()==Btn) {
			if(num>90) {
				Lab4.setText(t1+" "+t2+" 우수한 성적입니다.");
			}else {
				Lab4.setText(t1+" "+t2+" 좀 더 노력하세요.");
			}
		}
	}
}
