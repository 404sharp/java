package ch07.ex07.case01;

// lambda에서 쓸 인터페이스
@FunctionalInterface
public interface Human {
	void say(); // say()는 Human 타입. 타입 하나당 추상 메서드 하나.
//	void tell(); // FunctionalInterface에서는 추상 메서드 하나만 정의할 수 있다.
}
