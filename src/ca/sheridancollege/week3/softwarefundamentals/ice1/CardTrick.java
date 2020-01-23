package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author 991569304
 * @author Liya Ham
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13+1));
            card.setSuit(Card.SUITS[(int)(Math.random()*3+1)]);
             
            magicHand[i] = card;

            //card.setValue(insert call to random number generator here)
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }

        Scanner scanner = new Scanner(System.in);
        
       
          for (int i = 0; i < magicHand.length; i++) {
            Card card = magicHand[i];
            
            if(luckyCard.getValue() == card.getValue()) {
            System.out.println("Good Work");
                    } else {
            System.out.println("Fail to find");
            System.out.println(card.getValue());
            }
            if(luckyCard.getSuit().equals(card.getSuit())) {
            System.out.println("Good Work");
                    } else {
            System.out.println("Fail to find");
            System.out.println(card.getSuit());
            }
          
            
          
            
            
            
            //card.setValue(insert call to random number generator here)
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here

    }
}
