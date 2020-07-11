/**
 * This class defines a Cube object by extending Box
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

public class Cube4 extends Box4
{
  public Cube4(int a)
  {
      // call superclass
      super(a, a, a);
  }

  // String to display when object is printed.
  public String toString()
  {
      return "This cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
  }
}
