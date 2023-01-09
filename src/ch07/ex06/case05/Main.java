package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>(); // A 이하
		Cabinet<B> cabinet2 = new Cabinet<>(); // B 이하
//		Cabinet<C> cabinet; // C는 A 이하가 아니다.
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1);
		cabinet1.getLastVal(arr2);
//		cabinet1.getLastVal(arr3); // C는 A 이하가 아니다.
		cabinet2.getLastVal(arr2);
		
//		cabinet1.getFinalVal(arr1); // A는 C 이하가 아니다.
//		cabinet1.getFinalVal(arr2); // B는 C 이하가 아니다.
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
	}
}
