package ch07.ex06.case05;

public class Cabinet<T extends A> { // A 이하인 것 중 아무거나
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) { // C 이하인 것 중 아무거나
		return arr[arr.length - 1];
	}
}
