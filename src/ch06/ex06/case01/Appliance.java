package ch06.ex06.case01;

// 추상 클래스는 인스턴스 메서드도 포함시킬 수 있지만 인터페이스는 그럴 수 없다. 
// 추상명사가 추상 클래스가 된다. 실제 존재하지 않는다.
public abstract class Appliance { // abstract: 이걸로는 객체를 생성하지 않는다.
	// 표준의 역할을 한다. 그래서 on과 off가 있다.
	public void on() {}
	public abstract void off(); // 추상 메서드 -- 알고리즘을 모른다.
	// 추상 메서드가 하나라도 있으면 추상 클래스여야 한다.
}
