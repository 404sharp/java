package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
		
		if (hour < 12) {
			System.out.println("Good morning.");
		} else if (hour < 18) {
			System.out.println("Good afternoon.");
		} else if (hour < 21) {
			System.out.println("Good evening.");
		} else {
			System.out.println("Good night.");
		}
		
		// 과제: code 7~15 line 을 개선하라.
		//		.println() 을 한 번만 사용하라.
		
		String greeting = "";
		if (hour < 12) {
			greeting = "Good morning.";
		} else if (hour < 18) {
			greeting = "Good afternoon.";
		} else if (hour < 21) {
			greeting = "Good evening.";
		} else {
			greeting = "Good night.";
		}
		System.out.println(greeting);
	}
}
