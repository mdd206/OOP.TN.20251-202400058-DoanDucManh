package com.hust.kstn;
import com.hust.kstn.models.*;

public class Aims {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Rogers Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Twits", "Cartoon", "Phil Johnston", 98, 20.05);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Fast & Furious 9", "Action", "Justin Lin", 143, 30.5);
		
		cart.removeDVD(dvd3); 
		
		cart.addDVD(dvd1);
		cart.addDVD(dvd2); 
		cart.print();
		
		cart.removeDVD(dvd2);
		cart.print();
		
		cart.removeDVD(dvd2); 
		
		cart.addDVD(dvd3); 
		cart.addDVD(dvd4);
		cart.print();
	}
}
