package org.lessons.java.shop;

public class main {
	
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("pallone", "palla da basket", 9.90, 22.0);
		System.out.println("Prodotto 1: " + p1.toString());
		
		System.out.println("------------------------------");
		
		Prodotto p2 = new Prodotto("prodotto 2", "descrizione prodotto 2", 50, 4.0);
		System.out.println("Prodotto 2: " + p2.toString());
	}
	
}
