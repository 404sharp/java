package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init(); // instance block cannot be chosen
		new Init();
		
		new Init(1); // constructor can be chosen
	}
}
