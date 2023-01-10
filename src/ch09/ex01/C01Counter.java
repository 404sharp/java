package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		// 쓰레드를 준비한다.
		// Thread는 Runnable type의 Run() 메서드가 있어야 한다.
		// Runnable 타입의 데이터를 쓰레드로 포장한다.
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		// 쓰레드를 시작한다.
		thread1.start();
		thread2.start();
		
		System.out.println("main end.");
	}
}
