package ch06.ex04.case02;

public class Circle {
	private double x;
	private double y;
	private double radius;
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// For debugging
	@Override
	public String toString() {
		return String.format("(%f, %f), %f", x, y, radius);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
