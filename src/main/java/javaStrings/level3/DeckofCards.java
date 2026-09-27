/*Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
Hint =>
Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
Step 2: Inside the Loop Generate a random card number between i and n using the following code
int randomCardNumber = i + (int) (Math.random() * (n - i));
Step 3: Swap the current card with the random card
Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
Write a Method to Print the players and their cards
Auhtor: Prakhar Khare
Date: 28-09-2026
 */

package javaStrings.level3;
import java.util.Scanner;
public class DeckofCards {
    // Method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            // Generate random card number from i to n - 1
            int randomCardNumber =
                    i + (int) (Math.random() * (n - i));

            // Swap current card with random card
            String temporary = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temporary;
        }

        return deck;
    }

    // Method to distribute cards among players
    public static String[][] distributeCards(
            String[] deck, int numberOfCards, int numberOfPlayers) {

        // Check if cards can be equally distributed
        if (numberOfCards % numberOfPlayers != 0) {
            return null;
        }

        int cardsPerPlayer = numberOfCards / numberOfPlayers;

        String[][] players =
                new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;

        for (int player = 0; player < numberOfPlayers; player++) {

            for (int card = 0; card < cardsPerPlayer; card++) {

                players[player][card] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {

        for (int player = 0; player < players.length; player++) {

            System.out.println(
                    "Player " + (player + 1) + ":"
            );

            for (int card = 0; card < players[player].length; card++) {

                System.out.println(
                        "  " + players[player][card]
                );
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create suits
        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        // Create ranks
        String[] ranks = {
                "2", "3", "4", "5", "6", "7",
                "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        // Calculate number of cards
        int numOfCards = suits.length * ranks.length;

        System.out.println("Total cards in deck = " + numOfCards);

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Take number of cards and players
        System.out.print("Enter number of cards to distribute: ");
        int numberOfCards = input.nextInt();

        System.out.print("Enter number of players: ");
        int numberOfPlayers = input.nextInt();

        // Check that requested cards are valid
        if (numberOfCards > numOfCards) {
            System.out.println(
                    "Number of cards cannot be greater than "
                            + numOfCards
            );
            input.close();
            return;
        }

        // Distribute cards
        String[][] players = distributeCards(
                deck,
                numberOfCards,
                numberOfPlayers
        );

        // Check if cards can be equally distributed
        if (players == null) {
            System.out.println(
                    "Cards cannot be equally distributed among "
                            + numberOfPlayers + " players."
            );
        } else {

            // Print players and their cards
            printPlayers(players);
        }

        input.close();
    }
}
