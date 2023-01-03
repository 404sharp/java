package ch06.ex03.case02;

public class Cat extends Animal { // 상속은 "is a" 관계이다. Cat "is an" Animal.
	@Override // annotation (주석) -- metadata를 표현한다.
	public void shout() { // overriding으로 알고리즘을 바꾼다.
		System.out.println("야옹야옹."); // method body를 바꿔치기 하는 것
	}
	
}
