package com.lisasmith.week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	/*
	 * Constructor
	 */
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
	
	
	/*
	 * Getters & Setters
	 */
	public List<Card> getHand() {
		return hand;
	}



	public void setHand(List<Card> hand) {
		this.hand = hand;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	/*
	 * Prints out information about the player and calls the
	 * describe() method for each card in the Hand List
	 */
	public void describe() {
		System.out.println("Player's Name: " + this.name);
		System.out.println("Player's Score: " + this.score);
		System.out.println("Player's Hand: ");
		int count = 1;
		for (Card handCard : this.hand) {
			System.out.print ("Card "+ count + ":");
			handCard.describe();
			count++;
		}	
		System.out.println();
	}
	
	
	/*
	 * Removes and returns the top card of the hand
	 */
	public Card flip(List<Card> hand) {
		Card topCard = new Card();
		topCard = hand.get(0);
		hand.remove(0);
		return topCard;		
	}
	
	/*
	 * Takes a Deck as an argument and calls the draw method 
	 * on the deck, adding the returned Card to the hand field.
	 */
	public void draw(Deck deck) {
		Card newCard = new Card();
		
		if ((newCard = deck.draw(deck.cards)) != null) {
			this.hand.add(newCard);
		} else {
			System.out.println("     Deck Empty");
		}
				
	}
	
	/*
	 * Adds 1 to the Player's score field)
	 */
	public void incrementScore () {
		this.score++;
	}
	
	
}
