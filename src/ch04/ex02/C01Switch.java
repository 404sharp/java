package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		// switch는 암묵적으로 equal 연산만 한다. 이것이 if 와의 차이점이다.
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}
