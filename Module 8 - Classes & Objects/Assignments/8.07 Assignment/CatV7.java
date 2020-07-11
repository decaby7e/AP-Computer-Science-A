/**
*
* Purpose: This class is responsible for holding the methods that a cat can
*          perform.
*
* @author Jack Polk
* @version 4/11/1
*
*/

import java.util.Scanner;
public class CatV7
{
  //Instance variables
  private boolean isPet;
  private double throwDistance;

  //Default constructor
  public CatV7(boolean p, double d)
  {
    isPet = p;
    throwDistance = d;
  }

  public String meow()
  {
    if(isPet){return "Meow!";}
    else{return "...";}

  }

  public double runAway()
  {
    return throwDistance / 5.0;
  }
}
