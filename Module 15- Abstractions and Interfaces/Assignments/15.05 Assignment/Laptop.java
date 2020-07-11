/**
 * This concrete class represents a Laptop
 *
 * @author Jack Polk
 * @version 03/18/2019
*/
public class Laptop extends Computer
{
  private int batteryCapacity;

  public Laptop(String name, int cost)
  {
    super(name, cost);
  }

  public int getBatteryCapacity()
  {
    return this.batteryCapacity;
  }

  public void lock()
  {
    System.out.println("Computer Locked!");
  }

  public void underVolt(){}
}
