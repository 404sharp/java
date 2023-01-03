package ch05.home.ex06.case02answer;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static { // byte code가 loading되면 바로 실행된다.
		sc = new Scanner(System.in);
	}
	
	// 메서드라는 문법을 쓰는 이유는 코드 중복을 피하기 위해서이다.
	
	// input guidance message
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	// input String
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]");
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.err("자연수가 아닙니다.");
		} while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	// information message
	public static void info(Object msg) {
		System.out.println(msg.toString());
	}
	
	// error message
	public static void err(Object msg) {
		System.out.println("ERROR] " + msg.toString());
	}
}
