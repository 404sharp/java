package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() { // 소비자가 사용할 method
		while(val == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		this.val = null;
		
		// 특정 thread가 아니라 모두를 깨움. InterruptedException 발생시킴.
		notifyAll(); // 값을 가져간 다음에 notifyAll()
		
		return val;
	}
	
	public synchronized void add(Integer val) { // 생산자가 사용할 method
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
			
		this.val = val;
		notifyAll(); // 값을 채워 넣은 다음에 notifyAll()
	}
}
