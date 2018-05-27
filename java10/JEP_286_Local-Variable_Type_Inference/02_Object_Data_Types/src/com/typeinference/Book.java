package com.typeinference;

public class Book {

	private String name;
	private Double price;

	public Book(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
