package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		// Ctrl+Shift+O imports classes automatically
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("문자열을 입력하세요.\n> ");
//		// sc라는 변수를 쓰는 게 아니라 sc 안에 들어 있는 데이터를 쓰는 것이다.
//		String str = sc.nextLine(); // soft coding: 확장성을 만드는 방법 중 하나
//		System.out.println("입력했습니다.");
//		// 과제: '<입력값>을 입력했습니다.'를 출력하라.
//		System.out.printf("%s을(를) 입력했습니다.", str);
		
//		System.out.print("숫자를 입력하세요.\n> ");
//		int i = sc.nextInt();
//		System.out.println(i + "을(를) 입력했습니다.");
//		
//		System.out.print("숫자를 입력하세요.\n> ");
//		i = sc.nextInt(); sc.nextLine(); // \n을 눌렀다고 착각, 쓰레기이다. 쓰레기를 치워준다.
//		System.out.println(i + "을(를) 입력했습니다.");
//		
//		// 버그 나옴
//		// 마지막 줄에 \n을 입력했다고 버그가 발생한 것이다.
//		// 22번째 줄에 sc.nextLine();을 주어 쓰레기를 처리한다.
//		System.out.print("문자열을 입력하세요.\n> ");
//		String str = sc.nextLine();
//		System.out.println(str + "을(를) 입력했습니다.");
		
		System.out.print("문자를 입력하세요.\n> ");
		char c = sc.nextLine().charAt(0); // charAt(0): 0번째 문자를 입력하게 한다.
		System.out.println(c + "을(를) 입력했습니다.");
	}
}
