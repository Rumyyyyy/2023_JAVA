import java.util.*;

public class ArrayEx {

	public static void main(String[] args) {
		int [] nu = new int[10];
		int n;
		int total = 0;
		double avg;
		Scanner s = new Scanner(System.in);
		
		for(n=0; n<nu.length; n++){
			System.out.print(n+1+"번째 수를 입력하세요 : ");
			nu[n]=s.nextInt();
			total += nu[n];
		}
		avg = (double)total/nu.length;
		System.out.print("입력한 수는 ");
		for(n=0; n<nu.length; n++) {
			System.out.print(nu[n]+" ");
		}
		System.out.println(" 이고 평균은 "+avg+"입니다.++96/-");
		s.close();
	}

}
