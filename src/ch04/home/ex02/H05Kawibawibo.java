package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int human = 0;
		int computer = 0;
		String kawibawibo = "";
		String result = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		human = sc.nextInt();
		
		System.out.print("You: ");
		kawibawibo = switch(human) {
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "none";
		};
		System.out.println(kawibawibo);
		
		if (human <= 0 || 3 < human) result = "Error.";
		else {
			computer = (int)(Math.random() * 3) + 1;
			
			System.out.print("Me: ");
			kawibawibo = switch(computer) {
			case 1 -> "가위";
			case 2 -> "바위";
			case 3 -> "보";
			default -> "none";
			};
			System.out.println(kawibawibo);
			
			result = switch(human - computer) {
			case -1, 2 -> "You lose.";
			case -2, 1 -> "You win.";
			default -> "Fair.";
			};
		}
		System.out.println("\n" + result);
	}
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/