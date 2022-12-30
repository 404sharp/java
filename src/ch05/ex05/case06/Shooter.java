package ch05.ex05.case06;

public class Shooter {
	// 과제: 총잡이가 총을 소지한다. 를 디자인하라.
	// "has a" relationship
	private Gun gun; // A "has a" B -- B is a dependency 의존객체
	// dependency를 멤버 변수로 갖다 놓으면 "has a" 관계이다.
	
	public void fire() { // method를 진행함에 있어서 gun이 필요하다. 의존성.
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
