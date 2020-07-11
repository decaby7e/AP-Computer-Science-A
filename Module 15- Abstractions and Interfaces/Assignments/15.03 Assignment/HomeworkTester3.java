/**
 * This a parent class that tests the homework class
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

import java.util.ArrayList;

public class HomeworkTester3
{
  public static void main(String [] args)
  {
    Calculus3 calculus = new Calculus3();
    Chemistry3 chemistry = new Chemistry3();
    Research3 research = new Research3();
    Spanish3 spanish = new Spanish3();

    calculus.makeAssignment(20, "calculus");
    chemistry.makeAssignment(10, "chemistry");
    research.makeAssignment(50, "research");
    spanish.makeAssignment(5, "spanish");

    ArrayList<Homework> classes = new ArrayList<Homework>();
    classes.add(calculus);
    classes.add(chemistry);
    classes.add(research);
    classes.add(spanish);

    //List To-Do
    System.out.println("===== To-Do =====");
    for(Homework3 n : classes)
    {
      System.out.println(n.toString());
    }
    System.out.println();

    //Complete homework partially...
    for(Homework3 n : classes)
    {
      n.doHomework();
    }

    //List completed
    System.out.println("===== After Working... =====");
    for(Homework3 n : classes)
    {
      System.out.println(n.toString());
    }
    System.out.println();
  }

}
