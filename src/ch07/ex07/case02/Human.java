package ch07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say(); // 추상 메서드는 하나만 쓸 수 있다.
	
	static void walk() {
		System.out.println("Human walks.");
	}
	
	default void sleep() {
		System.out.println("Human sleeps.");
	}
}
