package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		// switch문이 할당 연산자와 결합했으므로 case 뒤에 리턴값을 쓴다.
		String dayName = switch(day) {
		case 1 -> "sunday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none";
		};
		
		System.out.println(dayName);
	}
}
