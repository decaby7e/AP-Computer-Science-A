/**
*
* Purpose: To calculate the coordinates of points on a circle that has a radius
*          defined by the user
*
* @author Jack Polk
* @version 2/26/18
*
*/

import java.util.Scanner;
import java.lang.Math;

public class CirclePoints{
  public static void main(String[ ] args){
    //Variable Declarations
    Scanner userInput = new Scanner(System.in);

    double radius = 0;
    double increment = 0;
    double x = 0;
    double y1 = 0;
    double y2 = 0;

    //User Input
    while(radius <= 0){
      System.out.println("");
      System.out.print("Please enter a preferred radius length: ");

      radius = userInput.nextInt();
      System.out.println("");
      if(radius <= 0){System.out.println("Invalid input. Must be greater than 0.");}
    }
    x = radius;

    while(increment <= 0 || increment > radius){
      System.out.print("Please enter a preferred incremental value: ");

      increment = userInput.nextDouble();
      System.out.println("");
      if(increment <= 0){System.out.println("Invalid input. Must be greater than 0.");}
      else if(increment > radius){System.out.println("Invalid input. Must be less than " + radius);}
    }
    userInput.close();

    //Calculations & Display
    System.out.println("Points of Circle with Radius " + radius);
    System.out.println("");
    System.out.println("\tx\ty1\ty2");
    System.out.println("=========================================");


    while(x >= (-1 * radius)){
      y1 = Math.sqrt(Math.abs(Math.pow(radius, 2) - Math.pow(x, 2)));
      y2 = y1 - (2 * y1);
      System.out.printf("     % 1.2f    % 1.2f    % 1.2f%n", x, y1, y2);
      x -= increment;
    }



  }
}
