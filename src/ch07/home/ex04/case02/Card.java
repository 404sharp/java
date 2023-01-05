package ch07.home.ex04.case02;

public class Card {
	private int cardNumber;
	
	public Card(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public String toString() {
		return this.cardNumber + " ";
	}
}
