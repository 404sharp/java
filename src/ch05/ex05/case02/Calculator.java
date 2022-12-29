package ch05.ex05.case02;

public class Calculator {
	public double add(int a, int b) {
		// int가 결과값이지만 메서드 시그너처에 있는 double로 promotion된다.
		return a + b;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
}
