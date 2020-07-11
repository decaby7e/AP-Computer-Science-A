/**
 * This class defines a SquareBox object by extending Box4
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

public class SquareBox4 extends Box4
{
  public SquareBox4(int a, int b)
  {
      // call superclass
      super(a, a, b);
  }

  // String to display when object is printed.
  public String toString()
  {
      return "This square box's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
  }
}
