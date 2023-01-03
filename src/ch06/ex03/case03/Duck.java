package ch06.ex03.case03;

import java.lang.*; // 자동 추가된다.

public class Duck extends Object { // extends Object가 자동 추가된다.
	// 모든 객체는 Object 클래스에 있는 멤버들을 상속한다.
	@Override
	public String toString() {
		return "오리";
	}
}
