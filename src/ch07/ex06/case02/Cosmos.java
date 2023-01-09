package ch07.ex06.case02;

public class Cosmos {
	// factory method -- 객체를 생성해서 return해 준다.
	public static Animal getAnimal(String animalName) {
		// 객체를 만드는 새로운 방법
		// 내가 new를 하는 게 아니라 factory method를 쓴다.
		return switch(animalName) {
		case "호랑이" -> new Tiger();
		case "매" -> new Falcon();
		default -> null;
		};
	}
}
