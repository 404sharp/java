package ch04.ex01;

import java.util.Scanner;

public class C06Prize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.냉장고, 2.세탁기\n> ");
		choice = sc.nextInt();
		
		if (choice == 1) prize = "냉장고";
		else if (choice == 2) prize = "세탁기";
		else prize = "화장지"; // 업무를 바꿀 경우(이상적인 경우)
		// 개발자 단에서 처리할 수 있는 것은 에러 메시지를 보이고 다시 입력받는 것이다.
		
		System.out.println(prize);
	}
}
