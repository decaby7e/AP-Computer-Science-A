/**
*
* The purpose of this program is to use the Monte Carlo sampling method to
* determine how many fish an individual may observe before seeing a snapper
* out of a sample greater than or equal to 1000 fish
*
* @author Jack Polk
* @version 2/6/2018
*
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class AnimalPopulation
{
  public static void main(String [] args) throws IOException
  {
    //Variable & Object Declaration
    Random randList = new Random();
    File filename = new File("data.txt");
    PrintWriter outFile = new PrintWriter(filename);
    Scanner in = new Scanner(System.in);

    int minTrialNum = 1000;
    int trialNum = 0;
    //17% Chance of seeing a snapper (1/6)
    int snapper = 1;
    int randNum = 0;
    int trialCount = 0;
    double average = 0.0;


    //User Input
    System.out.println("Welcome to the Snapper Simulator!");
    System.out.println("");
    System.out.println("Please enter your preffered number of trials to be run (Must be over " + minTrialNum + "): ");
    trialNum = in.nextInt();

    while(trialNum < minTrialNum){
      System.out.println("Invalid Input; Number of trials must be over " + minTrialNum + ": ");
      trialNum = in.nextInt();
    }
    //System.out.println("***TEST: Success!");

    //Trial Simulations
    System.out.println("");
    System.out.println("Conducting Trials...");
    System.out.println("");
    for(int n = 0; n < trialNum; n++)
    {
      randNum = randList.nextInt(6) + 1;
      while(randNum != snapper)
      {
        trialCount++;
        //System.out.println("***TEST: " + trialCount);
        randNum = randList.nextInt(6) + 1;
      }
      outFile.println(trialCount);
      //System.out.println("***TEST: " + "Trial " + n + ": " + trialCount);
      trialCount = 0;
    }
    outFile.close();

    //Calculations
    Scanner inFile = new Scanner(filename);
    while(inFile.hasNextInt())
    {
      average += inFile.nextInt();
    }
    average = average / (double)trialNum;

    inFile.close();

    //Display
    System.out.println("Success!");
    System.out.println("The average number of fish that will be seen before seeing a snapper is " + average + ".");
    System.out.println("");

  }
}
