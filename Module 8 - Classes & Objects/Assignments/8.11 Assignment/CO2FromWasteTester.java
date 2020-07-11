/**
 * @purpose: Calculates the amount of carbon dioxide produced in a year from
 * waste by a household and compares how recycling can reduce the CO2 footprint.
 *
 * @author Jack Polk
 * @version 4/18/18
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
      ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
          households.add(new CO2FromWaste(5, true, true, false, true));
          households.add(new CO2FromWaste(2, false, false, false, true));
          households.add(new CO2FromWaste(1, true, false, false, true));
          households.add(new CO2FromWaste(3, false, false, false, false));
          households.add(new CO2FromWaste(6, true, true, true, true));
          households.add(new CO2FromWaste(2, false, true, false, true));

      for(CO2FromWaste dataRecord : households)
      {
        dataRecord.calcGrossWasteEmission();
        dataRecord.calcWasteReduction();
        dataRecord.calcNetWasteReduction();
      }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWaste dataRecord;

       for(int index = 0; index < households.size(); index ++)
       {
         dataRecord = households.get(index);
         System.out.printf("|  %2d   |   %2d   |   %5s  |   %5s  |  %5s  |  %5s  |  %-10.2f|  %-10.2f |  %-10.2f|%n",
                            index, dataRecord.getNumPeople(), dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(),
                            dataRecord.getCans(), dataRecord.getEmissions(), dataRecord.getReduction(), dataRecord.getNetEmissions());
       }
   }
}
