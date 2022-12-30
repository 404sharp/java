package ch05.home.ex06.case02;

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
		boolean isGood = false;
		String input = "";
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine().trim();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if (!isGood) err("문자가 아닙니다.");
		} while(!isGood);
		
		return input;
	}
	
	// input number
	public static int inNum(String msg) {
		boolean isGood = false;
		String input = "";
		int num = 0;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if (isGood) {
				num = Integer.parseInt(input);
				if (num == 0) isGood = false;
			}
			if (!isGood) err("자연수가 아닙니다.");
		} while(!isGood);

		return num;
	}
	
	// information message
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	// error message
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
