package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 업무와 관련된 변수들
		User user = new User();
		String userName = "";
		int age = 0;
		LocalDate joinDate = null;
		
		// IO와 관련된 변수들
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		
		do {
			System.out.print("이름: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힣]+");
			if (!isGood) System.out.println("ERROR] 이름을 입력하세요.");
		} while (!isGood);
		
		isGood = false;
		do {
			System.out.print("나이: ");
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if (!isGood) System.out.println("ERROR] 나이를 입력하세요.");
			else age = Integer.parseInt(input);
		} while (!isGood);
		
		joinDate = LocalDate.now();
		
		user.setUserName(userName);
		user.setAge(age);
		user.setJoinDate(joinDate);
		
		System.out.println();
		System.out.printf("이름: %s\n", user.getUserName());
		System.out.printf("나이: %d\n", user.getAge());
		System.out.println("가입일: " + user.getJoinDate());
	}
}
/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 수동 입력한다.
app이 user의 가입일을 자동 입력한다.
--

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/