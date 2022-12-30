package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love Java.");
//		Man.tell(""); // wrong
		
		Man man = new Man();
		man.tell("I LOVE JAVA.");
		man.say("Hello."); // warning: use static methods with class names
	}
}
