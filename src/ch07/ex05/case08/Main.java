package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		List<Creeper> pen = new ArrayList<>(); // 들짐승들을 가둘 우리를 만든다.
		pen.add(lion);
		pen.add(leopard);
//		pen.add(dove); // 불가
		
		List<Bird> cage = new ArrayList<>(); // 새장을 만든다.
		cage.add(dove);
		cage.add(duck);
//		cage.add(lion); // 불가
		
		for(Creeper creeper: pen) creeper.walk();
		
		for(Bird bird: cage) bird.fly();
	}
}
