package ch05.home.ex05.case06;

public class Person {
	private String personName;
	private Phone phone;
	
	public void sendMessage() {
		phone.sendMessage();
	}
	
	public void call() {
		phone.call();
	}
	
	public void playGame() {
		phone.runGameApp();
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public Phone getPhone() {
		return phone;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
