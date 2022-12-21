package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // a constant parameter
		System.out.println(score); // a variable parameter
		System.out.println(100 + 1); // an expression parameter
		System.out.println(Math.random()); // a method call parameter
		// random() returns a value that is >= 0.0, < 1.0
		
		System.out.print(200);
		System.out.print(300);
		System.out.print('\n'); // data type is char (single quotes)
		// print는 \n이 오면 줄바꿈을 한다. 즉 줄바꿈은 \n이 아닌 print의 동작이다.
		System.out.print(400);
		System.out.println();
		
		// %b boolean %c char %d decimal %f float %s string
		// separator is a space '\s'
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		// 과제: 위 출력문에서 구분자로 '/'를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		
		// 숫자: 너비, -: 왼쪽정렬
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은(는) %d살입니다.", name, age);
		System.out.println();
		// +는 concatenate (붙이기)
		System.out.println(name + "은(는) " + age + "살입니다."); // snippet (코드 조각)
	}
}
