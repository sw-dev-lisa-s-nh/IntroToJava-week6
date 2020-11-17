package com.lisasmith.week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();

	
	/* 
	 * Getters & Setters
	 */
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	/*
	 * Constructor:
	 */
	public Deck() {
		populateDeck( cards);		
     }
		
	/*
	 * Randomizes the order of the cards
	 */
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	/*
	 * Removes and returns the top card of the Cards field
	 */
	public Card draw(List<Card> cards) {
		Card topCard = new Card();
		if (cards.size() == 0) {
			System.out.println("No cards left -- deck empty!");
			return null;
		} else {
			topCard = cards.get(0);
			cards.remove(0);
			return topCard;
		}
	}
	
	private List<Card> createFourSuits(int value, String num) {
		List<Card> newList = new ArrayList<Card>();
		
		for (int i =0; i<4; i++) {
			Card newCard = new Card();	
			newCard.setValue(value);
			switch (i) {
				case(0): 
					newCard.setName(num+ " of Hearts");
					newList.add(newCard);
					break;
				case(1): 
					newCard.setName(num+ " of Diamonds");
					newList.add(newCard);
					break;
				case(2): 
					newCard.setName(num+ " of Clubs");
					newList.add(newCard);
					break;
				case(3): 
					newCard.setName(num+ " of Spades");
					newList.add(newCard);
					break;
			}
		}
		return newList;
		
	}

	private void populateDeck(List<Card> cards) {	
		for (int i=2; i<=14; i++) {
			switch (i) {
			case (2): 
				cards.addAll(createFourSuits(i,"Two"));
				break;
			case (3):
				cards.addAll(createFourSuits(i,"Three"));
				break;
			case (4):
				cards.addAll(createFourSuits(i,"Four"));
				break;
			case (5):
				cards.addAll(createFourSuits(i,"Five"));
				break;			
			case (6):
				cards.addAll(createFourSuits(i,"Six"));
				break;	
			case (7):
				cards.addAll(createFourSuits(i,"Seven"));
				break;	
			case (8):
				cards.addAll(createFourSuits(i,"Eight"));
				break;	
			case (9):
				cards.addAll(createFourSuits(i,"Nine"));
				break;	
			case (10):
				cards.addAll(createFourSuits(i,"Ten"));
				break;	
			case (11):
				cards.addAll(createFourSuits(i,"Jack"));
				break;	
			case (12):
				cards.addAll(createFourSuits(i,"Queen"));
				break;	
			case (13):
				cards.addAll(createFourSuits(i,"King"));
				break;	
			case (14):
				cards.addAll(createFourSuits(i,"Ace"));
				break;
			}
		
		}
	}
}
