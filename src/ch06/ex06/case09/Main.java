package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		UI.in();
//		console.in(); // interface의 static methods는 상속의 대상이 아니다.
//		browser.in();
//		Console.in(); // 마찬가지. interface의 static methods는 상속되지 않는다.
//		Browser.in();
		
		chrome.out();
//		chrome.in();
//		Chrome.in();
	}
}
