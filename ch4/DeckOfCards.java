package ntou.cs.java2025;
import java.security.SecureRandom;

public class DeckOfCards {

    public static final String[] FACES = {
        "Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"
    };
    public static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };

    private static final int NUMBER_OF_CARDS = 52;
    private Card[] deck;    
    private int currentCard; 
    private static final SecureRandom randomNumbers = new SecureRandom();

    // 建構子：初始化 52 張牌
    public DeckOfCards() {
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        // 依序產生 52 張 (face, suit)
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            deck[i] = new Card(FACES[i % 13], SUITS[i / 13]);
        }
    }

    // 洗牌
    public void shuffle() {
        currentCard = 0;
        for (int first = 0; first < NUMBER_OF_CARDS; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // 發一張牌；若沒牌了，回傳 null
    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            return null;
        }
    }

    // 重新把牌指標歸零（等於“把牌疊”又放回原位）
    public void reset() {
        currentCard = 0;
    }
}