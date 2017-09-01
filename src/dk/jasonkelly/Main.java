package dk.jasonkelly;

import dk.jasonkelly.cardGame.Card;
import dk.jasonkelly.cardGame.CardGame;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    /**
     * Main method
     * @param args arguments
     */
    public static void main(String[] args) {
        CardGame cardGame = new CardGame();

        // For demo purpose run forever
        while (true) {
            orderCardDeck(cardGame);
            System.out.println("--------------------");
        }
    }

    /**
     * @param cardGame get the cardGame
     * @return Boolean
     */
    public static boolean orderCardDeck(CardGame cardGame) {
        Scanner getCardDeck = new Scanner(System.in);
        System.out.println("What order do you want?");
        System.out.println();
        System.out.println("0: asc");
        System.out.println("1: desc");

        int order = getCardDeck.nextInt();

        if (order == 0) {
            printCardDeck(cardGame);

            return true;
        }

        printRevserseCardDeck(cardGame);

        return false;
    }

    /**
     *
     * @param cardGame the current card deck
     */
    public static void printCardDeck(CardGame cardGame) {
        cardGame.getCardDeck().forEach(card -> {
            System.out.println("name " + card.getName());
            System.out.println("color " + card.getColor());
            System.out.println("sorting value  " + card.getValue());
            System.out.println();
        });
    }

    /**
     * @param cardGame the current card deck
     */
    public static void printRevserseCardDeck(CardGame cardGame) {
        Collections.reverse(cardGame.getCardDeck());
        for(Card card: cardGame.getCardDeck()) {
            System.out.println("name " + card.getName());
            System.out.println("color " + card.getColor());
            System.out.println("sorting value  " + card.getValue());
            System.out.println();
        }
    }
}
