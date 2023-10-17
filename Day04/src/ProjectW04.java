

import java.util.Scanner;

public class ProjectW04 {
	static void print_head() {
		System.out.println("------------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		int [] seats = new int [10];
		Scanner s = new Scanner(System.in);
		for(;;) 
		{
			print_head();
			for (int i = 0; i <10; i++) 
			{
				System.out.print(seats[i] + " ");
			}
			System.out.println(" ");
			{
			}
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1) : "); 
			int select = s.nextInt();
			if (select==-1) {
				break ;
			}
			if (seats[select - 1 ] == 0) {
				seats[select - 1 ] = 1;
				System.out.println("예약되었습니다.");
			} 
			else {
				System.out.println("이미 예약된 자리입니다.");
			}
			s.close();
		}		
	}
}
