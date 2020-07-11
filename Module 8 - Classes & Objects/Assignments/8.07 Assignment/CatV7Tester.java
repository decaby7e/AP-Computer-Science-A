/**
*
* Purpose: To represent a cat as an object in java with two possible
*          actions: to run or and/or to meow
*
* @author Jack Polk
* @version 4/11/18
*
*/

public class CatV7Tester
{
  public static void main(String[ ] args)
  {
    //Variable declaration
    boolean throwBall1, throwBall2, throwBall3;
    double throwDistance1, throwDistance2, throwDistance3, catSpeed1, catSpeed2, catSpeed3;
    String catMeow1, catMeow2, catMeow3;

    throwBall1 = true; throwBall2 = false; throwBall3 = true;
    throwDistance1 = 50.0; throwDistance2 = 20.8; throwDistance3 = 1000.3;

    //Initialization of objects
    CatV7 cat1 = new CatV7(throwBall1, throwDistance1);
    CatV7 cat2 = new CatV7(throwBall2, throwDistance2);
    CatV7 cat3 = new CatV7(throwBall3, throwDistance3);

    //Calling CatV7 methods for each object
    catMeow1 = cat1.meow();
    catMeow2 = cat2.meow();
    catMeow3 = cat3.meow();
    catSpeed1 = cat1.runAway();
    catSpeed2 = cat2.runAway();
    catSpeed3 = cat3.runAway();

    //Display output
    System.out.println("Cat 1 said: " + catMeow1 + "\n");
    System.out.println("Cat 2 said: " + catMeow2 + "\n");
    System.out.println("Cat 3 said: " + catMeow3 + "\n");

    System.out.println("Cat 1 ran at " + catSpeed1 + "m/s!\n");
    System.out.println("Cat 2 ran at " + catSpeed2 + "m/s!\n");
    System.out.println("Cat 3 ran at " + catSpeed3 + "m/s!\n");
  }
}
