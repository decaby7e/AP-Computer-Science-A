/**
 * This is a class for a chemistry course
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

public class Chemistry extends Homework
{
  public Chemistry()
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
