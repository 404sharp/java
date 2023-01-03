package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B { // 다른 패키지에 있는 클래스가 new를 쓸 수 있기를 바라므로 public
	public void test() {
		A a = new A(); // compiler error -- import is required
		
		int x = 0;
//		x = a.a; // private
//		x = a.b; // default
//		x = a.c; // protected
		x = a.d; // public
		
//		a.m1(); // private
//		a.m2(); // default
//		a.m3(); // protected
		a.m4(); // public
	}
}
