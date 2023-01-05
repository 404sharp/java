package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		// 자바 문법상 collection을 만들 수 있게 해주는 문법이 array
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		// iterating -- array에 있는 데이터를 차례대로 불러내는 작업
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		System.out.println();
		
		// read a collection
		// "for each"
		for(int i: ints) System.out.print(i + " ");
		
		// 객체 생성 전에 데이터가 미리 준비된 경우 쓸 수 있는 문법
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
	}
}
