package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result; // return 외의 명령이 있을 때는 블럭 생략 불가. 
		};
		
		// 람다스럽게 바꿔보자.
		calculator = (a, b) -> a + b; // return만 있을 때는 블럭 생략 가능.
		
		System.out.println(calculator.calc(1, 2));
	}
}
