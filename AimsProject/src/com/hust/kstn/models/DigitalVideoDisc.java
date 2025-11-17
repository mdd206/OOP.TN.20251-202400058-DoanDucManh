package com.hust.kstn.models;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int lenght;
	private double cost;
	
	public DigitalVideoDisc (String title) {
		this.title = title;
	}
	public DigitalVideoDisc (String category, String title, double cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	public DigitalVideoDisc (String director, String category, String title, double cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	public DigitalVideoDisc (String title, String category, String director, int lenght, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLenght() {
		return lenght;
	}
	public double getCost() {
		return cost;
	}
}
