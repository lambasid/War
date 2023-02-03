package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * did push
 * @author Siddharth Lamba 02/03/2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        
            
            int valueEntered;
        String suitEntered;
        Card[] hand = new Card[7];
        
        

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random rnd = new Random();
            card.setValue((rnd.nextInt(13)*1));
            // 
            card.setSuit(Card.SUITS[rnd.nextInt(4)]);
            hand[i]= card;
            System.out.println(hand[i].getValue()+  " "+hand[i].getSuit());
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter your Card Value(1-13)");
        valueEntered = scn.nextInt();
        System.out.println("Please Enter your Suit");
        suitEntered = scn.next();
        
        
        Card cardChoosen = new Card(suitEntered,valueEntered);
        
        // and search the hand here. 
        for(int j=0;j<hand.length;j++){
//          && hand[j].getSuit()==cardChoosen.getSuit()
            if (hand[j].getValue()== cardChoosen.getValue() && hand[j].getSuit().equals(cardChoosen.getSuit()) ){
                printInfo();
                
            }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    }
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Siddharth, but you can call me Sid");
        System.out.println();
        
        System.out.println("My career ambitions: Software Development");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Music");
        System.out.println("-- Cooking and eating");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
