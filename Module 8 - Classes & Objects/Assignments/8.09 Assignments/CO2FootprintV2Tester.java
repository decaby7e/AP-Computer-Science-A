/**
 * @author Jack Polk
 * @version 4/16/18
 * @purpose: To test the class CO2FootprintV2
 *
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        double gallonsOfGas = 2410; //How many gallons of petrol have been used

        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas); //New CO2FootprintV2 object with input parameter gallonsOfGas
        footprint.calcTonsCO2(); //Calculates how much CO2 is made in tons
        footprint.convertTonsToPounds(); //Converts ammout of CO2 from tons to lbs

        //Display output
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        //Prints the ammount of gas, in gallons, and the ammount of CO2, in pounds and tons
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}
