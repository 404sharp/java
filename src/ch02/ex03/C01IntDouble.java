package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		// casting -- implicit promotion
		d = i; // read i, write d -- i is retained
		System.out.printf("%f, %d\n", d, i);
		
		// casting -- explicit promotion
		d = (double)i; // casting operator returns value
		System.out.printf("%f, %d\n", d, i);
		
		// casting -- explicit casting
		i = (int)d; // casting operator returns value
		System.out.printf("%f, %d\n", d, i);
	}
}
