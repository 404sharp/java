package ch09.ex02;

public class Counter implements Runnable {
	@Override
	// Runnable 타입의 데이터일 뿐 thread는 아니다.
	public void run() { // thread는 일꾼, run()은 일꾼이 하는 일(기능)
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			// sleep 중에 notify로 깨어난 것이 InterruptedException
			// notify는 Object 클래스에 들어 있다.
			} catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
