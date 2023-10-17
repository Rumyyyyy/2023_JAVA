import java.util.Scanner;

public class SimpleFor {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("반복할 횟수를 입력하세요 : ");
		num = s.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("for문을 사용하여 반복 중");
		}
		s.close();

	}

}
