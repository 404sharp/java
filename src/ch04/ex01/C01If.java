package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitCnt = 0; // cnt: count
		
		if (visitCnt < 1) { // 첫 방문이라면
			System.out.println("첫 방문입니다.");
		}
		
		if (visitCnt < 1) // 가독성을 높이기 위해 블럭을 없앴다.
			System.out.println("첫 방문입니다.");
	}
}
