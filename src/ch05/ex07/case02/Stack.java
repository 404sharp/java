package ch05.ex07.case02;

import ch05.home.ex06.case02answer.Console;

public class Stack {
	public static void first() {
		Console.info("first() starts.");
		
		int a = 0;
		Stack.second();
		
		Console.info("first() ends.");
	}
	
	public static void second() {
		Console.info("second() starts.");
		
		int a = 0;
		
		Console.info("second() ends.");
	}
}
