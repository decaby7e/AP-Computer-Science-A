/**
 * This class tests the shape classes located in this directory.
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

import java.util.ArrayList;

public class CircleTester
{
  public static void main(String [] args)
  {
    //Create shapes
    Circle2 circle = new Circle2(0, 0, 1);
    Cylinder2 cylinder = new Cylinder2(5, 6, 3, 10);
    Oval2 oval = new Oval2(0, 0, 3, 4);
    OvalCylinder2 ovlCylinder = new OvalCylinder2(3, 1, 4, 1, 5);

    //Add shapes to ArrayList
    ArrayList<Circle2> shapes = new ArrayList<Circle2>();
    shapes.add(circle);
    shapes.add(cylinder);
    shapes.add(oval);
    shapes.add(ovlCylinder);

    for(Circle2 shape : shapes)
    {
      System.out.println("For this " + shape.getName() + " the " + showCenter(shape));
    }
  }

  public static String showCenter(Circle2 shape)
  {
    return shape.getCenter();
  }
}
