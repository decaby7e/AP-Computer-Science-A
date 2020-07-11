/**
 *
 * To calculate the fibonacci number of index n by use of recursive mechanisms
 *
 * @author Jack Polk
 * @version 01/10/2019
 *
*/

import java.util.Scanner;

public class FibonacciTester{

  public static void main(String[] args)
  {

    boolean exit = false;
    Scanner input = new Scanner(System.in);
    Fibonacci fibb = new Fibonacci();

    while(exit == false)
    {

      System.out.print("Enter a number: ");
      int n = input.nextInt(); // Scans the next token of the input as an int.

      System.out.println(fibb.fibb(n));

    }//end while

    input.close();
  }//end main

}//end class
