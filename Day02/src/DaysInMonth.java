import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		int month;
		int days = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("일 수를 알고싶은 월을 입력하세요(1~12) : ");
		month = s.nextInt();
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		case 2 :
			days = 28;
			break;
		default:
			System.out.println("다시 입력해주세요.");
			break;
		}
		System.out.print(month+"월의 날 수는 "+days);
		s.close();
	}

}
