import java.util.*;
public class NumberGame2 {

	public static void main(String[] args) {
		int guess, answer;
		Random generator = new Random();
		guess = generator.nextInt();
		Scanner s = new Scanner(System.in);
		int tries = 0; // 반복 횟수를 저장하는 변수
		
		// do-while
		do {
			System.out.print("정답을 추측하여 보세여 : ");
			answer = s.nextInt();
			tries++;
			if(guess<answer) {
				System.out.println("제시한 정수가 높습니다.");
			}
			if(guess>answer){
				System.out.println("제시한 정수가 낮습니다");
			}
		}while(guess!=answer);
		System.out.println("축하합니다. 시도횟수 = "+tries);
		s.close();

	}

}
