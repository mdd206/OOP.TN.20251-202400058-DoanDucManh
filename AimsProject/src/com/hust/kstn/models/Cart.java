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
	
	public void addDVD (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered >= MAX_NUMBER_ORDERED - 1) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsInCart[qtyOrdered] = disc1;
		itemsInCart[qtyOrdered + 1] = disc2;
		qtyOrdered += 2;
		System.out.println("The discs have been added successfully");
	}
	
	public void addDVD (DigitalVideoDisc[] discs) {
		int len = discs.length;
		if (qtyOrdered >= MAX_NUMBER_ORDERED - len + 1) {
			System.out.println("The cart is almost full");
			return;
		} 
		for (int i = 0; i < len; ++i) {
			itemsInCart[qtyOrdered + i] = discs[i];
		}
		qtyOrdered += len;
		System.out.println("The discs have been added successfully");
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
			for (int i = pos; i < qtyOrdered - 1; ++i) {
				itemsInCart[i] = itemsInCart[i+1];
			}
			itemsInCart[qtyOrdered - 1] = null;
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
		if (qtyOrdered == 0) {
			System.out.println("The cart is empty");
			return;
		}
		System.out.println("======================= THE CURRENT CART =======================");
		System.out.println("Total items: " + qtyOrdered);
		for (int i = 0; i < qtyOrdered; ++i) {
			System.out.println(itemsInCart[i].toString());
		}
		System.out.println("Subtotal: " + caculateTotalCost() + "$");
		System.out.println("================================================================");
	}
}
