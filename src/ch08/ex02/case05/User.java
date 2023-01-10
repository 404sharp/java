package ch08.ex02.case05;

public class User { // domain. enum 흉내낸다.
	private String userName;
	private Level level;
	
	public User(String userName, Level level) {
		this.userName = userName;
		this.level = level;
	}
	
	// 업무긴 한데 자기 데이터만으로 끝나는 소소한 업무.
	// 도메인 안에 구현.
	public void upgradeLevel() {
		Level nextLevel = level.next();
		/*
		if(nextLevel == null)
			throw new IllegalStateException(
					"이미 최고 등급 " + this.level + "입니다.");
		this.level = nextLevel;
		*/
		if(nextLevel != null) this.level = nextLevel;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", userName, level);
	}
}
