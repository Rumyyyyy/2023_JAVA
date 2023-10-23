class Solider extends Weapon3{
	@Override
	void Fire() {
		System.out.println("탕탕탕");
	}
	void Walk() {
		System.out.println("걷기");
	}
}

class Tank extends Weapon3{
	void Fire() {
		System.out.println("펑펑");
	}
	void Forward() {
		System.out.println("전진");
	}
}

class Fighter extends Weapon3{
	void Fire() {
		System.out.println("슈웅~쾅");
	}
	void Fly() {
		System.out.println("날기");
	}
}

public class AbsClsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solider s = new Solider();
		Tank t = new Tank();
		Fighter f = new Fighter();
		s.Walk();
		s.Fire();
		t.Fire();
		t.Forward();
		f.Fire();
		f.Fly();
	}

}
