package oracleTutorials.PlayingCards;


public class Deck {
	public static final int NUM_CARDS = Suits.values().length * Ranks.values().length;
	
	private Card[] cards = new Card[NUM_CARDS];
	
	public Deck() {
		int i = 0;
		for(Suits s : Suits.values()) {
			for(Ranks r : Ranks.values()) {
				cards[i++] = new Card(s, r);
			}
		}
	}
	
	//Provide iterator
	interface DeckIterator extends java.util.Iterator<Card>{}
	
	public String toString(DeckIterator deckIter) {
		StringBuilder sb = new StringBuilder();
		if(deckIter.hasNext())
			sb.append(deckIter.next().toString());
		return sb.toString();	
	}
	
	public class ForEach implements DeckIterator{
		int nextIndex = 0;
		
		public boolean hasNext() {
			return (nextIndex < NUM_CARDS);
		}
		
		public Card next() {
			int index = nextIndex++;
			return getCard(index);
		}
	}
	
	public DeckIterator getIterator() {
		return new ForEach();
	}
	
	//TODO sort by Suit / Rank
	
	public Card getCard(Suits suit, Ranks rank) {
		for(Card c : cards) {
			if(c.getSuit() == suit && c.getRank() == rank)
				return c;
		}
		return null;
	}
	
	public Card getCard(int index) {
		return (index < NUM_CARDS) ? cards[index] : null;
	}
	
	public int getDeckLength() {
		return NUM_CARDS;
	}
}
