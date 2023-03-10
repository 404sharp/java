package ch03.ex04;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술 연산자는 32bit 단위로 IO를 한다.
		byte a = 3;
		byte b = 2;
		// 과제: 아래 compile error 를 해결하라.
		//       byte c 는 건드리지 않는다.
		byte c = (byte)(a + b);
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b; // int끼리 계산하니까 결과값도 int, 뒤늦게 promotion
		System.out.println(d);
		
		// 과제: d 변수에 1.5가 저장되도록 하라.
		d = (double)a / b; // double로 promotion하여 계산
		System.out.println(d);
		d = 1.0 * a / b; // 1.0을 곱하고 시작하여 a가 double이 된다.
		System.out.println(d);
		
		d = (double)(a / b); // a/b가 이미 int로 연산되었다.
		System.out.println(d);
		d = a / b * 1.0; // a/b가 이미 int로 연산되었다.
		System.out.println(d);
	}
}
