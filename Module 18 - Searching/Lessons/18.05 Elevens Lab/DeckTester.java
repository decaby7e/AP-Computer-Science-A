/**
 * This is a class that tests the Deck class.
 *
 *  Jack Polk
 *  05/19/2019
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] myRanks = {"queen", "king", "jack", "ace"};
      String[] mySuits = {"heart", "spade"};
      int[] myPointValues = {10, 10, 10, 11};
      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");
      for(int i = 0; i < 5; i++){System.out.println("  deal: " + myDeck.deal());}
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      while(myDeck.size() != 0){System.out.println(" deal: " + myDeck.deal());}
      System.out.println("  deal empty one: " + myDeck.deal());
      System.out.println();
      System.out.println();


      //*** TO BE IMPLEMENTED IN ACTIVITY 4 ***

      System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      String[] ranks52 = {"ace", "two", "three", "four", "five", "six", "seven",
                          "eight", "nine", "ten", "jack", "queen", "king"};
      String[] suits52 = {"spades", "hearts", "cloves", "diamonds"};
      int[] pointValues52 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

      Deck myDeck2 = new Deck(ranks52, suits52, pointValues52);

      System.out.println("  The Starting Deck ");
      System.out.println(myDeck2.toString());

      System.out.println("  The Deck After Dealing a Card" );
      myDeck2.deal();
      System.out.println(myDeck2.toString());

      System.out.println("  Shuffling the Deck ");
      myDeck2.shuffle();
      System.out.println(myDeck2.toString());


   }
}
