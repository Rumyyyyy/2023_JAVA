import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 10;
		int[] numbers = new int[SIZE];
		for(int i=0; i<SIZE; i++) {
			int r = (int)(Math.random()*100);	 
			// random은 0부터 1사이의 값을 뽑아냄 그러기에 (int)로 형변환
			numbers[i]=r;
		}
		System.out.print("최초의 리스트 : ");
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		Arrays.sort(numbers);
		System.out.print("\n정렬된 리스트 : ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}
	}

}
