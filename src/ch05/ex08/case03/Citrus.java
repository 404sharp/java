package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
//		this.citrusName = "레드향"; // 코드 중복. 상수냐 변수냐의 차이일 뿐 멤버 변수 초기화는 동일.
		this("레드향");
	}
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}
