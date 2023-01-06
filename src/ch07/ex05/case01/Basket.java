package ch07.ex05.case01;

public class Basket<T> { // T는 generic type (아무거나 타입)
	private T t;
	
	public T get() {
		return this.t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
