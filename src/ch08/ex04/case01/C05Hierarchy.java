package ch08.ex04.case01;

public class C05Hierarchy {
	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		// exceptions should be listed in child -> parent order
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException.");
		} catch(Exception e) {
			System.err.println("Exception.");
		}
	}
}
