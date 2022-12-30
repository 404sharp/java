package ch05.ex05.case01;

public class Calculator { // methods only. not a domain.
	// return type은 메서드를 구분하는 요소가 아니다.
	// 이름이 add(int, int)
	public int add(int a, int b) {
		return a + b;
	}
	
	// 이름이 add(int, int) -- 중복된다.
//	public int add(int x, int y) {
//		return x + y;
//	}
	
	// 이름이 add(int, int, int) -- overloading
	public int add(int a, int b, int c) {
		return a + b + c;
	}
}
