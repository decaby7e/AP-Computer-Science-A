/**
* This is the implementation class of a prime number processor
*
* @author Jack Polk
* @version 02/17/2019
*/

import java.util.*;

public class Prime
{
  int p, q;
  ArrayList<Integer> primes = new ArrayList<Integer>();

  public Prime(int p, int q)
  {
    this.p = p;
    this.q = q;
  }

  public void calcPrimes()
  {
    int searchLen = q - p;
    int targetInt;

    for(int i = 1; i < searchLen; i++)
    {
      targetInt = p + i;
      if(isPrime(targetInt)){primes.add(targetInt);}
    }
  }

  public boolean isPrime(int targetInt)
  {
    for(int i = 2; i < targetInt / 2; i++)
    {
      if(targetInt % i == 0){return false;}
    }
    return true;
  }

  public ArrayList<Integer> getPrimes()
  {
    return primes;
  }

  public int getPrimeCount()
  {
    return primes.size();
  }
}
