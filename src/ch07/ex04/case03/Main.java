package ch07.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		Ball[] balls = new Ball[6];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = slot.chuck();
		
		for(Ball ball: balls)
			System.out.print(ball.getBallNum() + " ");
	}
}
