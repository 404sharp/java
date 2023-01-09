package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		System.out.println(add(1, 2)); // 객체가 아닌 literal이 파라미터로 주어졌다.
	}
	
	private static int add(Integer a, Integer b) { // 객체로 autoboxing
		return a + b; // 연산을 위해 auto unboxing -- object로서는 + 연산이 안 된다.
	}
}
