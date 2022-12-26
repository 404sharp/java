package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; // 숫자를 문자열로 바꿀 때의 알고리즘
		System.out.println(sumStr);
		
		int i = Integer.parseInt(sumStr); // 문자열을 숫자로 바꾼다.
		
		String s = a + b + ""; // +연산자는 왼쪽부터 처리한다.
		System.out.println(s); // 문자열 3을 출력한다.
		
		s = "" + a + b;
		System.out.println(s); // 문자열 12를 출력한다.
		
		String dialog = "John said, \"Hello.\""; // 큰따옴표는 String 타입을 나타내는 특수문자
		System.out.println(dialog);
	}
}
