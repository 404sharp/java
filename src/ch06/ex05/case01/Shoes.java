package ch06.ex05.case01;

public class Shoes extends Product {
	public int price;
	
	public Shoes(int price) {
		super(price * 2); // 부모 것은 private이므로 부모가 초기화하도록 한다.
		this.price = price;
	}
}
