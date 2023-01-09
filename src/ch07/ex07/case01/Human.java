package ch07.ex07.case01;

// lambda에서 쓸 인터페이스
@FunctionalInterface
public interface Human {
	void say(); // say는 Human타입. 타입 하나당 메서드 하나.
	//void tell(); -- FunctionalInterface에서는 메서드 하나만 정의할 수 있다.
}
