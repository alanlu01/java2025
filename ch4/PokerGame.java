package ntou.cs.java2025;
public class PokerGame {

    private DeckOfCards myDeckOfCards;

    // (1) 無參數建構子 => 建立並洗牌
    public PokerGame() {
        myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
    }

    // (2) 複製建構子 => 直接指向同一個 deck，但把牌指標重設
    public PokerGame(PokerGame oldGame) {
        myDeckOfCards = oldGame.getMyDeckOfCards();
        myDeckOfCards.reset();
    }

    public DeckOfCards getMyDeckOfCards() {
        return myDeckOfCards;
    }

    // 發 5 張牌，並印出對應訊息。
    // 如果途中牌不夠，就印出「No card can be dealt...」並結束該次發牌。
	public void dealFiveCards() {
		int totalPoints = 0;
		try {
			for (int i = 0; i < 5; i++) {
				Card c = myDeckOfCards.dealCard();
				// if c  null , call c.getPoints()--> NullPointerException
				System.out.println("You got " + c + ", " + c.getPoints() + " points.");
				totalPoints += c.getPoints();
			}
			System.out.println("Your total points are " + totalPoints + ".");
			System.out.println();
		} catch (NullPointerException npe) {
			System.out.println("No card can be dealt, please restart the game!");
		}
	}
}