/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    public String toDimensions()
    {
      return getLength() + "x" + getWidth() + "x" + getHeight();
    }

    // String to display when object is printed.
    public String toString()
    {
        return "This box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

    public boolean equals(Box4 b)
    {
      if(getWidth() == b.getWidth() && getHeight() == b.getHeight() && getLength() == b.getLength()){return true;}
      else{return false;}
    }
}
