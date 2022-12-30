package ch05.ex06.case01;

public class Man {
	// 주어(객체)에 관심이 없는 경우에 static method를 쓴다.
	public static void say(String msg) {
		System.out.println(msg);
	}
	
	public void tell(String msg) {
		System.out.println(msg);
	}
}
