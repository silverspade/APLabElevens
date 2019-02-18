package Activity1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card testing1 = new Card("ace", "spades", 11);
		Card testing2 = new Card("three", "clubs", 3);
		Card testing3 = new Card("queen", "hearts", 11);
		Card testing4 = new Card("ace", "spades", 11);
		
		System.out.println(testing1.rank());
		System.out.println(testing2.rank());
		System.out.println(testing3.rank());
		
		System.out.println(testing1.suit());
		System.out.println(testing2.suit());
		System.out.println(testing3.suit());
		
		System.out.println(testing1.pointValue());
		System.out.println(testing2.pointValue());
		System.out.println(testing3.pointValue());
		
		System.out.println(testing1.toString());
		System.out.println(testing2.toString());
		System.out.println(testing3.toString());
		
		System.out.println(testing1.matches(testing4));
		System.out.println(testing2.matches(testing4));
		System.out.println(testing3.matches(testing4));
	}
}
