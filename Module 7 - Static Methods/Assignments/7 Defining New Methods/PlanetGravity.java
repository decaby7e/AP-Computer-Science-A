/**
 * The purpose of this program is to determine the surface gravity of a given
 * planet given its mass and diameter.
 *
 * @author Jack Polk
 * @version 03/15/18
 */

import java.lang.Math;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PlanetGravity
{
  //Surface gravity of the planet
  public static double[] surfaceGravity(double[] masses, double[] diameters)
  {
    double [] gravities = new double[8];
    double G = 6.67e-11;
    double r = 0;

    for (int i = 0; i < 8; i++){
      r = (diameters[i] * 1000) / 2.0;
      gravities[i] = (G * masses[i]) / Math.pow(r, 2);
    }
    return gravities;
  }

  //Display all information
  public static void displayOutput(String[] planetNames, double[] diameters, double[] masses, double[] gravities) throws IOException
  {
    PrintWriter fileOut = new PrintWriter(new File("planetgravity.txt"));
    System.out.println("                      Planetary Data");
    System.out.println("  Planet      Diameter(km)      Mass(kg)      g(m/s^2)  ");
    System.out.println("--------------------------------------------------------");
    for(int i = 0; i < 8; i++)
    {
      System.out.printf("%-8s       %6.0f           %-3.2E        %-3.2f%n", planetNames[i], diameters[i], masses[i], gravities[i]);
      fileOut.printf("%-8s       %6.0f           %-3.2E        %-3.2f%n", planetNames[i], diameters[i], masses[i], gravities[i]);
    }
    fileOut.close();
  }

  //Main method
  public static void main(String[ ] args) throws IOException
  {
    String [] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
    double [] diameters = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
    double [] masses = {3.30e23, 	4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
    double [] gravities = surfaceGravity(masses, diameters);

    displayOutput(planetNames, diameters, masses, gravities);

  }

}
