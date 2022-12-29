package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		// width, height는 Card를 로딩하자마자 생성된다.
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
//		Card.kind; // kind는 존재하지 않는다. -- instance variable
//		Card.number; // 객체를 생성해야 존재한다.
		
		Card card1 = new Card(); // kind, number가 생성된다.
		Card card2 = new Card(); // kind, number가 2개씩 존재한다. -- new를 2회 썼다.
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		// static variable은 "className."을 붙이고 써야 한다.
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
	}
}
