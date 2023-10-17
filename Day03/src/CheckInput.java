import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		int month;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("1~12월 중 하나를 입력해주세요 : ");			
			month = s.nextInt();
		}while(month<1||month>12);
		System.out.println("사용자가 입력한 월은 "+month+"월");
		s.close();
	}

}
