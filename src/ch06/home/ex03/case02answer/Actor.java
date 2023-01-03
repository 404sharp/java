package ch06.home.ex03.case02answer;

import ch05.home.ex06.case02answer.Console;

public class Actor extends Entertainer {
	@Override
	public void play() {
		Console.info("연기하다.");
	}
}
