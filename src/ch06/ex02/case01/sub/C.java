package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
//		x = this.a; // private -- 갖고 있지만 못 쓴다.
//		x = this.b; // default -- 갖고 있지만 못 쓴다.
		x = this.c; // protected -- 자식한텐 보여주고 싶을 때 쓴다.
		x = this.d; // public
		
//		this.m1(); // private
//		this.m2(); // default
		this.m3(); // protected
		this.m4(); // public
	}
}
