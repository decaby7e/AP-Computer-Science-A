/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given
 * the current exchange rate.
 *
 * @author Jack Polk
 * @version 11/3/17
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		  // starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 18.02;        // 1 US dollar = 18.02 Pesos (11/3/17)
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico

        //remaining variables below here
        double poundsSpent = 314.15;            // Pounds spent
        double poundExchangeRate = 0.73;        // 1 US dollar = 0.73 Pounds (11/3/17)
        double dollarsSpentInUK = 0.0;          // US dollars spent in UK
        double dollarsAfterUK = 0.0;            // US dollars remaining after UK

        //remaining variables below here
        double cadSpent = 512.0;                // CAD Spent
        double cadExchangeRate = 1.22;          // 1 US dollar = 1.22 CAD (11/3/17)
        double dollarsSpentInCanada = 0.0;      // US dollars spent in Canada
        double dollarsAfterCanada = 0.0;        // US dollars remaining after Canada

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversions
        System.out.println("Starting U.S Dollars:            $6500.0");
        System.out.println();

        //Mexico
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        System.out.println("Mexico:");
        System.out.println(" Pesos Spent:                    " + pesosSpent);
        System.out.println(" US Dollars Equivalent:          " + dollarsSpentInMexico);
        System.out.println(" US Dollars Remaining:           " + dollarsAfterMexico);
        System.out.println();

        //UK
        dollarsSpentInUK = poundsSpent / poundExchangeRate;
        dollarsAfterUK = dollarsAfterMexico - dollarsSpentInUK;
        System.out.println("UK:");
        System.out.println(" Pounds Spent:                   " + poundsSpent);
        System.out.println(" US Dollars Equivalent:          " + dollarsSpentInUK);
        System.out.println(" US Dollars Remaining:           " + dollarsAfterUK);
        System.out.println();

        //Canada
        dollarsSpentInCanada = cadSpent / cadExchangeRate;
        dollarsAfterCanada = dollarsAfterUK - dollarsSpentInCanada;
        System.out.println("Canada:");
        System.out.println(" CAD Spent:                      " + cadSpent);
        System.out.println(" US Dollars Equivalent:          " + dollarsSpentInCanada);
        System.out.println(" US Dollars Remaining:           " + dollarsAfterCanada);

        //Remaining USD
        System.out.println("======================================================");
        System.out.println("Remaining US Dollars:            " + dollarsAfterCanada);
        System.out.println();

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 - (totalItems1 * costItem1);  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
    System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 - (totalItems2 * costItem2);  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
