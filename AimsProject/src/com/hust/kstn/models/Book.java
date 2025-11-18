package com.hust.kstn.models;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media {
	private List<BookAuthor> authors = new ArrayList<>();
	private int pageCount;
	
	public Book(String title, String category, double cost, List<BookAuthor> authors, int pageCount) {
		super(title, cost, category);
		this.authors = authors;
		this.pageCount = pageCount;
	}

	public List<BookAuthor> getAuthors() {
		return authors;
	}
	public int getPageCount() {
		return pageCount;
	}
	
	@Override
	public String toString() {
	    return super.toString()
	            + this.pageCount + "]"
	            + "\nAuthors: " + this.authors;
	}
}
