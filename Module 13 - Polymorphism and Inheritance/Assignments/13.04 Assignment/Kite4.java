/**
 * This class defines a Kite object using
 * d1 and d2
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

public class Kite4
{
    // instance variables
    private int d1;
    private int d2;

    // Constructor for objects of class Rectangle
    public Kite4(int diag1, int diag2)
    {
        // initialize instance variables
        d1 = diag1;
        d2 = diag2;
    }

    // return the height
    public int getHeight()
    {
        return d1;
    }

    // return the width
    public int getWidth()
    {
        return d2;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "This kite's dimensions are " + getWidth() + " X " + getHeight();
    }

    public String toDimensions()
    {
      return getWidth() + "x" + getHeight();
    }

    public boolean equals(Kite4 k)
    {
      if(getWidth() == k.getWidth() && getHeight() == k.getHeight()){return true;}
      else{return false;}
    }
}
