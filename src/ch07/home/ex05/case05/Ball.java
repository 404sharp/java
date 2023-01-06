package ch07.home.ex05.case05;

public class Ball {
	private int ballNum;
	
	public Ball(int ballNum) {
		this.ballNum = ballNum;
	}
	
	public int getBallNum() {
		return this.ballNum;
	}
	
	@Override
	public String toString() {
		return this.ballNum + " ";
	}
}
