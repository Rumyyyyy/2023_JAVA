
public class ContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		for(n=1; n<=10; n++) {
			if(n%2==1) {
				continue;
			}
			System.out.print(n+"\t");
		}
		System.out.println("\n짝수만 출력되었군요!");
	}
}
