
public class GuGu5Dan {

	public static void main(String[] args) {
		int num;
		System.out.println("구구단 5단입니다.");
		for(num=1; num<10; num++) {
			System.out.print("5 x "+num+" = "+5*num);
			if(num%3==0) {
				System.out.print("\n");
			}else {
				System.out.print("\t");
			}
		}
		System.out.print("\n\n");
	}

}
