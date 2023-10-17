
public class RtnMethod {
	static int sum(int a, int b) {
		int res;
		res = a+b;
		return(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		System.out.println("반환 값이 있는 함수를 이용한 더하기 기능입니다.");
		res = sum(7, 15);
		System.out.println("7더하기 15는 "+res+"입니다.");
	}

}
