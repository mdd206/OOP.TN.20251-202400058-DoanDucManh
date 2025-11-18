package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
	private int id;
	private static int nbCompactDiscs = 0;
	private String title;
	private String category;
	private double price;
	private List<String> artists = new ArrayList<>();
	private List<String> directors = new ArrayList<>();
	private List<Track> tracks = new ArrayList<>();
	
	public CompactDisc(String title, String category, double price, List<String> artists, List<String> directors,
			List<Track> tracks) {
		nbCompactDiscs ++;
		this.id = nbCompactDiscs;	
		this.title = title;
		this.category = category;
		this.price = price;
		this.artists = artists;
		this.directors = directors;
		this.tracks = tracks;
	}
	public int getId() {
		return id;
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
	public List<String> getArtists() {
		return artists;
	}
	public List<String> getDirectors() {
		return directors;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	
	@Override
	public String toString() {
		return "CD" + "[" + this.id + "]" 
				+ "[" + this.title + "]"
				+ "[" + this.category + "]"
				+ "[" + this.price + "]"
				+ "\nArtist:" + this.artists  
				+ "\nDirector:" + this.directors 
				+ "\nTrack: " + this.tracks;
	}
	
	public int totalLenght() {
		int lenght = 0;
		for (Track t : tracks) {
			lenght += t.getLenght();
		}
		return lenght;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
		System.out.println("The track has been add successfully");
	}
	
	public void removeTrack(Track track) {
		if (this.tracks.size() == 0) {
			System.out.println("The CD is empty");
			return;
		}
		boolean removed = this.tracks.remove(track);
		if (removed == false) System.out.println("The track does not exist");
		else {
			this.tracks.remove(track);
			System.out.println("The track has been removed successfully");
		}
	}
}
