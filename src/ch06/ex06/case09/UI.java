package ch06.ex06.case09;

public interface UI {
	// input -- static method
	static String in() {
		return "키보드로 입력하다.";
	}
	
	// output -- instance method
	String out();
}
