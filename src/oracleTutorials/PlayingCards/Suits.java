package oracleTutorials.PlayingCards;


    // Kinds of suits
public enum Suits{
	DIAMONDS	(1),
	CLUBS		(2),
	HEARTS		(3),
	SPADES		(4);
	
	private final int value;
	Suits(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static String toString(Suits suit) {
		switch(suit) {
        case DIAMONDS: return "Diamonds";
        case CLUBS: return "Clubs";
        case HEARTS: return "Hearts";
        case SPADES: return "Spades";
        default: return null;
		}
	}
}