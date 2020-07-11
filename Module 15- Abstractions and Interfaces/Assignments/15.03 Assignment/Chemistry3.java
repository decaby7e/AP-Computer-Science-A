/**
 * This is a class for a chemistry course
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

public class Chemistry3 extends Homework3
{
  public Chemistry3()
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
