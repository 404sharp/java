package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		String s = "a";
		
		b = s == "a";
		System.out.println(b);
		s = new String("a");
		System.out.println(s);
		b = s == "a";
		System.out.println(b);
		b = s.equals("a"); // 논리적인 관점에서 같으면 true 다르면 false
		System.out.println(b);
	}
}
