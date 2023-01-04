package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic { // 표준의 역할만 수행
	// code(ex. 주민번호, 카드번호)를 만들고 싶을 때 interface에 멤버 변수를 선언한다. (final이므로)
	public static final int VOLTAGE = 200; // interface의 멤버 변수는 항상 public static final이다.
	static final String MAKER_NAME = "LG"; // public이 자동으로 붙는다.
	final int WEIGHT = 10; // public static이 자동으로 붙는다.
	LocalDate PRODUCED_DATE = LocalDate.now(); // public static final이 자동으로 붙는다.
	
	public abstract void displayMsg(); // interface의 멤버 메서드는 항상 public abstract
	abstract int getTemperature(); // public이 자동으로 붙는다.
	String getModelName(); // public abstract가 자동으로 붙는다.
}
