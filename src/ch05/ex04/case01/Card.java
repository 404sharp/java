package ch05.ex04.case01;

public class Card { // domain 순수한 데이터
	// 4 member variables (data = variables)
	// 2 instance variables -- different scope -- 혼자 쓸 데이터
	// 인스턴스를 구성하는 변수. 객체별로 따로따로 heap에 생긴다.
	public String kind;
	public int number;
	// 2 static variables -- different scope -- 공유할 데이터
	// 해당 클래스의 바이트코드가 로딩될 때 method area에 생성된다.
	public static int width;
	public static int height;
}
