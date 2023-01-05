package ch07.home.ex04.case02answer;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5]; // Card 담을 수 있는 상자를 선언한 것
		
		for(int i = 0; i < cards.length; i++)
			// 상자에 Card를 넣는다. 혹은 손에 카드를 쥔다.
			cards[i] = new Card(i);
		
		for(Card card: cards) System.out.print(card);
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			Card tmp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = tmp;
		}
		
		for(Card card: cards) System.out.print(card);
	}
}
/*
과제: ch07.ex04.case01.Shuffle을 객체지향으로 refactoring하라.
      카드 섞는 알고리즘은 main()에 구현한다.
*/