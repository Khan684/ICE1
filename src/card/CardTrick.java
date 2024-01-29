/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        boolean found = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
                        //c.setValue(insert call to random number generator here)
            int value = random.nextInt(13)+1;
            c.setValue(value);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int suit = random.nextInt(4);
            c.setSuit(Card.SUITS[suit]);
            
            magicHand[i] = c;
        }
        for(int i=0;i<7;i++){
             System.out.println("" + magicHand[i].getValue() + " " + magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card user = new Card();
        System.out.print("Enter the Card value (1-13): ");
        int userValue = scanner.nextInt();
        user.setValue(userValue);

        System.out.print("Enter the Card suit (0-3): ");
        int userSuit = scanner.nextInt();
        user.setSuit(Card.SUITS[userSuit]);
        
                // add one luckcard hard code 2,clubs
        Card myluckycard = new Card();
        
        int myValue = 7;
        myluckycard.setValue(myValue);

        int mySuit = 0;
        myluckycard.setSuit(Card.SUITS[mySuit]);
        
        // and search magicHand here
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == myluckycard.getValue() && (magicHand1.getSuit() == null ? myluckycard.getSuit() == null : magicHand1.getSuit().equals(myluckycard.getSuit()))) {
                found = true;
                break;
            }
        }
        //Then report the result here
        if (found){
            System.out.println("Congratulations! Your card is in the magicHand.");
            }else{
            System.out.println("Sorry, your card is not in the magicHand.");
            }

    }
    
}
