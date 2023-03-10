package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		// say() method 구현
		Human human = () -> System.out.println("Human says.");
		human.say();
//		human.walk(); // interface의 static method는 상속되지 않는다.
		Human.walk();
		human.sleep();
		
		human = new Student();
		human.say();
		human.sleep();
	}
}
