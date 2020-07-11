/**
 * This tester class implements all the abstract/concrete classes and interfaces
 *
 * @author Jack Polk
 * @version 03/18/2019
*/

import java.util.*;

public class ComputerTester
{
  public static void main(String[] args)
  {
    //Add all computers to ArrayList
    ArrayList<Computer> computers = new ArrayList<Computer>();

    //Laptops
    computers.add(new Laptop("HP Envy", 500));
    computers.add(new Laptop("HP Envy", 1999));

    //SBCs
    computers.add(new RaspberryPi("2B+", 35));
    computers.add(new RaspberryPi("2B+", 10));

    //Processors
    computers.add(new AMDProcessor("Threadripper", 299));
    computers.add(new AMDProcessor("Threadripper", 499));

    //Take inventory
    System.out.println("========== Inventory ==========");
    takeInventory(computers, "HP Envy");
    takeInventory(computers, "2B+");
    takeInventory(computers, "Threadripper");

    //Compare cost of AMD Processor to cost of Threadripper
    System.out.println("\n========== Cost Comparison ==========");
    AMDProcessor ryz5 = new AMDProcessor("Ryzen 5", 200);
    AMDProcessor ryz7 = new AMDProcessor("Ryzen 7", 500);

    if(ryz5.compareTo(ryz7) == -1)
    {
      System.out.println("The Ryzen 5 processor is more expensive with a cost of $" + ryz5.getCost());
    }

    else if(ryz5.compareTo(ryz7) == 1)
    {
      System.out.println("The Ryzen 7 processor is more expensive with a cost of $" + ryz7.getCost());
    }

    else{System.out.println("The two processors cost the same with a cost of $" + ryz5.getCost());}

  }

  public static void takeInventory(ArrayList<Computer> inventory, String productName)
  {
    int numOfProduct = 0;
    double costOfProduct = 0;

    for(Computer computer : inventory)
    {
      if(computer.getName().equals(productName))
      {
        numOfProduct = numOfProduct + 1;
        costOfProduct = costOfProduct + computer.getCost();
      }
    }

    System.out.println("For " + productName + ", " + numOfProduct + " were found, adding up to $" + costOfProduct);
  }
}
