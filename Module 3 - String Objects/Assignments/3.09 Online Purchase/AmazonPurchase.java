/**
 * This program inputs customer data about a purchase and outputs
 * a layout of that data to reflect a purchase receipt
 * @author Jack Polk
 * @version 1/12/2018
 */

//System.out.print("");

import java.util.Scanner;
public class AmazonPurchase
{
    public static void main(String[ ] args)
    {
      //Local variable declaration
      String nameFirst;
      String nameFirstInitial;
      String nameLast;
      String name;
      String date;
      String date2;
      String itemName;
      String itemPrice;
      double itemPDouble;
      String itemQuantity;
      int itemQInt;
      String cardNumber;
      String cardNumber2;
      String pin;
      String orderNumber;
      double total;

      //construct a Scanner object with one line
      Scanner in = new Scanner(System.in);

      //Input
      System.out.println("Welcome Valued Customer!");
      System.out.print("Please enter your first and last name as spelled on your card: ");
      nameFirst = in.next();
      nameLast = in.nextLine();
      System.out.print("Enter today's date (mm/dd/yyyy): ");
      date = in.nextLine();

      System.out.print("Item name: ");
      itemName = in.nextLine();
      System.out.print("Item price: $");
      itemPrice = in.nextLine();
      System.out.print("Item quantity: ");
      itemQuantity = in.nextLine();


      System.out.println("");
      System.out.println("Here at Amazon Inc., we insure that your data is in safe hands,");
      System.out.println("and use SSL encryption to verify the security of all purchases.");
      System.out.println("");
      System.out.print("Enter your debit card number (#####-###-####): ");
      cardNumber = in.nextLine();
      System.out.print("Enter your PIN (####): ");
      pin = in.next();

      //Calculations/Formatting
      nameFirstInitial = nameFirst.substring(0,1);
      name = nameFirstInitial + "." + nameLast;
      date2 = date.replace("/", "-");
      itemPDouble = Double.parseDouble(itemPrice);
      itemQInt = Integer.parseInt(itemQuantity);
      orderNumber = nameFirstInitial + (Integer.parseInt(pin) / 3) + date.substring(8, 10) + (int)(Double.parseDouble(itemPrice) / 2) + itemQuantity;
      cardNumber2 = "#####-###-" + cardNumber.substring(10,14);
      total = itemPDouble * itemQInt;

      //Output
      System.out.println("");
      System.out.println("Thank you for your purchase!");
      System.out.println("");
      System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("Your E-Receipt");
      System.out.println("");
      System.out.println(date2);
      System.out.println("Order number: " + orderNumber);
      System.out.println("");
      System.out.println("  " + name);
      System.out.println("  Account: " + cardNumber2);
      System.out.println("  Item name: " + itemName);
      System.out.println("  Item quantity: " + itemQuantity);
      System.out.println("  Item price: $" + itemPrice);
      System.out.println("");
      System.out.println("  $" + total + " will be debited to your account.");
      System.out.println("");
      System.out.println("Thank you for your purchase!");
      System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
      System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }//End of main method
}//End of class
