package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A'; // 65 in decimal; 'a' is a 97; '0' is a 48
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
	}
}
