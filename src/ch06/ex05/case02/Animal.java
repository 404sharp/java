package ch06.ex05.case02;

public class Animal {
	private int age;
	
	// 멤버 변수의 집합이 인스턴스
	public Animal(int age) {
		this.age = age;
	}
	
	public void shout() {
		System.out.println("으르릉");
	}
	
	public int getAge() {
		return this.age; // this의 데이터 타입은 Animal이다.
	}
}
