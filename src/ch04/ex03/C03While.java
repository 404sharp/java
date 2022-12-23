package ch04.ex03;

public class C03While {
	public static void main(String[] args) {
		int myCalorie = 0;
		int foodCalorie = 0;
		
		while(myCalorie < 30) {
			foodCalorie = (int)(Math.random() * 10) + 1;
			
			if (foodCalorie % 5 == 0) { // 상한 음식을 먹었다.
				System.out.println("상한 음식을 뱉다.");
				break;
			}
			
			myCalorie += foodCalorie;
		}
		
		System.out.println(myCalorie + "cal.만큼 먹었습니다.");
	}
}
