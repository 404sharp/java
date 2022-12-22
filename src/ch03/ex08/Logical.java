package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		System.out.println(b);
		b = (2 > 1) && (2 > 1); // true && true
		System.out.println(b);
		b = 2 < 1 && 2 > 1; // false && true
		System.out.println(b);
		b = 2 < 1 || 2 > 1; // false || true
		System.out.println(b);
		b = 2 < 1 || 2 < 1; // false || false
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; // false && ignore (&&'s result is false already)
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);

		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0; // false & false
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);

		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0; // false || false
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);

		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0; // true || ignore (||'s result is true already)
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);

		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0; // true | false
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
	}
}
