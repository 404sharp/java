package ch05.home.ex05.case06;

public class Phone {
	// maker는 객체, makerName은 속성
	private String manufacturerName;
	private int price;
	
	public void sendMessage() {}
	public void call() {}
	public void runGameApp() {}
	
	public String getManufacturerName() {
		return manufacturerName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
