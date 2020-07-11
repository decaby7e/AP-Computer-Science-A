/**
*
* Purpose: This class is responsible for holding the methods that a cat can
*          perform.
*
* @author Jack Polk
* @version 4/17/18
*
*/

import java.util.Scanner;
public class CatV8
{
  //Instance variables
  private boolean isPet;
  private double throwDistance, speed;
  private String sound;

  //Default constructor
  public CatV8(boolean p, double d)
  {
    isPet = p;
    throwDistance = d;
  }

  //Setter Methods
  public void setSound(boolean p)
  {
    isPet = p;
  }

  public void setDistance(double d)
  {
    throwDistance = d;
  }

  //Getter Methods
  public String getSound()
  {
    return sound;
  }

  public double getSpeed()
  {
    return speed;
  }

  //Mutator Methods
  public void makeSound()
  {
    if(isPet){sound = "Meow!";}
    else{sound = "...";}

  }

  public void makeSpeed()
  {
    speed = throwDistance * 2;
  }

  public String toString(int counter)
  {
    return String.format("Cat %d said %5s and ran at %-6.2f m/s!", counter, sound, speed);
  }

}
