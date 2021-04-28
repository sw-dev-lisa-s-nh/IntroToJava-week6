# IntroToJava-week6
BESD BootCamp Coding Assignment 6

Our FINAL Java Project was to create an automated version of the classic card game WAR.

These were the original requirements for the assignment!

1.  Created the following classes:  

        Cards 
              Fields:  value 2-Ace & name Ace of Diamonds or Two of Hearts
              Methods:  Getters, Setters & describe

        Deck
              Fields:  cards (List of Card)
              Methods:  shuffle, draw, & a constructor (which instantiates a new Deck)
              
        Player
              Fields:  hand (List of Card), score (initialized to 0 in the constructor) & name
              Methods:  describe (includes calling the card.describe method for each care in the hand), 
                        flip, draw, & incrementScore.
                      

2.  Created a class called App with a main method.
3.  Instantiated a Deck and two Players, call the shuffle method on the deck.
4.  Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
5.  Using a traditional for loop, iterate 26 times and call the flip method for each player.

I extended the program to do the following:

1.  Play a 2,3, or 4 player game!
2.  Use the Scanner to input the player's names 
