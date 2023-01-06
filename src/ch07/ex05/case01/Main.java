package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		// generic type은 new 할 때 결정한다.
		Basket<Apple> basket = new Basket<Apple>();
		basket.set(new Apple());
		System.out.println(basket.get());
		
//		basket.set(new Grape()); // 사과 바구니에는 포도가 안 들어간다.
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
