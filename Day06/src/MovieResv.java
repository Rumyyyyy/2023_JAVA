import java.util.*;
public class MovieResv {
	// 좌석을 표시할 배열
	String [][] seat = new String[5][10];
	//좌석에 따른 배열의 행번호, 열번호, 기능동작
	char rn;
	int row_int, col, system;
	boolean confirm;
	//이름을 확인받을 변수, 이름을 받을 변수, 취소에 쓸 이름, 열 이름, 예약여부표시
	String con_char, name, c_name, row, q;
	String pw = "java"; // 관리자 비밀번호
	public void Interface() {
		System.out.println("안녕하세요. 좌석 예약 시스템입니다. ");
		System.out.println("번호를 선택하세요. ");
		System.out.print("예약(1), 취소(2), 좌석조회(3), 종료(4)");
		Scanner scan = new Scanner(System.in);
		try {
			system = scan.nextInt();
			switch(system) {
			case 0:
				Admin();
				break;
			case 1:
				Reservation();
				break;
			case 2:
				Cancel();
				break;
			case 3:
				Reference();
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}catch(InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public void Admin() { // 관리자 프로그램
		System.out.print("관리자 비밀번호를 입력하세요 : "); // "java"를 받음
		Scanner scan = new Scanner(System.in);
		if(scan.nextLine().equals(pw)) { // "java"라는 값이 입력 됐는지 확인
			System.out.println("관리자 로그인 되었습니다.");
			confirm = true;
			do {
				try {
					System.out.println("취소(1), 좌석조회(2), 종료(3)");
					system = new Scanner(System.in).nextInt();
					switch(system) {
					case 1:
						AdminCancel(); // 관리자 모드 취소 함수로 이동
						break;
					case 2:
						AdminRef(); // 관리자 좌석 조회로 함수로 이동
						break;
					case 3:
						System.out.println("관리자모드 종료");
						break;
					}
				}catch(InputMismatchException e) {
					System.out.println("잘못입력하셨습니다.");
				}
			}while(confirm);
		}else { // pw의 값이 "java" 아닌 경우
			System.out.println("비밀번호가 일치하지 않습니다.\n");
		}
	}
	
	public void Initialize() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				seat[i][j]="___"; // seat가 예약되지 않은 상태의 기본값 ___
			}
		}
	}
	
	public void AdminRef() { // 관리자 좌석 조회 함수
		rn = 'A';
		for(int i=0; i<5; i++) {
			System.out.println(rn+"열");
			col = 1;
			rn++;
			for(int j=0; j<10; j++) {
				q = seat[i][j].equals("___")?"□":"■"; // 예약된 좌석, 안 된 좌석 구분
				System.out.print(col+q);
				col++;
			}
			System.out.println();
		}
	}
	
	public void Reference() { // 좌석 조회 함수
		rn = 'A';
		for(int i=0; i<5; i++) {
			System.out.println(rn+"열");
			col=1;
			rn++;
			for(int j=0; j<10; j++) {
				q = seat[i][j].equals("___")?"□":"■"; // 예약된 좌석, 안 된 좌석 구분
				System.out.print(col+q);
				col++;
			}
			System.out.println();
		}
	}
	
	public void Reservation() { // 예약 함수
		Reference();
		do {
			confirm = true;
			System.out.print("예약자 성함을 입력해주세요 : "); // 예약자 이름
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			System.out.println("예약자 성함을 확인해주세요 : "+name);
			System.out.print("맞으면 Y, 틀리면 N : "); // 틀린 경우 사용자 이름 다시 받음
			con_char = scan.next();
			confirm = (con_char.equals("Y"))||con_char.equals("y")?false:true; // 이름이 맞는 경우
		}while(confirm);
		do {
			confirm = true;
			System.out.println("열을 선택하세요 (A~E): ");
			Scanner scan = new Scanner(System.in);
			try {
				row = scan.next();
			}catch(Exception e) {
				System.out.println("A~E만 입력하세요");
			}
			if(row.equals("A")||row.equals("a")){
				row_int = 0;
				confirm = false;
			}else if(row.equals("B")||row.equals("b")){
				row_int = 1;
				confirm = false;
			}else if(row.equals("C")||row.equals("c")){
				row_int = 2;
				confirm = false;
			}else if(row.equals("D")||row.equals("d")){
				row_int = 3;
				confirm = false;
			}else if(row.equals("E")||row.equals("e")){
				row_int = 4;
				confirm = false;
			}else {
				System.out.println("A~E만 입력하세요");
			}
		}while(confirm);
		do {
			confirm = true;
			Scanner scan = new Scanner(System.in);
			try {
				System.out.print("좌석 번호를 선택해주세요. 1~10: ");
				col = scan.nextInt();
				if(col>=1 && col <=10) {
					if(seat[row_int][col-1].equals("___")) {
						seat[row_int][col-1] = name;
						confirm = false;
					}else { // 예약된 좌석인 경우
						System.out.println("이미 예약된 자리입니다.");
					}
				}else {
					System.out.println("좌석은 1~10번까지 입니다.");
				}
			}catch(Exception e) {
				System.out.println("좌석은 1~10번까지 입니다.");
			}
		}while(confirm);
		System.out.println(seat[row_int][col-1]+"님 "+row+"열"+col+"번 으로 예약이 완료되었습니다. ");
		Reference(); // 좌석 조회 함수
	}
	
	public void AdminCancel() { // 관리자 예약 취소 함수
		System.out.println("이름을 입력하세요."); // 사용자의 이름을 받음
		Scanner scan = new Scanner(System.in);
		c_name = scan.nextLine();
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				if(seat[i][j].equals(c_name)) {
					seat[i][j]="___";
					System.out.println(c_name+"님 취소가 완료되었습니다.");
					AdminRef(); // 관리자 좌석 조회 함수
				}
			}
		}
	}
	
	public void Cancel() { // 예약 취소 함수
		System.out.println("이름을 입력하세요."); // 예약한 사용자 이름 입력
		Scanner scan = new Scanner(System.in);
		c_name = scan.nextLine();
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				if(seat[i][j].equals(c_name)) {
					seat[i][j]="___";
					System.out.println(c_name+"님 취소가 완료되었습니다.");
					AdminRef(); // 관리자 좌석 조회 함수
				}
			}
		}
	}
	
	public static void main(String[] args) {
		MovieResv movie = new MovieResv();
		movie.Initialize();
		while(true) {
			movie.Interface();
			if(movie.system ==4) {
				break;
			}
		}
	}
}
