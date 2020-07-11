/**
 * This is a class for a spanish course
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

public class Spanish3 extends Homework3
{
  public Spanish()
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
