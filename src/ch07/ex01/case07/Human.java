package ch07.ex01.case07;

public class Human {
	// 과제: 아래 세 method call을 한 method call로 refactoring하라.
//	public void eat(Ramen ramen) {}
//	public void eat(Kimchi kimchi) {}
//	public void eat(Apple apple) {}
	
	// 변수의 타입은 인터페이스가 좋다. 유지보수에 유리하다.
	public void eat(Food food) {
		System.out.println(food + "을(를) 먹다.");
	}
}
