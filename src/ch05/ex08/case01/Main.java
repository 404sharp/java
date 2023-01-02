package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby(); // new 연산자가 실행되어서 객체가 만들어진다.
		baby.setBabyName("초롱이"); // 아기가 태어난 이후 이름을 지은 것
		
		baby = new Baby("튼튼이"); // 아기가 태어나기 전에 이미 이름이 있는 것
	}
}
