package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c; // promotion
		A a = c; //		then assigned
		
		c = (C)a; // 부모가 큰 수, 자식이 작은 수
		c = (C)b;
		
		b = (B)a;
		
//		String s = (String)c; // 불가. 갖고 있는 타입 중에서만 변환이 가능하다.
	}
}
