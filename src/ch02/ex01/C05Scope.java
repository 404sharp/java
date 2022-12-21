package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		// local variables are stored in stacks
		// 접시쌓기처럼 저장된다. 마지막 것이 제일 위에
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			//int i = 0; // 5번째 줄 i와 중복이다.
			int x = 0;
			int y = 0;
		} // 블럭의 끝은 scope의 끝. 블럭은 scope을 나타낸다. 공간 또는 시간적으로.
		// 이전 scope 안에서 x가 태어났다 죽었다(lifecycle).
		// 새로운 x를 선언할 수 있다.
		int x = 0; // 10번째 줄 x 변수는 이때 죽는다. scope가 끝났기 때문이다.
	} // 5번째 줄 i 변수는 이때 죽는다. scope가 끝났기 때문이다.
}

// javaw.exe. C05Scope loading (running)을 우리는 마우스로 손쉽게 사용하고 있다.