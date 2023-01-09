package ch08.ex02.case03;

public class Main {
	public static void main(String[] args) {
		String enumName = Way.LEFT.name();
		int ordinal = Way.LEFT.ordinal();
		
		System.out.printf("%s %d\n", enumName, ordinal);
		
		enumName = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		
		System.out.printf("%s %d\n", enumName, ordinal);
		
		Way[] ways = Way.values(); // entries를 뽑아낸다.
		for(Way way: ways) System.out.print(way + " ");
		System.out.println();
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way);
	}
}
