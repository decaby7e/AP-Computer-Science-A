/**
*
* Purpose: To represent a cat as an object in java with two possible
*          actions: to run or and/or to meow
*
* @author Jack Polk
* @version 4/17/18
*
*/
public class CatV8Tester
{
  public static void main(String[ ] args)
  {
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;
    //Initialization of object array
    CatV8[] cats = {new CatV8(true, 32.0),
                    new CatV8(false, 25.6),
                    new CatV8(true, 102.4),
                    new CatV8(false, 31.415),
                    new CatV8(false, 91.92631770)};

    //Invoke methods
    for(int i = 0; i < cats.length; i++)
    {
      cats[i].makeSound();
      cats[i].makeSpeed();
    }

    //Statistics calculations
    double averageSpeed = 0;
    double percentMeow = 0;
    double speedSum = 0;
    double meowSum = 0;

    for(int i = 0; i < cats.length; i++)
    {
      speedSum += cats[i].getSpeed();
      if(cats[i].getSound().equals("Meow!"))
      {
        meowSum++;
      }
    }
    averageSpeed = speedSum / cats.length;
    percentMeow = (meowSum / cats.length) * 100;

    for(int i = 0; i < cats.length; i++)
    {
      if(cats[i].getSpeed() < min)
      {
        min = cats[i].getSpeed();
      }

      if(cats[i].getSpeed() > max)
      {
        max = cats[i].getSpeed();
      }
    }

    //Output string
    System.out.println("          What are the cats up to?          ");
    for(int i = 0; i < cats.length; i++)
    {
      System.out.println(cats[i].toString((i + 1)));
    }

    //Output Statistics
    System.out.println("");
    System.out.println("          Cat Statistics!          ");
    System.out.printf("Minimum speed: %4.2f%n", min);
    System.out.printf("Maximum speed: %4.2f%n", max);
    System.out.printf("Average speed: %4.2f%n", averageSpeed);
    System.out.printf("Percentage of cats that meowed: %4.2f%s%n", percentMeow, "%");
  }
}
