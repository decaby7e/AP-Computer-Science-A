/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "This rectangle's dimensions are " + length + " X " + width;
    }

    public String toDimensions()
    {
      return getLength() + "x" + getWidth();
    }

    // equals override
    public boolean equals(Rectangle4 r)
    {
      if(getLength() == r.getLength() && getWidth() == r.getWidth()){return true;}
      else{return false;}
    }
}
