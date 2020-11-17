package com.lisasmith.week6;

public class Card {

	// contains a value from 2-14 representing cards 2-Ace
	int value;
	// (e.g. "Ace of Diamonds", or "Two of Hearts")
	String name;
	
	
	public int getValue() {
		return this.value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String getName() {
		return this.name;
	}



	public void setName(String name) {
		this.name = name;
	}


	/* 
	 * The method describe() prints out information about a card
	 */
	public void describe() {
		System.out.println("Card is:  " + this.getName());
		System.out.println("Value is: " + this.getValue());
		System.out.println();
		
	}
}
	
