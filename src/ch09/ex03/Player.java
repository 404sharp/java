package ch09.ex03;

public class Player extends Thread { // Thread는 Runnable 타입이기도 해서 Run()이 이미 있다.
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print();
			
			try {
				Thread.sleep((int)(Math.random() * 2));
			} catch(InterruptedException e) {}
		}
	}
}
