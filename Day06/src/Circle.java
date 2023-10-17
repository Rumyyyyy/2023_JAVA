
public class Circle {
	static final double PI = 3.14;
	double r, circum, area;
	void CircleCalc(double n) {
		r = n;
		circum = 2*PI*r;
		area = PI*r*r;
		ShowResult(this); // 객체 자신을 인수로 사욜ㅇ하고자 할 때
	}
	void ShowResult(Circle c) {
		System.out.println("반지름이 "+c.r+"인 원의 둘레는 "+c.circum+" 면적은 "+c.area);
	}
}
