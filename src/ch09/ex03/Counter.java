package ch09.ex03;

public class Counter {
	private int val; // 공유 자원
	
	// synchronized = lock을 걸다
	public synchronized void increase() {
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
