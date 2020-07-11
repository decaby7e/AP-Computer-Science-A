/**
 * This concrete class represents a processor
 *
 * @author Jack Polk
 * @version 03/18/2019
*/
public class AMDProcessor extends Computer implements Comparable<Computer>
{
  private double clockSpeed;

  public AMDProcessor(String name, int cost)
  {
    super(name, cost);
  }

  public void lock()
  {
    System.out.println("Instruction sent to CPU");
  }

  public void underVolt()
  {
    System.out.println("Voltage dropped. Reducing clock speed...");
  }

  public int compareTo(Computer obj)
  {
    if(obj.getCost() < getCost())
    {
      return -1;
    }

    else if(obj.getCost() > getCost())
    {
      return 1;
    }

    else
    {
      return 0;
    }
  }
  
}
