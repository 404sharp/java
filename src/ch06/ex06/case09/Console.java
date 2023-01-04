package ch06.ex06.case09;

public class Console implements UI { // "is a" 관계. Console "is a" UI
	@Override
	public String out() {
		return "println()";
	}
}
