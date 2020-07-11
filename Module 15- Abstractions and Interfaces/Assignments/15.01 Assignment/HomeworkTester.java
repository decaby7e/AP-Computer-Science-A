/**
 * This a parent class that tests the homework class
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

import java.util.ArrayList;

public class HomeworkTester
{
  public static void main(String [] args)
  {
    Calculus calculus = new Calculus();
    Chemistry chemistry = new Chemistry();
    Research research = new Research();
    Spanish spanish = new Spanish();

    calculus.makeAssignment(20, "calculus");
    chemistry.makeAssignment(10, "chemistry");
    research.makeAssignment(50, "research");
    spanish.makeAssignment(5, "spanish");

    ArrayList<Homework> classes = new ArrayList<Homework>();
    classes.add(calculus);
    classes.add(chemistry);
    classes.add(research);
    classes.add(spanish);

    for(Homework n : classes)
    {
      System.out.println(n.toString());
    }
  }

}
