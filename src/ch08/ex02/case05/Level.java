package ch08.ex02.case05;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	private final Level next;
	
	private Level(int value, Level next) { // enum의 생성자는 꼭 private이어야 한다.
		this.value = value;
		this.next = next;
	}
	
	public int value() { // field name을 그대로 쓴다. get 붙이지 않는다. record처럼.
		return this.value;
	}
	
	public Level next() { // field name을 그대로 쓴다. get 붙이지 않는다.
		return this.next;
	}
}
