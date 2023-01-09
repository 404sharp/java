package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		// Human 타입의 데이터를 만든다.
		Human human = () -> System.out.println("hello"); // say 메서드를 human 바디에 담다.
		human.say(); // human이라는 변수에 담겨 있는 method
	}
}
