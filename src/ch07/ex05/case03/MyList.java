package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0)); // 0이란 key를 갖고 있는 value를 검색한다.
		
		for(int k = 0; k < list.size(); k++)
			System.out.print(list.get(k) + " ");
		System.out.println();
		
		list.remove(1); // 1 이후의 key들을 하나씩 당긴다.
		System.out.println(list);
		
		// 과제: list의 모든 원소를 삭제하라.
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		list.clear();
		System.out.println(list);
		// 또는
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		list.removeAll(list); // 주어list에서 목적어list를 삭제한다.
		System.out.println(list);
		// 또는
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
		// 또는
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);
		System.out.println(list);
	}
}
