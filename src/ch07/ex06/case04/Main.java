package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		// generic class의 generic type은 new할 때 결정된다.
		// generic method의 generic type은 call할 때 결정된다.
		int i = box.getLastVal(arr1);
		String s = box.getLastVal(arr2);
		
		System.out.printf("%d %s", i, s);
	}
}
