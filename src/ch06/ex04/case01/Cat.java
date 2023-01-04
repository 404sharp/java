package ch06.ex04.case01;

// superclass/subclass, parent class/child class
public class Cat extends Animal {
	private int age;
	
//	public Cat() { // 자식 클래스 기본 생성자
//		super(); // 자동 추가된다. 그런데 없다. 그러므로 명시적으로 있는 것을 호출한다.
//	}
	
	public Cat(String catName, int age) {
		// super()가 안 되므로 명시적으로 호출한다.
		super(catName); // 생성자는 멤버 변수 초기화를 위해 호출한다.
//		this.animalName = catName; // private
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d\n", this.getAnimalName(), this.getAge());
	}
}
