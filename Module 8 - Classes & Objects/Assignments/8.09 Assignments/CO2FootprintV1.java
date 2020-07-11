/**
 * @purpose: This class...
 * It contains mutator methods to calculate...
 * It contains getter methods...
 * Private instance variables include...
 *
 */
public class CO2FootprintV1
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;


    CO2FootprintV1(double gallons)
    {
        myGallonsUsed = gallons;
    }


    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }


    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }


    public double getGallons()
    {
        return myGallonsUsed;
    }


    public double getTonsCO2()
    {
        return myTonsCO2;
    }


    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

