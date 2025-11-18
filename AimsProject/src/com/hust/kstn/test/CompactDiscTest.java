package com.hust.kstn.test;

import java.util.ArrayList;
import java.util.List;
import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        List<String> artists = new ArrayList<>();
        artists.add("Artist 1");
        artists.add("Artist 2");
        
        List<String> directors = new ArrayList<>();
        directors.add("Director 1");
        
        List<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Track 1", 180));
        tracks.add(new Track("Track 2", 200));
        
        CompactDisc cd = new CompactDisc("Greatest Hits", "Pop", 250000.0, artists, directors, tracks);
        
        System.out.println("=== CD Information ===");
        System.out.println(cd);
        System.out.println("Total length: " + cd.totalLength() + " seconds");
        
        Track track3 = new Track("Track 3", 240);
        cd.addTrack(track3);
        
        cd.removeTrack(new Track("Track 4", 180)); 
        cd.removeTrack(track3); 
        
        cd.addTrack(track3);
        System.out.println("=== CD Information ===");
        System.out.println(cd);
        System.out.println("Total length: " + cd.totalLength() + " seconds");
    }
}
