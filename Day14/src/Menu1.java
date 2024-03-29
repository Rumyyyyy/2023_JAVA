import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu1 extends JFrame{
	JMenuBar mbar;
	JMenu mFile, mEdit, mHelp;
	JMenuItem file_open, file_save, file_close, file_exit, edit_copy, edit_paste, help;
	public Menu1() {
		setTitle("메뉴 프로그램");
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		
		mFile = new JMenu("파일");
		file_open = new JMenuItem("열기");
		file_save = new JMenuItem("저장하기");
		file_close = new JMenuItem("닫기");
		file_exit = new JMenuItem("종료하기");
		
		mFile.add(file_open);
		mFile.add(file_save);
		mFile.add(file_close);
		mFile.add(file_exit);
		
		mEdit = new JMenu("편집");
		edit_copy = new JMenuItem("복사하기");
		edit_paste = new JMenuItem("붙여넣기");
		
		mEdit.add(edit_copy);
		mEdit.add(edit_paste);
		
		mHelp = new JMenu("도움말");		
		help = new JMenuItem("도움말 보기");
		mHelp.add(help);
		
		mbar.add(mFile);
		mbar.add(mEdit);
		mbar.add(mHelp);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Menu1 f = new Menu1();
	}
}
