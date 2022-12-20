package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			//int i = 0; // 5번째 줄 i와 중복이다.
			int x = 0;
			int y = 0;
		}
		int x = 0; // 10번째 줄 x 변수는 이때 죽는다. scope가 끝났기 때문이다.
	} // 5번째 줄 i 변수는 이때 죽는다. scope가 끝났기 때문이다.
}

// javaw.exe. C05Scope loading(running)을 우리는 마우스로 손쉽게 사용하고 있다.