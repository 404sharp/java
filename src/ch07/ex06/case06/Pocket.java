package ch07.ex06.case06;

import java.util.List;

// generic은 design할 때, wildcard는 use할 때 쓰는 것이다.
public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
//		new Number(1) + new Number(2);
	}
	
	// unbounded wildcard
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	// upper bounded wildcard
	// ~이하
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		
		return sum;
	}
}
