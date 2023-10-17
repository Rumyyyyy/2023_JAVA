
public class ThisTest {
	public ThisTest() {
		this(10);
		System.out.println("첫번째 생성자입니다.");
	}
	public ThisTest(int n) {
		System.out.println("두번째 생성자입니다. "+n);
	}
}
