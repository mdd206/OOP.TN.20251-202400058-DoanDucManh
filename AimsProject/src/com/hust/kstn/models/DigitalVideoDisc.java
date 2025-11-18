package com.hust.kstn.models;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int lenght;
	private double cost;
	private int id; 
	private static int nbDigitalVideoDiscs = 0; 
	
	public DigitalVideoDisc (String title) {
		this.title = title;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc (String category, String title, double cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc (String director, String category, String title, double cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc (String title, String category, String director, int lenght, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.lenght = lenght;
		this.cost = cost;
		nbDigitalVideoDiscs ++;
		this.id = nbDigitalVideoDiscs;
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
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "DVD" + "[" + this.id + "]"
				+ "[" + this.title + "]"
				+ "[" + this.cost + "]"
				+ "[" + this.director + "]"
				+ "[" + this.lenght + "]"
				+ "[" + this.category + "]";
	}
}