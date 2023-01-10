package ch08.ex03.case02;

import java.time.LocalDate;

// class를 이용해 record를 흉내내어 본다.
public class Book {
	private final String title; // record는 일단 기록하면 끝이다. 그러므로 final.
	private final int price;
	private final LocalDate printedDate;
	
	public Book(String title, int price, LocalDate printedDate) {
		this.title = title;
		this.price = price;
		this.printedDate = printedDate;
	}
	
	@Override
	public final String toString() {return null;}
	
	@Override
	public final int hashCode() {return 0;}
	
	@Override
	public final boolean equals(Object o) {return false;}
	
	public String title() {return null;}
	public int price() {return 0;}
	public LocalDate printedDate() {return null;}
}
