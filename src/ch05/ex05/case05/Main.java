package ch05.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Basket basket = new Basket();
		
		// 사과 바구니에 사과를 넣다.
		basket.setApple(apple); // basket과 apple이 관계를 맺는다.
		// 사과 바구니에서 사과를 꺼내다.
		basket.getApple();
	}
}
