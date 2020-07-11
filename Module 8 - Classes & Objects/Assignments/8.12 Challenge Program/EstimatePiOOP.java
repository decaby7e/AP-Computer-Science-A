/**
 * @purpose: The purpose of this program is to approximate pi using the Monte Carlo method
 * through the use of object oriented programming
 *
 * @author Jack Polk
 * @version 4/18/18
 */

import java.lang.Math;
import java.util.Scanner;

public class EstimatePiOOP
{
  private int myNumTrials, myNumSubTrials;
  private double pi, piAverage;
  private double[] piValues;
  private String outString;

  /**
   * Constructor for objects of type EstimatePiOOP
   * @param numTrials The number of tests to be performed
   * @param numSubTrials The number of trials for every test
   */
  public EstimatePiOOP(int numTrials, int numSubTrials)
  {
    myNumTrials = numTrials;
    myNumSubTrials = numSubTrials;
  }

  //Runs trial and subtrials for pi and stores them to an array
  public void calculatePis()
  {
    double hitX = 0;
    double hitY = 0;
    double r = 0;
    piValues = new double[myNumTrials];

    for(int j = 0; j < myNumTrials; j++)
    {
      int h = 0;
      int n = 0;
      for(int i = 0; i < myNumSubTrials; i++)
      {
        hitX = Math.random();
        hitY = Math.random();
        r = Math.sqrt(hitX*hitX + hitY*hitY);
        if(r <= 1.0){h++;}
        n++;
      }
      piValues[j] = 4.0  * (double)h / (double)n;
    }
  }

  //Calculates the average value of pi based on all the trials
  public void averagePi()
  {
    double sum = 0;
    piAverage = 0;

    for(int i = 0; i < piValues.length; i++)
    {
      sum += piValues[i];
    }
    piAverage = sum / piValues.length;
  }

  //Returns double array containing all estimated values of pi
  public double [] getPis()
  {
    return piValues;
  }

  //Returns average value of pi
  public double getAveragePi()
  {
    return piAverage;
  }

  //Returns number of tests
  public int getNumTests()
  {
    return myNumTrials;
  }

  //Returns number of trials
  public int getNumTrials()
  {
    return myNumSubTrials;
  }

  //Returns an array of all calculated pi values
  public double [] getPiValues()
  {
    return piValues;
  }


  //Displays all information to the display
  public String toString(int i)
  {
    outString = String.format("|  %2d   |      %-8d   |            %-5d          |  %6.5f  |", i, myNumTrials, myNumSubTrials, piAverage);
    return outString;
  }
}
