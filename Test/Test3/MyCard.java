package ntou.cs.java2023.t3.chianyih;

public class MyCard extends Card {
	
	private final boolean isGhost;

	public MyCard(String cardFace, String cardSuit, boolean isGhost) {
		// TODO
		super(cardFace,cardSuit);
		this.isGhost = isGhost;
	}

	public int getPoint() {
		// TODO
		int point = -1;
		for(int i=1; i<13; i++){
			if(super.getFace().equals(DeckOfMyCards.FACES[i])){
				point = i+1;		
			}
		}
		if(super.getFace().equals(DeckOfMyCards.FACES[0])) point = 20;
		return point;
	}

	public boolean isGhost() {
		return isGhost;
	}

	@Override
	public String toString() {
		// TODO
		if(isGhost()){
			return String.format("%s(Ghost)",super.toString());
		}else{
			return super.toString();
		}
	}
}
