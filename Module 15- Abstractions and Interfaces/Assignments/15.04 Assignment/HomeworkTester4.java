/**
 * This a parent class that tests the homework class
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

import java.util.*;

public class HomeworkTester4
{
  public static void main(String [] args)
  {
    Calculus4 calculus = new Calculus4();
    Chemistry4 chemistry = new Chemistry4();
    Research4 research = new Research4();
    Spanish4 spanish = new Spanish4();

    calculus.makeAssignment(20, "calculus");
    chemistry.makeAssignment(10, "chemistry");
    research.makeAssignment(50, "research");
    spanish.makeAssignment(5, "spanish");

    List<Homework4> classes = new ArrayList<Homework4>();
    classes.add(calculus);
    classes.add(chemistry);
    classes.add(research);
    classes.add(spanish);

    //List To-Do
    System.out.println("===== To-Do =====");
    for(Homework4 n : classes)
    {
      System.out.println(n.toString());
    }
    System.out.println();

    //Compare homework assignments to each other
    System.out.println("===== Homework Comparison =====");

    String compareState;
    int classesLength = classes.size();

    for(int i = 0; i < classesLength; i++)
    {
      Homework4 targetObj = classes.get(i);
      for(int j = classesLength - 1; j >= 0; j--)
      {
        //Find out the state of the compared object
        Homework4 compareObj = classes.get(j);
        if(targetObj.compareTo(compareObj) == 1)
        {
          compareState = "less";
        }

        else if(targetObj.compareTo(compareObj) == -1)
        {
          compareState = "more";
        }

        else{compareState = "the same";}

        //Finally, print out the comparison
        if(compareState != "the same")
        {
          System.out.println(
            targetObj.typeOfHomework + " has "
            + compareState + " than " +
            compareObj.typeOfHomework
          );
        }
      }
      System.out.println();
    }
    System.out.println();

  }

}
