package ch07.ex06.case04;

public class Box {
	// generic method의 generic type의 scope은 method block이다.
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
}
