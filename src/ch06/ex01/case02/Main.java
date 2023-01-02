package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		// 결론: 상속(extend) 쓰지 말아라.
		// 상속을 쓰면 몇 단계를 올라가야 상속된 멤버 메서드가 나오는지 모른다.
		// 메서드를 바꿨을 때 상속의 영향이 얼마나 미치는지 모른다.
		
		// POJO (Plain Old Java Object) 순수한 옛날 자바 객체
		//      extends를 쓰지 않는 자바 객체
		//      implements를 해도 POJO
		// 스프링을 쓰는 이유: POJO 기반으로 엔터프라이즈 앱을 만들려는 목적
	}
}
