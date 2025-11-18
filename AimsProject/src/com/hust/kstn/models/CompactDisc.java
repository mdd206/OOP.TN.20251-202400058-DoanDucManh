package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
	private List<String> artists = new ArrayList<>();
	private List<String> directors = new ArrayList<>();
	private List<Track> tracks = new ArrayList<>();
	
	public CompactDisc(String title, String category, double cost, List<String> artists, List<String> directors,
			List<Track> tracks) {
		super(title, cost, category);
		this.artists = artists;
		this.directors = directors;
		this.tracks = tracks;
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
		return super.toString()
				+ "\nArtist:" + this.artists  
				+ "\nDirector:" + this.directors 
				+ "\nTrack: " + this.tracks;
	}
	
	public int totalLength() {
		int length = 0;
		for (Track t : tracks) {
			length += t.getLength();
		}
		return length;
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
