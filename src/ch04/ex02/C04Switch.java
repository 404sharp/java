package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "Too short.";
		case 2 -> "Good.";
		default -> "Too long.";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "Too short.";
		// 블럭 안에는 리턴값이 아니라 실행문이 있어야 한다. 그래서 yield를 쓴다.
		case 11 -> {yield "I don't know.";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		};
		System.out.println(msg);
		
		// yield: keyword 예약어 (X) restricted identifier 제한자 (O)
		int yield = 1;
		System.out.println(yield);
//		int switch = 1; // keywords cannot be used as a variable name
	}
}
