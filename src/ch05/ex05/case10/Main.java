package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		man.strip();
		man.wash();
		man.wear(pajamas);
		man.lie();
		
		// 위 중복 코드는 다음과 같이 간결해진다.
		man.sleep(pajamas);
		man.sleep(pajamas);
	}
}
