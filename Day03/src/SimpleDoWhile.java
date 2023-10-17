import java.util.Scanner;

public class SimpleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("반복 횟수를 입력해주세요 : ");
		j = s.nextInt();
		i = 0;
		do {
			System.out.println("do-while문으로 반복");
			i++;
		}while(i<j);
		s.close();
	}

}
