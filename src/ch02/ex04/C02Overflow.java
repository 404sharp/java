package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
//		byte b = 128; // error
		byte b = 127;
//		b = b + 1; // error, promoted to int
		b++;
		System.out.println(b);
	}
}
