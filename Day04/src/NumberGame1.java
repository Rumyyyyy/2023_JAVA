import java.util.Random;
import java.util.Scanner;

public class NumberGame1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;

		
		boolean game = true;

		while(game)
		{
			System.out.println("숫자 예측 게임");
			Random r = new Random();
			int k = r.nextInt(100)+1;
			int n = 0;


			while(true)
			{
				System.out.print("숫자를 입력하여 주세요 :");
				n = sc.nextInt(); // 숫자 입력

				if(n < 1 || n >100){
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					i++;
					continue;
				}

				if(n == k) // 정답 시
				{
					System.out.println("축하드립니다 정답입니다.");
					System.out.println(i+"번 시도하였습니다.");
					break;
				}
				else if(n < k)
				{
					System.out.println("제시한 정수가 낮습니다.");
					i++;
				}
				else
				{
					System.out.println("제시한 정수가 높습니다.");
					i++;
				}

			}
			System.out.println("게임이 종료되었습니다.");
			sc.close();
			break;
		}
	}
}

