package access;

public class ATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		// obj.a = 10; // 전용 멤버는 다른 클래스에서 접근이 안됨
		
		obj.b = 20;
		obj.c = 30;
		
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
