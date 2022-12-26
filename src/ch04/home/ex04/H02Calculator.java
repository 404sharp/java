package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int a = 0;
		String op = "";
		int b = 0;
		int result = 0;
		boolean isGood = false;
		boolean repeat = false;

		do {
			isGood = false;
			do {
				System.out.print("a: ");
				input = sc.nextLine();
				isGood = input.matches("[0-9]+");
				if (!isGood) System.out.println("0 또는 자연수를 입력하세요.");
				else a = Integer.parseInt(input);
			} while (!isGood);
	
			isGood = false;
			do {
				System.out.print("op: ");
				op = sc.nextLine();
				isGood = op.matches("[\\+\\-\\*\\/]");
				if (!isGood) System.out.println("+, -, *, / 중 하나를 입력하세요.");
			} while (!isGood);
			
			isGood = false;
			do {
				System.out.print("b: ");
				input = sc.nextLine();
				isGood = input.matches("[0-9]+");
				if (!isGood) System.out.println("0 또는 자연수를 입력하세요.");
				else b = Integer.parseInt(input);
			} while (!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.println(a + " " + op + " " + b + " = " + result);
			
			System.out.print("continue(y/n)? ");
			input = sc.nextLine();
			if (input.equalsIgnoreCase("y")) repeat = true;
			else repeat = false;
		} while(repeat);
		
		System.out.println("end.");
	}
}
/*
과제: 계산기를 만들어라.
입력값 a, b는 0 또는 자연수이다.
연산자 op는 +, -, *, / 이다.
/는 몫만을 구한다.

continue(y/n)? 에서 y 또는 Y를 입력하면 계산 작업을 재수행한다.
y 또는 Y 외를 입력하면 앱을 종료한다.
--

a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
*/