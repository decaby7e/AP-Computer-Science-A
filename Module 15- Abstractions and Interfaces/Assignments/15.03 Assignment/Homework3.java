/**
 * This a parent class that structures the rest of the class homeworks
 *
 * @author Jack Polk
 * @version 03/11/2019
 */

public abstract class Homework3 implements Processing3
{
  public int numPages;
  public String typeOfHomework;

  public Homework3()
  {
    this.numPages = 0;
    this.typeOfHomework = "none";
  }

  public void setNumPages(int numPages){this.numPages = numPages;}

  public int getNumPages(){return numPages;}

  public void doHomework(){};

  public abstract void makeAssignment(int numPages, String typeOfHomework);
}
