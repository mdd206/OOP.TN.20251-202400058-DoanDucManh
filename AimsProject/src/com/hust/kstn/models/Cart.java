package com.hust.kstn.models;

public class Cart {
	private static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public void addDVD (DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsInCart[qtyOrdered] = disc;
		qtyOrdered ++;
		System.out.println("The disc has been added successfully");
	}
	
	public void removeDVD (DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
			return;
		}
		int pos;
		for (pos = 0; pos < qtyOrdered; ++ pos) {
			if (itemsInCart[pos].equals(disc)) {
				break;
			}
		}
		if (pos == qtyOrdered) System.out.println("The disc does not exist");
		else {
			for (int i = pos; i < qtyOrdered; ++i) {
				if (pos == qtyOrdered-1) itemsInCart[pos] = null;
				itemsInCart[pos] = itemsInCart[pos+1];
			}
			qtyOrdered --;
			System.out.println("The disc has been removed successfully");
		}
	}
	
	public double caculateTotalCost() {
		double totalCost = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
			totalCost += itemsInCart[i].getCost();
		}
		return totalCost;
	}
	
	public void print() {
		System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
		System.out.println("=== All items in cart ===");
		for (int i = 0; i < qtyOrdered; ++i) {
			System.out.println("[Title]: " + itemsInCart[i].getTitle() + ", " + "[Cost]: " + itemsInCart[i].getCost());
		}
		System.out.println("=== Total cost in cart: " + caculateTotalCost() + " ===");
	}	
}
