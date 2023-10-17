import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int STUDENTS = 5;
		int total = 0;
		Scanner s = new Scanner(System.in);
		int [] scores = new int[STUDENTS]; // 크기가 STUDENTS인 배열 생성
		for(int i=0; i<scores.length; i++) {
			System.out.print("성적을 입력하세요: ");
			scores[i] = s.nextInt(); // i번째 원소에 성적을 저장함
		}
		for(int i=0; i<scores.length; i++) {
			total += scores[i];
		}
		System.out.println("평균 성적은 "+total/STUDENTS);
		s.close();
	}

}
