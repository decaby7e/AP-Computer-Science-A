/**
 * This is a class that tests the Card class.
 *
 *  Jack Polk
 *  05/19/2019
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      Card aceSpades = new Card("ace", "spades", 1);

      // Test card 3
      Card kingHearts = new Card("king", "hearts", 10);

      // Test matches() method
      System.out.println("**** Test matches ****");
      System.out.println("Matching: " + aceSpades.equals(aceSpades));
      System.out.println("Not Matching: " + kingHearts.equals(aceSpades));

   }
}
