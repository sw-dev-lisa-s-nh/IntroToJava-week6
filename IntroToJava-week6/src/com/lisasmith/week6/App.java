package com.lisasmith.week6;

public class App {

	public static void main(String[] args) {
		
		
		
		/*
		 * IntroToJava Week 6 Coding Assignment
		 *   Create an automated version of the 
		 *        classic card game WAR!
		 */
		
		System.out.println("--------------------------------------------");
		System.out.println("   Intro to Java Week 6 Coding Assignment");
		System.out.println("--------------------------------------------");
	
		System.out.println();
		
		System.out.println("--------------------------------------------");
		System.out.println("            Start:  Game of WAR");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		
		
		/*
		 * Requirement 3: Instantiate a Deck and two players
		 */
		
		Deck deck = new Deck();
		Player playerOne = new Player("Bobby");
		Player playerTwo = new Player("Sally");
		
		System.out.println("Player 1, " + playerOne.getName() + " VS. Player 2, " + playerTwo.getName());
		System.out.println();
		System.out.println();

		/*
		 * Requirement 3: Shuffle the Deck of 52 Cards
		 */
		
		System.out.println("     Deck is shuffled");
		System.out.println();
		System.out.println();
		deck.shuffle();
		
		/*
		 * Requirement 4:  Using a traditional for loop, iterate 52 times
		 * calling the draw method, alternating between playerOne and playerTwo
		 * using the instantiated Deck.
		 */	
		System.out.println("     Players draw their hands...");
		System.out.println();
		System.out.println();
		for (int i=0; i<52; i++ ) {
			if (i%2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}
		}
		
		/* 
		 * Requirement 5:  Using a traditional for loop, iterate 26 times, 
		 * 				   and call the flip method for each player.
		 * 
		 * Requirement 5a:  Compare the value of each card returned by the 
		 * 					two player's flip methods. 
		 *  
		 * 					Call IncrementScore method on the player whose
		 * 					card has the higher value.
		 */
		
		
		System.out.println("     Starting to play....");
		System.out.println();
		System.out.println();
		Card playerOneTopCard = new Card();
		Card playerTwoTopCard = new Card();
		for (int i=0; i<26; i++) {
			
			System.out.println("--------------------------------------------");
			System.out.println("Turn #: " + (i+1));
			System.out.println("----------");
			playerOneTopCard = playerOne.flip(playerOne.hand);
			System.out.print ("Player 1, " + playerOne.getName() + "'s ");
			playerOneTopCard.describe();
				
			playerTwoTopCard = playerTwo.flip(playerTwo.hand);
			System.out.print ("Player 2, " + playerTwo.getName() + "'s ");
			playerTwoTopCard.describe();

			compareCardAndIncrementScore(playerOne, playerOneTopCard.getValue(),playerTwo, playerTwoTopCard.getValue());
				
		}
		
		System.out.println("--------------------------------------------");

		/*
		 * Method to find out which player has a higher score:
		 * 		Value:  -1 (playerOne wins)
		 * 				 0 (playerOne == playerTwo)
		 *               1 (playerTwo wins)
		 */
		int winner = compareFinalScore(playerOne, playerTwo);
		
		System.out.println("Final Scores:");
		System.out.println("--------------------------------------------");
		System.out.println("     Player 1, "+ playerOne.getName() + "'s score: " + playerOne.getScore());	
		System.out.println("     Player 2, "+ playerTwo.getName() + "'s score: " + playerTwo.getScore());
		System.out.println();
		System.out.println("     The Winner of WAR is:  ");
		System.out.print("                ");
		switch (winner) {
			case(-1):
				System.out.println("Player 1, " + playerOne.getName());
				break;
			case (0):
				System.out.println("It's a DRAW!");
				break;
			case (1):
				System.out.println("Player 2, " + playerTwo.getName());
				break;	
		}
		
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("            End:  Game of WAR!");
		System.out.println("--------------------------------------------");

		System.out.println();

		System.out.println("--------------------------------------------");
		System.out.println("      End of Week 6 Coding Assignment");
		System.out.println("--------------------------------------------");
	
		
	}
	private static int compareFinalScore(Player playerOne, Player playerTwo) {
		int scorePlayerOne = playerOne.getScore();
		int scorePlayerTwo = playerTwo.getScore();
		if (scorePlayerOne < scorePlayerTwo) {
			return 1;
		} else if (scorePlayerOne > scorePlayerTwo) {
			return -1;
		} else
			return 0;
		}
		
	
	private static void compareCardAndIncrementScore(Player p1, int value1, Player p2, int value2) {
		if (value1 > value2) {
			System.out.println("     A point to Player 1, " + p1.getName());
			p1.incrementScore();
		} else if (value2 > value1) {
			System.out.println("     A point for Player 2, " + p2.getName());
			p2.incrementScore();
		} else {
			System.out.println("     The values are equal, no score!");
		}
		System.out.println();
	
    }
}
