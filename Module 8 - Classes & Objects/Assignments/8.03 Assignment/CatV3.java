/**
*
* Purpose: To represent a cat as an object in java with two possible
*          actions: to run or and/or to meow
*
* @author Jack Polk
* @version 4-4-18
*
*/

import java.util.Scanner;
public class CatV3
{
  //Default constructor
  public CatV3()
  {
  }

  public String meow(boolean isPet)
  {
    if(isPet){return "\nMeow!\n";}
    else{return "\n...\n";}

  }

  public double runAway(double throwDistance)
  {
    return throwDistance / 5.0;
  }

  public static void main(String[ ] args)
  {
    boolean exit = false;
    double throwDistance = 0;
    String inBuff = "";

    Scanner userInput = new Scanner(System.in);
    CatV3 cat = new CatV3();

    while(!exit)
    {
      System.out.println("Would you like to pet the cat? (y/n): ");
      inBuff = userInput.nextLine();

      if(inBuff.equalsIgnoreCase("y"))
      {
        System.out.println(cat.meow(true));
        exit = true;
      }

      else if(inBuff.equalsIgnoreCase("n"))
      {
        System.out.println(cat.meow(false));
        exit = true;
      }

      else{System.out.println("\nPlease enter y or n.\n");}
    }
    exit = false;

    while(!exit)
    {
      System.out.println("Enter how far you would like to throw a ball for the cat (m): ");
      throwDistance = userInput.nextDouble();

      System.out.println("\nWow! The cat ran at " + cat.runAway(throwDistance) + " m/s\n");
      exit = true;
    }

    userInput.close();
  }
}
