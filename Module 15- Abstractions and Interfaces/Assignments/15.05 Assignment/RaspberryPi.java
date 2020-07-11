/**
 * This concrete class represents a SBC
 *
 * @author Jack Polk
 * @version 03/18/2019
*/
public class RaspberryPi extends Computer
{
  private boolean isHeadless;

  public RaspberryPi(String name, int cost)
  {
    super(name, cost);
  }

  public boolean getIsHeadless()
  {
    return isHeadless;
  }

  public void underVolt()
  {
    System.out.println("!!!WARNING!!! INSUFFICIENT POWER SUPPLY");
  }

  public void lock(){}
}
