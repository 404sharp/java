package ch05.ex01.case03;

public class User {
	private String userName; // encapsulation 캡슐화
	private int age;
	
	public String getUserName() { // getter
		return userName;
	}
	
	// 메서드 선언부 = 리턴 타입 + 메서드 네임 + 파라미터
	// 파라미터로 User this가 숨겨져 있다. 즉 (User this, String userName)이다.
	public void setUserName(String userName) { // setter
		// 메서드 바디: 투명하다 transparent (안 보인다)
		// 알고리즘 구현
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	} // accessor 접근 제어자
}
