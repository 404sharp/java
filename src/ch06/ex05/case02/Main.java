package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		// getAge()는 Animal에 소속되어 있다.
		System.out.println(dog.getAge()); // Animal의 age가 리턴된다.
	}
}
