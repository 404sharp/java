package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1; // 상수를 할당한다.
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b; // 변수를 할당한다.
		System.out.printf("%d, %d\n", a, b);
		
		a = b + 1; // 수식을 할당한다.
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random(); // 메소드 콜을 할당한다.
		System.out.printf("%.2f", d);
	}
}

//CRUD (Create Read Update Delete)