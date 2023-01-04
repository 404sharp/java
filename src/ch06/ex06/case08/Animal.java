package ch06.ex06.case08;

public interface Animal {
	void move(); // walk, fly, swim??
	
	default void eat() {} // 추상 메서드가 아님. 알고리즘을 아는 메서드이다.
}
