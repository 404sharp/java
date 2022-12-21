package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = '\0';
		int unicodeNumber;
		
		System.out.print("문자: ");
		ch = sc.nextLine().charAt(0);
		unicodeNumber = ch; // promotion이므로 (int)는 생략 가능하다.
		System.out.printf("%c의 unicode는 %d입니다.\n", ch, unicodeNumber);
	}
}
/*
과제: 입력한 문자의 unicode를 출력하라.
	String API를 사용치 않는다.
--

문자: A
A의 unicode는 65입니다.
*/
