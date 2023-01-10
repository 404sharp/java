package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null; // 파일을 사용하기 위한 준비
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		// catch blocks는 서로간에 배타적
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		// finally는 꼭 실행된다.
		} finally {
			if(out != null) out.close(); // close()는 객체를 없앤다.
		}
	}
}
