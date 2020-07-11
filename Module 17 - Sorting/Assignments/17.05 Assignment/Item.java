/**
 * Purpose: Defines an item in my store
 *
 * @author Jack Polk
 * @version 5/15/2019
 *
 */
public class Item
{
  public String name = "";
  public int num, quant = 0;
  public double price = 0.0;

  public Item(String name, int num, double price, int quant)
  {
    this.name = name;
    this.num = num;
    this.price = price;
    this.quant = quant;
  }

  public String toString()
  {
    return "Item " + num + "($" + price + ")" + ": " + name + " has " + quant + " in stock";
  }
}
