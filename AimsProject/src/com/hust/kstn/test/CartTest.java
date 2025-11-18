package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Rogers Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Twits", "Cartoon", "Phil Johnston", 98, 20.05);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Fast & Furious 9", "Action", "Justin Lin", 143, 30.5);
		DigitalVideoDisc[] dvd5 = {
			new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 25.50),
			new DigitalVideoDisc("Coco", "Animation", "Lee Unkrich", 105, 18.90),
			new DigitalVideoDisc("Gladiator", "Action", "Ridley Scott", 155, 22.75),
			new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 26.40),
			new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 21.10),
			new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 23.80)

		};
		
		cart.removeDVD(dvd1);
		cart.print();
		
		cart.addDVD(dvd1);
		cart.print();
		
		cart.addDVD(dvd2, dvd3);
		cart.print();
		
		cart.addDVD(dvd5);
		cart.print();
		
		cart.removeDVD(dvd1);
		cart.print();
		
		cart.removeDVD(dvd1);
		cart.print();
		
		cart.addDVD(dvd5);
		cart.addDVD(dvd5);
		cart.print();
	}
}
