package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45]; // 공이 들어갈 수 있는 통이 생겼다.
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1); // 통 속에 공을 집어 넣는다.
	}
	
	/* 과제: 하나의 공이 2번 이상 나오는 버그를 해결하라. */
	public Ball chuck() {
		int idx = 0;
		Ball ball = null;
		
		do {
			idx = (int)(Math.random() * 45);
			ball = balls[idx];
		} while(ball == null);
		balls[idx] = null;
		
		return ball; // 임의의 공 하나를 토해낸다.
	}
}
