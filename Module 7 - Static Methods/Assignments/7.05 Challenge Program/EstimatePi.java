/**
 * The purpose of this program is to approximate pi using the Monte Carlo method
 *
 * @author Jack Polk
 * @version 3/17/18
 */

import java.lang.Math;
import java.util.Scanner;

public class EstimatePi
{
  //Runs trial and subtrials for pi and stores them to an array
  public static double [] calculatePi(int trials, int numTrials)
  {
    double [] piValues = new double[trials];
    double hitX = 0;
    double hitY = 0;
    double r = 0;

    for(int j = 0; j < trials; j++)
    {
      int h = 0;
      int n = 0;
      for(int i = 0; i < numTrials; i++)
      {
        hitX = Math.random();
        hitY = Math.random();
        r = Math.sqrt(hitX*hitX + hitY*hitY);
        if(r <= 1.0){h++;}
        n++;
      }
      piValues[j] = 4.0  * (double)h / (double)n;
    }
    return piValues;
  }

  //Calculates the average value of pi based on all the trials
  public static double averagePi(double[] piValues)
  {
    double piAverage = 0;
    double sum = 0;
    for(int i = 0; i < piValues.length; i++)
    {
      sum += piValues[i];
    }
    piAverage = sum / piValues.length;
    return piAverage;
  }

  //Displays all information to the display
  public static void displayOutput(double[] piValues, double pi)
  {
    System.out.println("");
    for(int i = 0; i < piValues.length; i++)
    {
      System.out.printf("Trial %d: π = %-1.6f%n", i, piValues[i]);
    }
    System.out.println("");
    System.out.printf("Estimate of π: %-1.6f%n", pi);
    System.out.println("");
  }

  //Main method
  public static void main(String [] args)
  {
    //Variable definitions
    Scanner userIn = new Scanner(System.in);

    System.out.println("");
    System.out.print("Enter number of trials: ");
    int trials = userIn.nextInt();
    System.out.print("Enter number of tests per trial: ");
    int numTrials = userIn.nextInt();
    userIn.close();

    //Method calls
    double [] piValues = calculatePi(trials, numTrials);
    double pi = averagePi(piValues);
    displayOutput(piValues, pi);
  }
}
