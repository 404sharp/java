package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		// List는 key가 자동부여된다. Set은 key가 없으므로 중복된 value가 없다.
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		// no duplicates -- key가 없다. value만으로 각 데이터를 구분한다.
		System.out.println(set);
	}
}
