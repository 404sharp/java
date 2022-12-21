package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		// trim()으로 머리 꼬리 부분의 space를 제거한다.
		String s = "|" + " a happy ".trim() + "|";
		s = s.concat(" dog");
		s = s.substring(2); // substring은 beginIndex 이후부터의 문자열을 뽑아낸다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1)); // charAt은 index의 문자를 뽑아낸다.
		
		int i = "apple".codePointAt(0); // 유니코드 번호를 뽑아낸다.
		i = "a".hashCode(); // 하나의 문자만 있다면 유니코드 번호
		i = "b".hashCode();
		i = "b".compareTo("a"); // hash code 값을 빼기 하는 것이다.
		i = "a".compareTo("b");
		i = "A".compareTo("a"); // 65 minus 97
		i = "A".compareToIgnoreCase("a"); // 대소문자를 무시한다.
		i = s.indexOf("l"); // 첫 번째 l의 index를 리턴한다.
		i = s.lastIndexOf("l"); // 마지막 l의 index를 리턴한다.
		i = s.length();
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de"); // 지정된 문자열로 시작하는가?
		b = s.endsWith("lop"); // 지정된 문자열로 끝나는가?
		b = s.equals("develop"); // 지정된 문자열과 동일한가?
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop"); // 대소문자를 무시하고 지정된 문자열과 동일한가?
		b = "".isEmpty(); // 빈 문자열인가?
		b = s.matches("[a-zA-Z]*"); // 알파벳만으로 구성되어 있는가?
		b = s.matches("[0-9]*"); // 숫자만으로 구성되어 있는가?
		System.out.println(b);
	}
}
/* 0123456789...
 * |a happy| dog
 *  happy| dog
 */
