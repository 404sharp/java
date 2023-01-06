package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		// 배열 타입을 interface로 하면 확장성이 생긴다.
		Animal[] animals = new Animal[3]; // 동물 우리를 준비한다.
		
		// 다양한 동물들이 들어간다. -- 확장성이 생긴다.
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		// 배열 타입을 Object로 하면 무엇이든 받아들인다.
		Object[] objs = new Object[3];
		objs[0] = new Cat("헤롱이");
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
