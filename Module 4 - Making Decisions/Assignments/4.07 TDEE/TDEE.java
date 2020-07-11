/**
* Purpose: To calculate total daily energy expenditure with logical
*          operators given user input
* @author Jack Polk
* @version 1/23/18
*/

import java.util.Scanner;

public class TDEE{
  public static void main(String[ ] args){
    Scanner in = new Scanner(System.in);

    //Variable initialization
    String name;
    Double bmr;
    String gender;
    String activityLevel;
    double activityFactor = 1.0;
    double tdee;

    //User input
    System.out.println("Total Daily Energy Expenditure (TDEE) Calculator");
    System.out.println();
    System.out.print("Please enter your name: ");
    name = in.nextLine();
    System.out.print("Please enter your BMR: ");
    bmr = in.nextDouble();
    System.out.print("Please enter your gender (M/F): ");
    gender = in.next();

    //Menu
    System.out.println();
    System.out.println("Select an activity level:");
    System.out.println("[A] Resting (Sleeping, Relining, etc.)");
    System.out.println("[B] Sedentary (Minimal Movement)");
    System.out.println("[C] Light (Sitting, Standing, Walking, etc.)");
    System.out.println("[D] Moderate (Light Work, Dancing, Swimming)");
    System.out.println("[E] Very Active (Sprinting, Hard Labor, Team Sports)");
    System.out.println("[F] Extremely Active (Full-Time Athlete, Regular High-Intensity Workouts)");
    activityLevel = in.next();

    //TDEE Calculations

    //Male
    if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("A")){
      activityFactor = 1.0;
    }
    else if(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("B")){
      activityFactor = 1.3;
    }
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("C")){
      activityFactor = 1.6;
    }
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("D")){
      activityFactor = 1.7;
    }
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("E")){
      activityFactor = 2.1;
    }
    else if(gender.equalsIgnoreCase("M") && activityLevel.equalsIgnoreCase("F")){
      activityFactor = 2.4;
    }

    //Female
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("C")){
      activityFactor = 1.5;
    }
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("D")){
      activityFactor = 1.6;
    }
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("E")){
      activityFactor = 1.9;
    }
    else if(gender.equalsIgnoreCase("F") && activityLevel.equalsIgnoreCase("F")){
      activityFactor = 2.2;
    }
    else{
      System.out.println("Invalid Input. Please check options to ensure they are entered correctly.");
      System.exit(0);
    }
    tdee = (double)bmr * activityFactor;

    //Output
    System.out.println();
    System.out.println("Results:");
    System.out.println();
    System.out.println("  Name: " + name);
    System.out.println("  Gender: " + gender.toUpperCase());
    System.out.println();
    System.out.println("  BMR: " + bmr + " Calories/Day");
    System.out.println("  Activity Factor: " + activityFactor);
    System.out.println("  TDEE: " + tdee + " Calories/Day");

  }
}
