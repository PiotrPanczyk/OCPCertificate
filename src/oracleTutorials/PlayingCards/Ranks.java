package oracleTutorials.PlayingCards;

	// Kinds of ranks
public enum Ranks{
    ACE   (1),
    DEUCE (2),
    THREE (3),
    FOUR  (4),
    FIVE  (5),
    SIX   (6),
    SEVEN (7),
    EIGHT (8),
    NINE  (9),
    TEN   (10),
    JACK  (11),
    QUEEN (12),
    KING  (13);
	
	private final int value;
	Ranks(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public static String toString(Ranks rank) {
		switch(rank) {
		case ACE: return "Ace";
		case DEUCE: return "Deuce";
		case THREE: return "Three";
        case FOUR: return "Four";
        case FIVE: return "Five";
        case SIX: return "Six";
        case SEVEN: return "Seven";
        case EIGHT: return "Eight";
        case NINE: return "Nine";
        case TEN: return "Ten";
        case JACK: return "Jack";
        case QUEEN: return "Queen";
        case KING: return "King";
        default:
            //Handle an illegal argument.  There are generally two
            //ways to handle invalid arguments, throwing an exception
            //(see the section on Handling Exceptions) or return null
            return null;	
		}
	}
}
