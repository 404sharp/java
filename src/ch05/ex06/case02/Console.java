package ch05.ex06.case02;

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
		Console.inMsg(msg);
		return sc.nextLine().trim();
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
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
