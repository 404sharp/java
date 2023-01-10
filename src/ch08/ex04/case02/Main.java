package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		// RuntimeException은 try 블럭으로 묶을 필요가 없다.
		// 그래서 throw문을 써도 try가 없어도 된다.
		throw new NumberException("숫자가 아닙니다.");
	}
}
