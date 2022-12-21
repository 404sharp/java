package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int temp = 0;
		Scanner sc = new Scanner(System.in); 
		
		// presentation logic = IO (Input/Output)를 어떻게 표현할지 나타낸 logic; 프론트엔드가 관리하는 logic
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		temp = a; // business logic: 백엔드가 관리하는 logic
		a = b;
		b = temp;
		System.out.println("=> a, b 값을 교체합니다.");
		System.out.printf("=> a: %d, b: %d\n", a, b);
	}
}

// 과제: H01을 확장성 있게 고도화하라. (입력과 출력을 붙여라.)
