package oracleTutorials.PlayingCards;


public class Card {
	private final Ranks rank;
	private final Suits suit;
	
	public Card (Suits suit, Ranks rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public Ranks getRank() {
		return rank;
	}

	public Suits getSuit() {
		return suit;
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
	
	public static void main(String[] args) {
		// must run program with -ea flag (java -ea ..) to
    	// use assert statements
        assert Ranks.ACE.toString() == "Ace";
        assert Ranks.DEUCE.toString() == "Deuce";
        assert Ranks.THREE.toString() == "Three";
        assert Ranks.FOUR.toString() == "Four";
        assert Ranks.FIVE.toString() == "Five";
        assert Ranks.SIX.toString() == "Six";
        assert Ranks.SEVEN.toString() == "Seven";
        assert Ranks.EIGHT.toString() == "Eight";
        assert Ranks.NINE.toString() == "Nine";
        assert Ranks.TEN.toString() == "Ten";
        assert Ranks.JACK.toString() == "Jack";
        assert Ranks.QUEEN.toString() == "Queen";
        assert Ranks.KING.toString() == "King";

        assert Suits.DIAMONDS.toString() == "Diamonds";
        assert Suits.CLUBS.toString() == "Clubs";
        assert Suits.HEARTS.toString() == "Hearts";
        assert Suits.SPADES.toString() == "Spades";
	}
	
}