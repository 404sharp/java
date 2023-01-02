package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) { // new로 호출한다. 객체 생성한 직후 사용
		this.babyName = babyName;
	}
	
	public void setBabyName(String babyName) { // 객체 생성한 후에 사용
		this.babyName = babyName;
	}
}
