package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		// bad code
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time(); // local variable
		// 구체화한다. 개성을 부여한다.
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time); // 파라미터로 주소값을 받은 hash method의 리턴값.
									// Java에서 실제 주소값은 노출되지 않는다.
		System.out.println(time2.toString()); // (full) class name @ hash code
	} // method body가 끝나면 stack에서 로컬 변수들이 사라진다.
	// method를 끝내면 stack도 heap도 깨끗해진다. heap은 garbage collector가 담당한다.
}
