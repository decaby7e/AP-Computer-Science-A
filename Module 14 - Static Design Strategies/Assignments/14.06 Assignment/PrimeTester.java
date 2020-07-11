/**
* This is the tester class of a prime number processor
*
* @author Jack Polk
* @version 02/17/2019
*/

import java.util.*;

public class PrimeTester
{
  public static void main(String[] args)
  {
    int lowerLim = 0;
    int upperLim = 0;
    boolean inputValid = false;

    Scanner in = new Scanner(System.in);

    while(!inputValid)
    {
      try
      {
        System.out.print("Lower bound: ");
        lowerLim = in.nextInt();

        System.out.print("Upper bound (> "+lowerLim+"): ");
        upperLim = in.nextInt();

        if(upperLim <= lowerLim)
        {
          System.out.println("\nUpper boundry must be higher than " + lowerLim + "\n");
          inputValid = false;
        }

        else{inputValid = true;}
      }

      catch(InputMismatchException e)
      {
        in.next();
        System.out.println("\nNot an integer\n");
      }
    }

    Prime primer = new Prime(lowerLim, upperLim);

    primer.calcPrimes();
    ArrayList<Integer> primes = primer.getPrimes();

    System.out.println("\n===== "+primer.getPrimeCount()+" primes were found between "+lowerLim+" and "+upperLim+" =====");
    System.out.print("\nPrimes: ");
    for(Integer i:primes){System.out.print(i+",");}
    System.out.println("\n");
  }
}
