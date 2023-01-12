package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start");
		
		Thread counter = new Thread(new Counter()); // Counter 타입에서 Runnable 타입으로 프로모션된다.
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { // 살아 있다 = 일을 한다 or 자고 있다
			if(tries <= 2) { // 2회 기다리겠다.
				counter.join(1000); // 1000ms동안 지켜보겠다.
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				// 3회 기다릴 때까지 counter thread가 살아 있다면 분명 자고 있는 것이다.
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); // 이때 InterruptedException 발생
				counter.join(); // 무한정 기다린다. counter가 죽을 때까지.
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
