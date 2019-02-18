package Activity2;

import Activity4.Deck;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = new String[] {"1","2","3","4","5","6","7","8","9","10"};
		String[] suits1 = new String[] {"hearts","clubs","diamonds","spades"};
		int[] values1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Deck d = new Deck(ranks1, suits1, values1);

		System.out.println("Original Deck");
		System.out.println(d.toString());
		System.out.println("Deal 1 Card");
		System.out.println("  deal: " + d.deal());
		System.out.println("After 1 Card Dealt");
		System.out.println("  size: " + d.size());
		
		String[] ranks2 = new String[] {"1","2","3","4","5"};
		String[] suits2 = new String[] {"apples", "pears"};
		int[] values2 = new int[] {1, 2, 3, 4, 5};
		Deck e = new Deck(ranks2, suits2, values2);

		System.out.println("Original Deck");
		System.out.println(e.toString());
		System.out.println("Deal 1 Card");
		System.out.println("  deal: " + e.deal());
		System.out.println("After 1 Card Dealt");
		System.out.println("  size: " + e.size());
		
		String[] ranks3 = new String[] {"1","2","3","4","5"};
		String[] suits3 = new String[] {"oranges", "grapes"};
		int[] values3 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Deck f = new Deck(ranks3, suits3, values3);

		System.out.println("Original Deck");
		System.out.println(f.toString());
		System.out.println("Deal 1 Card");
		System.out.println("  deal: " + f.deal());
		System.out.println("After 1 Card Dealt");
		System.out.println("  size: " + f.size());
	}
}
