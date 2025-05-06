package ntou.cs.java2023.t3.chianyih;

public class PokerGame {

	private DeckOfMyCards myDeckOfCards;

	public PokerGame() {
		myDeckOfCards = new DeckOfMyCards();
		myDeckOfCards.shuffle(); // place Cards in random order
	}

	public void dealFiveCards() {
		// TODO
		int sum = 0, check =0;
		try{
			for(int i=0; i<5; i++){
				MyCard Card = myDeckOfCards.dealCard();
				int temp = Card.getPoint();
				System.out.printf("You got %s, %d points.\n",Card,temp);
				sum += temp;
				if(Card.isGhost()){
					System.out.printf("You got a Ghost card!\n");
					check=1;
				}
			}
			if(check == 1){
				System.out.printf("Ghost doubles the points!\n");
				sum *= 2;
			}
			System.out.printf("Your total points are %d\n",sum);
		}catch(NullPointerException e){
			System.out.printf("No card can be dealt, please restart the game!\n");
		}
	}	

} // end class PokerGame
