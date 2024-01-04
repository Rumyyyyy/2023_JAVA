import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Menu3 extends JFrame implements ActionListener{
	JMenuBar mbar;
	JMenu mAttack, mMove;
	JMenuItem Gun, Bomb, Laser, Forward, Backward;

	JTextField tf;
	public Menu3() {
		setTitle("메뉴 프로그램");
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		mAttack = new JMenu("공격");
		Gun = new JMenuItem("총");
		Bomb = new JMenuItem("폭탄");
		Laser = new JMenuItem("레이저");
		
		mAttack.add(Gun);
		mAttack.add(Bomb);
		mAttack.add(Laser);
		
		mMove = new JMenu("이동");
		Forward = new JMenuItem("전진");
		Backward = new JMenuItem("후진");
		
		mMove.add(Forward);
		mMove.add(Backward);
		
		
		mbar.add(mAttack);
		mbar.add(mMove);
		
		tf = new JTextField(20);
		add("South",tf);
		
		Gun.addActionListener(this);
		Bomb.addActionListener(this);
		Laser.addActionListener(this);
		Forward.addActionListener(this);
		Backward.addActionListener(this);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Menu3 f = new Menu3();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Gun) {tf.setText("탕탕탕");}
		if(e.getSource()==Bomb) {tf.setText("쿠과광");}
		if(e.getSource()==Laser) {tf.setText("찌이~~~~잉");}
		if(e.getSource()==Forward) {tf.setText("전진합니다");}
		if(e.getSource()==Backward) {tf.setText("후진합니다");}
	}
}
