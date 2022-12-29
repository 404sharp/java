package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		// new를 한 번 실행했으므로 객체는 1개이다.
		House house1 = new House();
		House house2 = null;
		
		house1.setAddress("서울 강남구 역삼동");
		
		// 과제: house1의 키를 house2에 넘겨줬다.
		//       house1의 주소를 house2에 알려줬다.
		house2 = house1;
		System.out.println(house2.getAddress());
	}
}
