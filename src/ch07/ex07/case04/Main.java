package ch07.ex07.case04;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(() -> System.out.println("탕탕.")); // fire method를 만든다.
		shooter.fire(smith.makeGun());
	}
}
