package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		// 좌항 객체가 가질 가능성이 있는 타입이 우항
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg +="Object";
		System.out.println(msg);
		
		// compile errors -- impossible cases
//		if(b instanceof F)
//		if(c instanceof F)
		
		F f = new F();
		msg = "";
//		if(f instanceof C)
		// interface is not a compile error in any case
		if(f instanceof A) msg += "A ";
		System.out.println(msg);
	}
}
