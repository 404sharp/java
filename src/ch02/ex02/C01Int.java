package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // decimal
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // octal
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // hexadecimal
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // binary
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; // _ is a separator; 1,234,567 is a string
		System.out.println(x + 1);
		
		double y = 1e1;
		System.out.println(y);
	}
}
