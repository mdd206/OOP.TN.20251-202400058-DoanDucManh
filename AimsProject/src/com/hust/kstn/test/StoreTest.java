package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
	
	public static void main(String[] args) {
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Rogers Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Twits", "Cartoon", "Phil Johnston", 98, 20.05);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Fast & Furious 9", "Action", "Justin Lin", 143, 30.5);
		
		store.removeDVD(dvd1);
		
		store.addDVD(dvd1);
		store.addDVD(dvd2);
		store.print();
		
		store.removeDVD(dvd3);
		store.removeDVD(dvd1);
		store.addDVD(dvd4);
		store.print();
	}
}
