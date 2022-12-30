package ch05.ex05.case02;

public class Calculator {
	// 이름이 add(int, int)
	public double add(int a, int b) {
		// int가 결과값이지만 메서드 선언부에 있는 double로 promotion된다.
		return a + b;
	}
	
	// 이름이 add(double, double) -- overloading
	public double add(double a, double b) {
		return a + b;
	}
}
