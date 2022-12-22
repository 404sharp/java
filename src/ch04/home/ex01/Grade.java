package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		String tail = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = "A";
			tail = (score < 94) ? "-" : (score >= 98) ? "+" : "";
		} else if (score >= 80) {
			grade = "B";
			tail = (score < 84) ? "-" : (score >= 88) ? "+" : "";
		} else grade = "C";
		grade += tail;
		System.out.println(grade);
	}
}
/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수: 100
A+
*/