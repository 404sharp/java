package ch06.home.ex04.case03;

public class Circle {
	private Point point; // 중복 코드를 줄이기 위해서 "has a" 관계를 먼저 고려한다.
	private int r;
	
	public Circle(Point point, int r) {
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}
