/**
 * This program illustrates the use of the if-else-if structure
 * and determines an individuals BMI and weight category with
*  user input.
 *
 * @author Jack Polk
 * @version 01/18/2018
 */
import java.util.Scanner;
public class BMI{
  public static void main(String[ ] args){

    Scanner in = new Scanner(System.in);

    //Input
    System.out.print("Please enter your name (First Last): ");
    String name = in.nextLine();

    System.out.print("Please enter your height (ft in): ");
    int heightFt = in.nextInt();
    int heightIn = in.nextInt();

    System.out.print("Please enter your weight (lb): ");
    int weightLb = in.nextInt();

    //Conversions
    int heightInTotal = (heightFt * 12) + heightIn;
    double heightM = (double)heightInTotal / 39.37;
    double weightKg = (double)weightLb / 2.205;

    //Calculations
    double bmi = weightKg / (heightM * heightM);
    String cat;

    if(bmi < 18.5)
      cat = "Underweight";
    else if(bmi >= 18.5 && bmi < 24.9)
      cat = "Healthy Weight";
    else if(bmi >= 24.9 && bmi < 29.0)
      cat = "Overweight";
    else
      cat = "Obese";

    //Display
    System.out.println();
    System.out.println("Body Mass Index Calculator");
    System.out.println("==========================");
    System.out.println("Name: " + name);
    System.out.println("Height (m): " + heightM);
    System.out.println("Weight (kg): " + weightKg);
    System.out.println("BMI: " + bmi);
    System.out.println("Category: " + cat);

  }
}
