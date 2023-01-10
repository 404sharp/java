package ch08.ex04.case01;

// try는 exception이 발생해도 앱을 어떻게든 살리는 게 목적이다.
public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) { // e는 event의 앞글자 "현상"
			System.out.println("error.");
		}
		
		System.out.println("end.");
	}
}
