/**
 * The purpose of this program is to determine the weight of a person on
 * different planets.
 *
 * @author Jack Polk
 * @version 03/15/18
 */

 import java.lang.Math;
 import java.util.Scanner;
 import java.io.File;
 import java.io.IOException;
 import java.io.PrintWriter;

public class PlanetWeight
{
  public static double [] fileReader(String fileName) throws IOException
  {
    Scanner inFile = new Scanner(new File(fileName));
    double [] gravityData = new double[8];
    boolean stop = false;

    for(int i = 0; inFile.hasNext(); i++)
    {
      for(int k = 0; k < 3; k++){inFile.next();}
      gravityData[i] = inFile.nextDouble();
    }

    return gravityData;
  }

  public static double userWeight(){
    Scanner userInput = new Scanner(System.in);
    System.out.print("Please enter your weight(lbs): ");
    double weight = userInput.nextDouble();
    return weight;
  }

  public static double [] differentWeights(double[] gravityData, double weight)
  {
    double [] weights = new double[8];
    double mass = (weight  * 433.59237);
    for(int i = 0; i < 8; i++)
    {
      weights[i] = (mass * (gravityData[i] / 9.8)) / 433.59237;
    }

    return weights;
  }

  public static void displayOutput(String[] names, double[] gravity, double[] weights)
  {
    System.out.println("");
    System.out.println("        My Weight of the Planets");
    System.out.println(" Planet         Gravity          Weight");
    System.out.println("----------------------------------------");
    for(int i = 0; i < 8; i++)
    {
      System.out.printf("%-16s %-16.2f %-1.2f%n", names[i], gravity[i], weights[i]);
    }
  }

  public static void main(String [] args) throws IOException
  {
    String fileIn = "planetgravity.txt";
    String [] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    double [] gravityData = fileReader(fileIn);
    double weight = userWeight();

    double [] weights = differentWeights(gravityData, weight);

    displayOutput(planetNames, gravityData, weights);
  }
}
