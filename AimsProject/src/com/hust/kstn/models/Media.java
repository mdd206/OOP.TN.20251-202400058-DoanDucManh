package com.hust.kstn.models;

public class Media {
	protected int id;
	protected String title;
	protected double cost;
	protected String category;
	protected static int nbMedias = 0;
	
	public Media(String title, double cost, String category) {
		this.id = nbMedias ++;
		this.title = title;
		this.cost = cost;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public double getCost() {
		return cost;
	}
	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Media" + "[" + this.id + "]"
				+ "[" + this.title + "]"
				+ "[" + this.cost + "]"
				+ "[" + this.category + "]";
	}
}
