import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		
		System.out.print("연도를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int year= s.nextInt();	
		
		int month;
		int days = 0;
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
			if ((year%4==0 && year%100!=0) || year%400==0) {
				days = 29;
			}else {
				days = 28;
			}
			break;
		default:
			System.out.println("다시 입력해주세요.");
			break;
		}
		System.out.print(year+"년의"+month+"월의 날 수는 "+days+"일");
		s.close();
	}

}
