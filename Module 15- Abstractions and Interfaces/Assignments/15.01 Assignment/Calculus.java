/**
 * This is a class for a calculus course
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

public class Calculus extends Homework
{
  public Calculus()
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
}
