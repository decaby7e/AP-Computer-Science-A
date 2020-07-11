/**
 * This abstract class represents a computer
 *
 * @author Jack Polk
 * @version 03/18/2019
*/
public abstract class Computer implements Product
{
  private String name;
  private int cost;

  public Computer(String name, int cost)
  {
    this.name = name;
    this.cost = cost;
  }

  public String getName()
  {
    return this.name;
  }

  public int getCost()
  {
    return this.cost;
  }

  public abstract void lock();
  public abstract void underVolt();
}
