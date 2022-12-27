package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		
		do {
			System.out.print("> ");
			isGood = sc.nextLine().matches("[1-9]");
			if (!isGood) System.out.println("한 자리 자연수를 입력하세요.");
		} while (!isGood);
		
		System.out.println("끝.");
		
		char ch = '\0';
		int number = 0;
		boolean repeat = false;
		
		repeat = true;
		do {
			System.out.print("한 자리 자연수를 입력하세요.: ");
			input = sc.nextLine();
			if (input.length() == 1) {
				ch = input.charAt(0);
				if ('1' <= ch && ch <= '9') {
					number = Integer.parseInt(input);
					if (1 <= number && number <= 9) repeat = false;
				}
			}
			if (repeat == true)
				System.out.println("다시 입력하세요.");
		} while(repeat);
		
		System.out.println("입력값: " + input);
	}
}
/*
과제: 한 자리 자연수를 입력받아라.
*/