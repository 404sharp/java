package ch08.ex04.case02;

// RuntimeException은 try 블럭 사용이 강제되지 않는다.
public class NumberException extends RuntimeException {
	public NumberException(String msg) {
		super(msg);
	}
}
