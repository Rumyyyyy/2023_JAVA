import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = s.nextInt();
		if(num > 100) {
			System.out.println("100 이하의 숫자를 입력해주세요.");
		}else if(num%3==0 || num%10==3 || num/10==3) {
			// 변수의 값이 3의 배수이거나 일의자리가 3이거나 십의자리가 3인경우
			System.out.println("박수 짝!");
		}else {
			System.out.println(num);
		}
		s.close();
	}

}
