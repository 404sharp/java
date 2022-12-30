package ch05.ex05.case07;

public class Farmer { // 행동의 주체. domain이 아니다.
	public Apple sell(int price) {
		Apple apple = new Apple();
		apple.setPrice(price);
		
		return apple;
	}
}
