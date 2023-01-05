package ch07.ex01.case09;

public class Shooter {
	private Gun gun; // dependency; A has a B; B is dependency
	
	public void fire() {
		this.gun.fire();
	}
	
	// parameter로 Rifle도 Pistol도 올 수 있다. 확장성이 확보된다.
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
