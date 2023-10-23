class CircleA{
	double area; // 원의 면적 넣을 변수
	public static final double PI = 3.14;
	public void GetArea(double r) {
		area = PI*r*r;
	}
}

class CircleB extends CircleA{
	double circum; // 원의 둘레 넣을 변수
	public void GetCircum(double r) {
		circum = 2*PI*r;
	}
}

public class InheritEx2 {
	public static void main(String[] args) {
		CircleB c = new CircleB();
		c.GetArea(3.5);
		c.GetCircum(3.5);
		System.out.println("반지름 3.5인 원의 넓이 : "+c.area);
		System.out.println("반지름 3.5인 원의 둘레 : "+c.circum);
	}
}
