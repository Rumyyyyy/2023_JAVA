import java.util.Scanner;

class Pat{
	public String race; //애완동물의 종류
	public String name; // 애완동물 이름
	public int age; // 나이
	public int power; // 힘
	public int energy; // 에너지
	int count = 0;
	public Pat() {
		System.out.println("시작");
	}
	public void eat() { // eat 함수
		energy += 15; // energy 증가
		count++; // count 증가
		aging(); // aging (나이 증가 함수) 호출
	}
	public void sleep() {
		energy += 5; // energy 증가
		count++; // count 증가
		aging();
	}
	public void exercise() {
		energy -= 10; // energy 감소
		power += 10; // power 증가
	}
	public void aging() {
		if(count>3) { // count 값 일정 증가 시 age 증가
			age++;
			count =0; // age 증가 후 count 값은 0으로 초기화
		}
	}
	public void attack() {
		energy -= 15; // energy 감소
		power += 20; // power 증가
	}
	public void print() { // 나이, 파워, 에너지의 값을 각각 출력
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}

class Dog extends Pat{ // Pat의 상속을 받는 Dog 클래스
	public int count;
	public Dog(String name){
		this.name = name;
		race = "강아지"; // 반려동물 종류 지정
		age = 0; // age 초깃값
		power = 200; // power 초깃값
		energy = 300; // energy 초깃값
		count = 0;
		System.out.println("강아지("+name+")가 만들어졌습니다.");
	}
	public void eat() {
		energy += 15;
		count++;
		aging();
	}
	public void sleep() {
		energy += 5;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 20;
		power += 20;
	}
	public void aging() {
		if(count>3) {
			age++;
			count =0;
		}
	}
	public void attack() {
		energy -= 20;
		power += 30;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
}

class Cat extends Pat{ // Pat의 상속을 받는 Cat 클래스
	public int count;
	public Cat(String name) {
		this.name = name;
		 race = "고양이"; // 반려동물 종류 지정
		 age = 0; // age 초깃값
		 power = 100; // power 초깃값
		 count = 0;
		 System.out.println("고양이("+name+")가 만들어졌습니다.");
	}
}

class Rabbit extends Pat{ // Pat의 상속을 받는 Rabbit 클래스
	public int count;
	public Rabbit(String name) {
		this.name = name;
		race = "토끼"; // 반려동물 종류 지정
		age = 0; // age 초깃값
		power = 30; // power 초깃값
		energy = 100; // energy 초깃값
		count = 0;
		System.out.println("토끼("+name+")가 만들어졌습니다.");
	}public void eat() {
		energy += 5;
		count++;
		aging();
	}
	public void sleep() {
		energy += 3;
		count++;
		aging();
	}
	public void exercise() {
		energy -= 3;
		power += 7;
	}
	public void aging() {
		if(count>3) {
			age++;
			count =0;
		}
	}
	public void attack() {
		energy -= 20;
		power += 30;
	}
	public void print() {
		System.out.println("나이: "+age);
		System.out.println("파워: "+power);
		System.out.println("에너지: "+energy);
	}
	
}

public class PatGrow {

	public static void main(String[] args) { // 메인함수
		Scanner sc = new Scanner(System.in);
		Pat p = null; // Pat 클래스를 인스턴스 선언하고 초깃값 null, 애완동물의 종류에 따라 p가 해당 하위 클래스의 인스턴스를 참조하게 됨
		System.out.println("애완동물을 선택하세요");
		System.out.print("1.강아지, 2.고양이, 3.토끼 : ");
		int x = sc.nextInt();
		System.out.println("애완동물의 이름을 입력하세요.");
		String name = sc.next();
		if(x==1) { // 사용자에게 입력받은 번호로 각각 print를 함
			p = new Dog(name);
		}else if(x==2) {
			p = new Cat(name);
		}else if(x==3) {
			p = new Rabbit(name);
		}
		boolean flag = true; // 게임 루프를 제어하기 위한 변수 선언 후 초깃값 true
		while(flag) { // 무한 반복문
			System.out.println("메뉴");
			System.out.println("1.밥먹기, 2.잠자기, 3.운동하기, 4.공격, 5.끝");
			x = sc.nextInt();
			switch(x) {
			case 1:
				p.eat();
				p.print();
				break;
			case 2:
				p.sleep();
				p.print();
				break;
			case 3:
				p.exercise();
				p.print();
				if(p.energy<=0) {
					System.out.println("게임 종료");
					flag = false; // flag에게 false를 전달하고 게임을 종료시킴
				}
				break;
			case 4:
				p.attack();
				p.print();
				if(p.energy<=0) {
					System.out.println("게임 종료");
					flag = false;
				}
				break;
			case 5:
				flag = false;
			}
		}
	}
}