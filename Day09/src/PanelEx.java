import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelEx extends JFrame{
	public PanelEx() {
		// TODO Auto-generated constructor stub
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		setLayout(null);
		pan1.setSize(400, 150);
		pan1.setBackground(Color.yellow);
		pan1.setLocation(0, 0);
		
		pan2.setSize(400, 150);
		pan2.setLocation(0, 150);
		pan2.setBackground(Color.blue);
		add(pan1);
		add(pan2);
		setTitle("판넬 예제");
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanelEx obj = new PanelEx();
	}

}
