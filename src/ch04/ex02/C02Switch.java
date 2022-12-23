package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		// 기준값과 비교값의 타입은 같아야 한다.
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "5만원"; // 코드 중복이 발생했다.
		default -> coupon = "1천원";
		}
		
		switch(grade) {
		case "gold", "silver" -> coupon = "5만원"; //콤마로 비교값 나열 가능
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}
