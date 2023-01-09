package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		// key를 내가 수동으로 할당한다.
		Map<Integer, User> map = new HashMap<>();
		
		// put(key, value) -- map에서는 key를 수동지정한다.
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map);
		
		User user = map.get(1); // 조회를 할 때 key를 이용한다.
		System.out.println(user);
		System.out.println(map); // map은 조회 후에도 변함없다.
		
		user = map.remove(1);
		System.out.println(user);
		System.out.println(map); // map은 삭제 후에 변한다.
	}
}
