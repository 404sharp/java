package ch05.ex05.case05;

public class Basket { // domain
	// 과제: 사과 바구니를 디자인하라.
	// basket과 apple이 관계를 맺도록 디자인했다.
	private Apple apple; // A "has a" B; Basket "has an" Apple
	
	public Apple getApple() {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
