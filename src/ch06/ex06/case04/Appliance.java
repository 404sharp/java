package ch06.ex06.case04;

// 추상 메서드로만 채우겠다 -- use interfaces
public interface Appliance { // interface는 널리 공개하는 것
	void on(); // 따라서 public이다.
	void off(); // abstract method -- 실행할 게 아니다.
}
