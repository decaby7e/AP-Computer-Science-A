/**
*
* Purpose: To take information about hurricanes from 1995 to 2015, with the range depending on the
*          user's input, and output that information in order along with some information on
*          counts and statistics.
*
* @author Jack Polk
* @version 2/23/18
*
*/

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class HurricaneSelector
{
  public static void main(String [] args) throws IOException
  {
    //Variable Declaration
    double min = Double.MAX_VALUE;
    double max = Double.MIN_VALUE;

    Scanner in = new Scanner(new File("hurricanedata.txt"));
    Scanner userIn = new Scanner(System.in);

    int yearA = 0;
    int yearB = 0;

    int arrayLength = 0;

    int cat1 = 0;
    int cat2 = 0;
    int cat3 = 0;
    int cat4 = 0;
    int cat5 = 0;

    double speedSum = 0;
    double catSum = 0;
    double pressureSum = 0;
    double speedAvg = 0;
    double catAvg = 0;
    double pressureAvg = 0;

    double minSpeed = min;
    double maxSpeed = max;
    double minCat = min;
    double maxCat = max;
    double minPressure = min;
    double maxPressure = max;

    //Year Range (As defined by user)
    System.out.println("");
    System.out.print("Please select the beginning year (1995 - 2015): ");
    yearA = userIn.nextInt();

    while(!(yearA >= 1995 && yearA <= 2015)){
      System.out.println("");
      System.out.print("Invalid year choice. Please select a correct year: ");
      yearA = userIn.nextInt();
    }

    System.out.println("");
    System.out.print("Please select the ending year (" + yearA + " - 2015): ");
    yearB = userIn.nextInt();

    while(!(yearB >= 1995 && yearB <= 2015) || (yearB < yearA)){
      System.out.println("");
      System.out.print("Invalid year choice. Please select a correct year: ");
      yearB = userIn.nextInt();
    }

    //Count Number of Years
    while(in.hasNext()){
      if(in.hasNextLine()){
        arrayLength++;
        in.nextLine();
      }
    }

    //Reset Scanner Position
    in.close();
    in = new Scanner(new File("hurricanedata.txt"));

    //Range Definitions
    int a = 0;
    int beginCount = 0;
    int inRange = 0;
    String temp = "";

    temp = in.nextLine();
    a = Integer.parseInt(temp.substring(0, 4));

    while(a < yearA){
      temp = in.nextLine();
      a = Integer.parseInt(temp.substring(0, 4));
      beginCount++;
    }

    while(a >= yearA && a <= yearB){

      if(a <= yearB){
        if(Integer.parseInt(temp.substring(0, 4)) > yearB){}
        else{
          a = Integer.parseInt(temp.substring(0, 4));
          inRange++;
        }

        if(in.hasNextLine() && a <= yearB){temp = in.nextLine();}
        else{a = (int)max;}
      }

    }

    arrayLength = inRange;

    //Reset Scanner Position
    in.close();
    in = new Scanner(new File("hurricanedata.txt"));

    //Define Arrays
    String [] names = new String[arrayLength];
    String [] month = new String[arrayLength];
    int [] year = new int[arrayLength];
    int [] category = new int[arrayLength];
    double [] pressure = new double[arrayLength];
    double [] speed = new double[arrayLength];

    //Fill Arrays
    for(int i = 0; i < beginCount; i++){
      in.nextLine();
    }

    for(int i = 0; i < arrayLength; i++){
      year[i] = in.nextInt();
      month[i] = in.next();
      pressure[i] = in.nextDouble();
      speed[i] = in.nextDouble();
      names[i] = in.next();
      if(in.hasNextLine()){in.nextLine();}
    }

    in.close();

    //ALL CALCULATIONS

    //Speed Conversion (kts to mph)
    for(int i = 0; i < arrayLength; i++){
      speed[i] = speed[i] * 1.151;
    }

    //Categorizing Storms
    for (int i = 0; i < arrayLength; i++){
      if(speed[i] >= 74 && speed[i] <= 95){category[i] = 1; cat1++;}
      else if(speed[i] >= 96 && speed[i] <= 110){category[i] = 2; cat2++;}
      else if(speed[i] >= 111 && speed[i] <= 129){category[i] = 3; cat3++;}
      else if(speed[i] >= 130 && speed[i] <= 156){category[i] = 4; cat4++;}
      else if(speed[i] >= 157){category[i] = 5; cat5++;}
    }

    //Average Calculations
    for(double i : category){
      catSum += i;
    }
    catAvg = catSum / arrayLength;

    for(double i : speed){
      speedSum += i;
    }
    speedAvg = speedSum / arrayLength;

    for(double i : pressure){
      pressureSum += i;
    }
    pressureAvg = pressureSum / arrayLength;

    //Max/Min Calculations
    for(int i = 0; i < arrayLength; i++){
      if(category[i] < minCat){minCat = category[i];}
      if(category[i] > maxCat){maxCat = category[i];}
    }

    for(int i = 0; i < arrayLength; i++){
      if(speed[i] < minSpeed){minSpeed = speed[i];}
      if(speed[i] > maxSpeed){maxSpeed = speed[i];}
    }

    for(int i = 0; i < arrayLength; i++){
      if(pressure[i] < minPressure){minPressure = pressure[i];}
      if(pressure[i] > maxPressure){maxPressure = pressure[i];}
    }

    //Display
    System.out.println("");
    System.out.println("Hurricanes " + yearA + " - " + yearB);
    System.out.println("");
    System.out.println("Year     Hurricane     Category     Pressure(mb)     Wind Speed(mph)");
    System.out.println("=====================================================================");

    for(int i = 0; i < arrayLength; i++){
      System.out.printf("%d", year[i]);
      System.out.printf("     %-10s", names[i]);
      System.out.printf("       %d", category[i]);
      System.out.printf("            %3.1f", pressure[i]);
      System.out.printf("             %3.1f\n", speed[i]);
    }

    System.out.println("");
    System.out.println("Statistics");
    System.out.println("=====================================================================");
    System.out.println("Averages: ");
    System.out.printf("\tCategory: %1.1f", catAvg);
    System.out.printf("\n\tPressure: %1.1f", pressureAvg);
    System.out.printf("\n\tSpeed: %1.2f", speedAvg);
    System.out.println("\n");
    System.out.println("Minimums: ");
    System.out.printf("\tCategory: %1.1f", minCat);
    System.out.printf("\n\tPressure: %1.1f", minPressure);
    System.out.printf("\n\tSpeed: %1.2f", minSpeed);
    System.out.println("\n");
    System.out.println("Maximums: ");
    System.out.printf("\tCategory: %1.1f", maxCat);
    System.out.printf("\n\tPressure: %1.1f", maxPressure);
    System.out.printf("\n\tSpeed: %1.2f", maxSpeed);

    System.out.println("\n");
    System.out.println("Summary of Categories:");
    System.out.println("\tCat 1: " + cat1);
    System.out.println("\tCat 2: " + cat2);
    System.out.println("\tCat 3: " + cat3);
    System.out.println("\tCat 4: " + cat4);
    System.out.println("\tCat 5: " + cat5);

    //File Output
    PrintWriter fileOut = new PrintWriter(new File("fileout.txt"));
    fileOut.println("Hurricanes " + yearA + " - " + yearB);
    fileOut.println("Count: " + arrayLength);
    fileOut.println("");
    fileOut.println("Summary of Categories:");
    fileOut.println("\tCat 1: " + cat1);
    fileOut.println("\tCat 2: " + cat2);
    fileOut.println("\tCat 3: " + cat3);
    fileOut.println("\tCat 4: " + cat4);
    fileOut.println("\tCat 5: " + cat5);
    fileOut.println("");
    fileOut.println("Statistics");
    fileOut.println("=====================================================================");
    fileOut.println("Averages: ");
    fileOut.printf("\tCategory: %1.1f", catAvg);
    fileOut.printf("\n\tPressure: %1.1f", pressureAvg);
    fileOut.printf("\n\tSpeed: %1.2f", speedAvg);
    fileOut.println("\n");
    fileOut.println("Minimums: ");
    fileOut.printf("\tCategory: %1.1f", minCat);
    fileOut.printf("\n\tPressure: %1.1f", minPressure);
    fileOut.printf("\n\tSpeed: %1.2f", minSpeed);
    fileOut.println("\n");
    fileOut.println("Maximums: ");
    fileOut.printf("\tCategory: %1.1f", maxCat);
    fileOut.printf("\n\tPressure: %1.1f", maxPressure);
    fileOut.printf("\n\tSpeed: %1.2f", maxSpeed);

    fileOut.close();

 }
}
