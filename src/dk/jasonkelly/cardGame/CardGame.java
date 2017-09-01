package dk.jasonkelly.cardGame;

import java.util.ArrayList;

public class CardGame {
    /*
     *  We will implement a card game containing 52 playing cards
     *  Kings, Queens, Knights, 10, 9, 8, 7, 6, 5, 4, 3, 2, A
     *  Each cards can have 4 different colors
     *  Spades, Hearts, Diamonds, Clubs
     */

    // Create a new array list where we store the Cards
    private ArrayList <Card> cardsList = new ArrayList<>();

    // Create a constant with the four colors
    private final String[] colors = {"Spades", "Hearts", "Diamonds", "Clubs"};

    // Create a constant with the 13 card types.
    private final String[] cardTypes = {"King", "queen", "Knight", "10", "9", "8", "7", "6", "5", "4", "3", "2", "A"};

    /*
     * Construct a cardGame
     */
    public CardGame() {
        /*
         * Populate the cardList
         */
        for (String color: colors) {
            int index = 0;
            for (String cardType: cardTypes) {
                cardsList.add(new Card(color, cardType, index));
                index++;
            }
        }
    }

    /**
     * @return cardsList
     */
    public ArrayList<Card> getCardDeck() {
        return this.cardsList;
    }

    /**
     * @return int
     */
    public int getCardDeckSize() {
        return this.cardsList.size();
    }
}
