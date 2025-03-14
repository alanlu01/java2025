package ntou.cs.java2025;
public class Card {

    private final String face; // 牌的點數文字 (Ace, Deuce, ...)
    private final String suit; // 牌的花色 (Hearts, Diamonds, ...)

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }

    public int getPoints() {
        int index = -1;
        for (int i = 0; i < DeckOfCards.FACES.length; i++) {
            if (DeckOfCards.FACES[i].equals(face)) {
                index = i;
                break;
            }
        }

        switch (index) {
            case 0:  return 20; // Ace
            case 1:  return 2;  // Deuce
            case 2:  return 3;  // Three
            case 3:  return 4;  // Four
            case 4:  return 5;  // Five
            case 5:  return 6;  // Six
            case 6:  return 7;  // Seven
            case 7:  return 8;  // Eight
            case 8:  return 9;  // Nine
            case 9:  return 10; // Ten
            case 10: return 11; // Jack
            case 11: return 12; // Queen
            case 12: return 13; // King
            default: return 0;
        }
    }
}