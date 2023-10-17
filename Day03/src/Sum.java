import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1부터 더할 값을 입력하세요 : ");
		int m = s.nextInt();
		int sum = 0;
		for(int n = 1; n<m+1; n++) {
			sum = sum + n;
		}
		System.out.println("1부터 "+m+"까지의 합은 "+sum);
		s.close();
	}

}
