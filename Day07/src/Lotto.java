import java.util.Scanner;

	class GenNum{ // 로또 번호 생성 및 관리
		private boolean duplicate = false; // 중복 숫자 확인
		private int [] numbers;
		public void printNumber() { // 로또 번호 출력
			if(numbers==null||numbers[0]==0) {
				System.out.println("(System)Empty Value");
				return;
			}
			for(int i=0; i<numbers.length; i++) {
				if(i==6) {
					System.out.println("(보너스번호)>>>"+numbers[i]);
				}else {
					System.out.println(">>> "+numbers[i]);
				}
			}
		}
		
		public int[] start_generation() { // 로또 번호 생성, 배열로 반환
			numbers = new int[7];
			int [] imsi = getNomalNumber();
			for(int i=0; i<numbers.length; i++) {
				if(i==6) {
					numbers[i] = getBonusNumber(numbers);
				}else {
					numbers[i] = imsi[i];
				}
			}
			return numbers;
		}
		
		private int getBonusNumber(int[] nomal_number) { // 추가 번호 생성 + 중복 방지
			int bonus = 0;
			int imsi = 0;
			while(true) {
				imsi = (int)(Math.random()*45+1);
				for(int j=0; j<nomal_number.length; j++) {
					if(nomal_number[j]==imsi) {
						duplicate = true;
					}
				}
				if(duplicate) {
					duplicate = false;
					continue;
				}else {
					break;
				}
			}
			bonus = imsi;
			System.out.println("(로또 번호 생성기) 보너스 번호 생성 완료");
			return bonus;
		}
		
		private int[] getNomalNumber() { // 여섯개의 로또 번호 생성 + 중복 방지
			int [] normal_number = new int[6];
			int imsi = 0;
			for (int i=0; i<normal_number.length; i++) {
				imsi = (int)(Math.random()*45+1);
				for(int j=0; j<i; j++) {
					if(normal_number[j]==imsi) {
						duplicate = true;
					}
				}
				if(!duplicate) {
					normal_number[i]=imsi;
				}else {
					duplicate = false;
					i--;
				}
			}
			System.out.println("(로또 번호 생성기) 로또 번호 생성 완료");
			return normal_number;
		}
	}
	public class Lotto{ // 프로그램 클래스
		private int command = 0;
		Scanner scan = new Scanner(System.in);
		private GenNum program = null;
		public final int GENERATION_NUMBER = 1;
		public final int PRINT_NUMBER = 2;
		public final int EXIT = 3;
		public Lotto(){
			Scanner scan = new Scanner(System.in);
			program = new GenNum(); // 사용자가 선택한 항목에 따른 메소드 호출
			start();
		}
		public void start() { // 사용자 입력 처리
			System.out.println("로또 프로그램이 시작됩니다.");
			System.out.println();
			do {
				System.out.println("===============로또번호생성기 메뉴===============");
				System.out.println("1.추첨 2.보기 3.끝내기");
				System.out.println("--------------------------------------------");
				System.out.print(">> " );
				this.command = scan.nextInt();
				switch(this.command) {
				case GENERATION_NUMBER:
					program.start_generation();
					break;
				case PRINT_NUMBER:
					program.printNumber();
					break;
				case EXIT:
					System.out.println("(로또 번호 생성기) 행운이 있기를!");
					return;
				}
			}while(true);
		}
	}
	