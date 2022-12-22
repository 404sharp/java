package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B';
		System.out.println(b);
		b = '0' == 0;
		System.out.println(b);
		b = 'A' != 65;
		System.out.println(b);
		b = 10.0 == 10.0f;
		System.out.println(b);
		b = 0.1 == 0.1f; // 0.1f is not exactly 0.1
		System.out.println(b);
		b = (float)0.1 == 0.1f;
		System.out.println(b);
	}
}
