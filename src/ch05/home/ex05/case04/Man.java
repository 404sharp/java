package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Man {
	private String manName;
	private int age;
	private LocalDate birthday;
	
	public void walk() {}
	public void sit() {}
	public void introduceSelf() {}
	public void order() {}
	public void sing() {}
	public void eat() {}
	public void run() {}
	
	public String getManName() {
		return manName;
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setManName(String manName) {
		this.manName = manName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
