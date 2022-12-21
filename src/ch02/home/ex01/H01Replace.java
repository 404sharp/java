package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		// 변수, 상수는 데이터 하나만 저장한다.
		int a = 1;
		int b = 2;
		int temp = 0; // temporary variable
		
		temp = a;
		a = b;
		b = temp;
	} // 변수 이름을 temp로 잡았다. 변수 선언할 때 0으로 초기화시켜야 한다.
}

/* 과제: 두 변수의 데이터를 교환하라.
 * a:1, b:2
 * a:2, b:1
 */
