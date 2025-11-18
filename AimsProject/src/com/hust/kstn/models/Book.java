package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book {
	private int bookID;
	private static int nbBooks = 0;
	private String title;
	private String category;
	private double price;
	private List<BookAuthor> authors = new ArrayList<>();
	private int pageCount;
	
	public Book(String title, String category, double price, List<BookAuthor> authors, int pageCount) {
		nbBooks ++;
		this.bookID = nbBooks;
		this.title = title;
		this.category = category;
		this.price = price;
		this.authors = authors;
		this.pageCount = pageCount;
	}
	
	public int getBookID() {
		return bookID;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public List<BookAuthor> getAuthors() {
		return authors;
	}
	public int getPageCount() {
		return pageCount;
	}
	
	@Override
	public String toString() {
	    return "Book[" + this.bookID + "]["
	            + this.title + "]["
	            + this.price + "]["
	            + this.category + "]["
	            + this.pageCount + "]"
	            + "\nAuthors: " + this.authors;
	}
}
