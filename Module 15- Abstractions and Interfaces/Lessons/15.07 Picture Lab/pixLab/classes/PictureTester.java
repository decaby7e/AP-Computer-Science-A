/*
 * Purpose:
 *
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  // MY METHODS \\

  public static void testKeepOnlyRed()
  {
    Picture arch = new Picture("arch.jpg");

    arch.explore();
    arch.keepOnlyRed();
    arch.explore();
  }

  public static void testNegate()
  {
    Picture arch = new Picture("arch.jpg");

    arch.explore();
    arch.negate();
    arch.explore();
  }

  public static void testGrayscale()
  {
    Picture arch = new Picture("arch.jpg");

    arch.explore();
    arch.grayscale();
    arch.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture arch = new Picture("arch.jpg");

    arch.explore();
    arch.mirrorVerticalRightToLeft();
    arch.explore();
  }

  public static void testMirrorHorizontal()
  {
    Picture arch = new Picture("arch.jpg");

    arch.explore();
    arch.mirrorHorizontal();
    arch.explore();
  }

  public static void testMirrorHorizontalBotToTop()
  {
    Picture arch = new Picture("arch.jpg");

    arch.explore();
    arch.mirrorHorizontalBotToTop();
    arch.explore();
  }

  public static void testMirrorArms()
  {
    Picture arms = new Picture("snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }

  public static void testMirrorGull()
  {
    Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and
    // comment out the ones you don't want to run

    //UNCOMMENT ALL BEFORE SUBMITTING
    // Activity 5
    //testZeroBlue();
    //testKeepOnlyRed();
    //testNegate();
    //testGrayscale();

    //UNCOMMENT ALL BEFORE SUBMITTING
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();

    // Activity 6 Challenge - optional
    //testMirrorDiagonal();

    // Activity 7
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();


    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();

    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();

    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
