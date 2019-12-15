package oracleTutorials.PlayingCards;


public class Test {

	public static void main(String[] args) {
		Deck d = new Deck();
//		for(int s = 0; s<Suits.values().length; s++) {
//			for(int r = 0; r<Ranks.values().length; r++) {
//				Card c = d.getCard(Suits.values()[s], Ranks.values()[r]);
//				System.out.printf("%8s, %6s | ", Suits.toString(c.getSuit()), Ranks.toString(c.getRank()));
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i<d.getDeckLength(); i++) {
//			Card c = d.getCard(i);
//			System.out.printf("%8s, %6s | ", Suits.toString(c.getSuit()), Ranks.toString(c.getRank()));
//		}
		
		Deck.DeckIterator iter = d.getIterator();
		while(iter.hasNext()) {
			Card c = iter.next();
			System.out.println(c.toString());
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println(d.toString());

	}

}
