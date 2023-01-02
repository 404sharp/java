package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String parentName;
	private int money;
	
	private String getRegNum() { // 자식에게조차도 안 보이고 싶은 것
		return regNum; // this.이 생략되어 있다.
	}
	
	public String getParentName() {
		return parentName;
	}
	
	protected int getMoney() { // 자식에게만은 보이고 싶은 것
		return this.money;
	}
	
	void addMoney(int money) { // 같은 동네(패키지)에 사는 사람에게는 허용
		this.money += money;
	}
}
