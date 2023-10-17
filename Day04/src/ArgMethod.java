
public class ArgMethod {
	static void hol(int num) {
		if(num%2==1) {
			System.out.println(num+"는 홀수입니다.");
		}else {
			System.out.println(num+"는 짝수입니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("함수를 이용한 홀/짝수 판별입니다.");
		hol(5);
		hol(12);
	}

}
