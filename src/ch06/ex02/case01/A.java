package ch06.ex02.case01;

public class A {
	private int a; // 객체 내부 전용
	int b; // default -- 같은 패키지 전용
	protected int c; // 같은 패키지 또는 자식 클래스 전용
	public int d; // 제한 없음
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
}
