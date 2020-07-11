/**
 * This is a class for a calculus course
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

public class Calculus4 extends Homework4
{
  public Calculus4()
  {
    super();
  }

  public void makeAssignment(int numPages, String typeOfHomework)
  {
    this.numPages = numPages;
    this.typeOfHomework = typeOfHomework;
  }

  public String toString()
  {
    return typeOfHomework + " has " + numPages + " pages to be completed.";
  }

  public void doHomework()
  {
    numPages = numPages - (numPages / 2);
  }
}
