/**
 * @purpose:
 *
 */
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        double gallonsOfGas = 2410;

        CO2FootprintV1 footprint = new CO2FootprintV1(gallonsOfGas);
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}

