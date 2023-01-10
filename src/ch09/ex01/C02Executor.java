package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		// Runnable 타입의 데이터를 쓰레드로 포장하지 않고 다른 방법을 써본다.
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1); // runnable data들을 thread로서 작동을 시킨다.
		executor.execute(r2);
	}
}
