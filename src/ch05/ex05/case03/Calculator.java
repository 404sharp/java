package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) { // a, b 변수가 스택에 만들어진다.
		return a + b;
	} // a, b 변수가 스택에서 제거된다.
	
	public Paper add(Paper paper) {
		// 과제: paper의 a, b를 더한 result를 paper에 적어라.
		//       위 paper를 return하라.
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}
