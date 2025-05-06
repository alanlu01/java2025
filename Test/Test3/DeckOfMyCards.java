package ntou.cs.java2023.t3.chianyih;

import java.util.Arrays;
import java.util.Random;

public class DeckOfMyCards {

	public static String FACES[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Jack", "Queen", "King" };
	public static String SUITS[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
	private MyCard deck[]; // array of Card objects
	private int currentCard; // index of next Card to be dealt
	public final int NUMBER_OF_CARDS = 52; // constant number of Cards
	private Random randomNumbers; // random number generator

	// constructor fills deck of Cards
	public DeckOfMyCards() {

		int ghost[] = new int[4];

		deck = new MyCard[NUMBER_OF_CARDS]; // create array of Card objects
		currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
		randomNumbers = new Random(); // create random number generator

		for (int i = 0; i < 4; i++) {
			ghost[i] = i * 13 + randomNumbers.nextInt(13);
		}
		// populate deck with Card objects
		for (int count = 0; count < deck.length; count++) {
			if (Arrays.binarySearch(ghost, count) >= 0) {
				deck[count] = new MyCard(FACES[count % 13], SUITS[count / 13], true);
			} else {
				deck[count] = new MyCard(FACES[count % 13], SUITS[count / 13], false);
			}
		}
	} // end DeckOfCards constructor

	// shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		// after shuffling, dealing should start at deck[ 0 ] again
		currentCard = 0; // reinitialize currentCard

		// for each Card, pick another random Card and swap them
		for (int first = 0; first < deck.length; first++) {
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			// swap current Card with randomly selected Card
			MyCard temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		} // end for

	} // end method shuffle

	// deal one Card
	public MyCard dealCard() {
		// determine whether Cards remain to be dealt
		if (currentCard < deck.length)
			return deck[currentCard++]; // return current Card in array
		else
			return null; // return null to indicate that all Cards were dealt
	} // end method dealCard

} // end class DeckOfCards
