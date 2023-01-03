package ch05.ex09.case01;

import ch05.home.ex06.case02answer.Console;

public class Init {
	private static int s;
	private int i;
	
	static { // static block -- byte code가 로딩된 직후에 실행된다. -- runs once
		Init.s = 1;
//		this.i = 1; // cannot use instance variables here
		Console.info("static{}");
	}
	
	{ // instance block -- instance가 생성된 직후에 실행된다.
		this.i = 1;
		Init.s = 1; // CAN use but DOES NOT use static variables here
		Console.info("{}");
	}
	
	{
		Console.info("{}2");
	}
	
	public Init() { // constructor -- can be chosen
		Console.info("Init()");
	}
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}
