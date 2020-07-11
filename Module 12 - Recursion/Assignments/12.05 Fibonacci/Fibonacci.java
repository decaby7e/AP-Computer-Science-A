/**
 *
 * To calculate the fibonacci number of index n by use of recursive mechanisms
 *
 * @author Jack Polk
 * @version 01/10/2019
 *
*/

public class Fibonacci
{

  public Fibonacci(){}

  public int fibb(int n)
  {
    if(n == 0){return 0;}

    else if(n == 1){return 1;}

    else{
      int temp = fibb(n - 1) + fibb(n - 2);
      return temp;
    }//end else
  }//end fibb

}//end class
