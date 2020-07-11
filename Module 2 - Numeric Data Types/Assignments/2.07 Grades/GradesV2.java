/**
* Purpose: This program will take a set of test grades
*          and output various forms of information about
*          them
*
* @author Jack Polk
* @version 10/23/2017
*/

public class GradesV2
{
    public static void main(String[ ] args)
    {
      //local variables
      int numTests = 0;      //counts number of tests
      int testGrade = 0;     //individual test grade
      int totalPoints = 0;   //total points for all tests
      double average = 0.0;  //average grade

      //Test 1
      numTests++;
      testGrade = 95;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #1  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 2
      numTests++;
      testGrade = 73;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #2  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 3
      numTests++;
      testGrade = 91;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #3  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 4
      numTests++;
      testGrade = 82;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #4  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 5
      numTests++;
      testGrade = 65;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #5  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 6
      numTests++;
      testGrade = 100;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #6  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 7
      numTests++;
      testGrade = 84;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #7  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 8
      numTests++;
      testGrade = 69;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #8  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

      //Test 9
      numTests++;
      testGrade = 99;
      totalPoints += testGrade;
      average = (double)totalPoints / numTests;
      System.out.print("Test #9  ");
      System.out.print("Test Grade: " + testGrade);
      System.out.print("  Total Points: " + totalPoints);
      System.out.println("  Average Score: " + average);

    }
}
