package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	// 고양이집을 1층집만 만들어 왔다. 이제 2층집을 만들어 본다.
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>(); // 1층
		List<Cat> floor2 = new ArrayList<>(); // 2층
		List<List<Cat>> house = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		// 과제: house의 고양이 여섯 마리에게 밥을 먹여라.
		for(List<Cat> floor: house)
			for(Cat cat: floor)
				cat.eat();
	}
}
