package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b; // int 연산이므로 값이 변질된다.
		System.out.println(c);
		
		c = (long)a * b; // long 연산이므로 값이 보존된다.
		System.out.println(c);
		
		int x = a * b / a;
		System.out.println(x);
		
		x = a / b * a; // 나눗셈을 먼저 하여 필요한 표현 범위를 줄인다.
		System.out.println(x);
	}
}
