package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A(); // 내가 필요로 하는 멤버 변수와 메서드들이 있기 때문에 다른 객체를 쓴다.
		// A를 쓰지 않으면(객체 지향을 하지 않으면) 코드 중복이 발생한다.
		
		int x = 0;
//		x = a.a; // private
		x = a.b;
		x = a.c;
		x = a.d;
		
//		a.m1(); // private
		a.m2();
		a.m3();
		a.m4();
	}
}
