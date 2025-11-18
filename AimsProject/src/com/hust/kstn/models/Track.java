package com.hust.kstn.models;

public class Track {
	private String title;
	private int lenght;	
	
	public Track(String title, int lenght) {
		this.title = title;
		this.lenght = lenght;
	}
	
	public String getTitle() {
		return title;
	}
	public int getLenght() {
		return lenght;
	}

	@Override
	public String toString() {
		return this.title + " (" + this.lenght + ")\n";
	}
}
