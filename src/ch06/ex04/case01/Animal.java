package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
	// 생성자는 멤버가 아니므로 상속되지 않는다.
//	public Animal() {}
	
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAnimalName() {
		return this.animalName;
	}
}
