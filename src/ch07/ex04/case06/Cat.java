package ch07.ex04.case06;

public class Cat extends Object implements Animal { // extends Object이 자동으로 붙는다.
	private String catName;
	
	public Cat(String catName) {
		this.catName = catName;
	}
	
	@Override
	public String toString() {
		return this.catName;
	}
}
