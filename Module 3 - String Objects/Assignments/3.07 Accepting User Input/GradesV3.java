/**
* Purpose: This program will input a set of test grades
*          from the user and output various forms of
*          information about them
*
* @author Jack Polk
* @version 1/10/2018
*/

import java.util.Scanner;         //imports Scanner methods
public class GradesV3
{
    public static void main(String[ ] args)
    {
      int testCount = 0;

      //Scanner Class Method
      Scanner input = new Scanner(System.in);

      //User Input
      System.out.print("Enter Student's Name: ");
      String name = input.nextLine();
      System.out.println();

      System.out.print("Enter Subject Name: ");
      String subject = input.nextLine();
      System.out.println();

      System.out.print("Test #1 Score (##%): ");
      int test0 = input.nextInt();
      testCount++;

      System.out.print("Test #2 Score (##%): ");
      int test1 = input.nextInt();
      testCount++;

      System.out.print("Test #3 Score (##%): ");
      int test2 = input.nextInt();
      testCount++;

      //Calculations
      int totalPoints = test0 + test1 + test2;
      double average = ((double)totalPoints) / testCount;

      //Final Information
      System.out.println();
      System.out.println("======================================");
      System.out.println();
      System.out.println("Name: " + name);
      System.out.println("Subject: " + subject);
      System.out.println("Number of Tests: " + testCount);
      System.out.println();
      System.out.println("Test #1: " + test0);
      System.out.println("Test #2: " + test1);
      System.out.println("Test #3: " + test2);
      System.out.println();
      System.out.println("Total Points: " + totalPoints);
      System.out.println("Average Score: " + average);
      System.out.println();
    }
}
