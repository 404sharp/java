package ch07.ex05.case05;

public class Main3 {
	// 고양이집을 1층집만 만들어 왔다. 이제 2층집을 만들어 본다.
	public static void main(String[] args) {
		Floor floor1 = new Floor(); // 1층
		Floor floor2 = new Floor(); // 2층
		House house = new House();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		// 과제: house의 고양이 여섯 마리에게 밥을 먹여라.
		for(Floor floor: house)
			for(Cat cat: floor)
				cat.eat();
	}
}
/*
과제:
List<Cat> -> Floor
List<List<Cat>> -> House
로 refactoring하라.
*/