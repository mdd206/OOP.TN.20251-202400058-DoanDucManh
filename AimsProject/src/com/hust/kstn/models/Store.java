package com.hust.kstn.models;

public class Store {
	private static final int MAX_NUMBER_STORAGE = 100;
	private int qtyStorage = 0;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBER_STORAGE];
	
	public void addDVD (DigitalVideoDisc disc) {
		if (qtyStorage == MAX_NUMBER_STORAGE) {
			System.out.println("The store is almost full");
			return;
		}
		itemsInStore[qtyStorage] = disc;
		qtyStorage ++;
		System.out.println("The disc has been added successfully");
	}
	
	public void removeDVD (DigitalVideoDisc disc) {
		if (qtyStorage == 0) {
			System.out.println("The store is empty");
			return;
		}
		int pos;
		for (pos = 0; pos < qtyStorage; ++ pos) {
			if (itemsInStore[pos].equals(disc)) {
				break;
			}
		}
		if (pos == qtyStorage) System.out.println("The disc does not exist");
		else {
			for (int i = pos; i < qtyStorage - 1; ++i) {
				itemsInStore[i] = itemsInStore[i+1];
			}
			itemsInStore[qtyStorage - 1] = null;
			qtyStorage --;
			System.out.println("The disc has been removed successfully");
		}
	}
	
	public void print() {
		if (qtyStorage == 0) {
			System.out.println("The store is empty");
			return;
		}
		System.out.println("======================= THE CURRENT STORE =======================");
		System.out.println("Total items: " + qtyStorage);
		for (int i = 0; i < qtyStorage; ++i) {
			System.out.println(itemsInStore[i].toString());
		}
		System.out.println("=================================================================");
	}
}
