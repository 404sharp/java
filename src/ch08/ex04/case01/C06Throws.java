package ch08.ex04.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}
	
	public void second() {
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	*/
	
	public void first() {
		this.second();
	}
	
	public void second() {
		try {
			this.third();
		} catch(Exception e) {
			System.out.println("second() catch");
		}
	}
	
	public void third() throws Exception { // throws는 호출단에서 try 블럭을 강제한다.
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("end.");
	}
}
