package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		// 할당 연산자는 계산의 흐름이 오른쪽에서 왼쪽이다.
		int i = 3;
		
		i = i + 2; // 5
		i += 2; // 7
		i -= 2; // 5
		i *= 2; // 10
		i /= 2; // 5
		i %= 2; // 1
		
		System.out.println(i);
	}
}
