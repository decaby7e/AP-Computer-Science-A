/**
 * Annual Weather description: Takes information about the temperatures and
 * precipitation rates of a city and displays that information along with the
 * average temperature and the total ammount of rain.
 *
 * @author Jack Polk
 * @version 2/15/18
 *
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Fort Myers";
        String state = "FL";

        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={64.9,	66.0,	69.9,	73.6,	78.8,	82.2,	83.0,	83.1,	82.1,	77.5,	71.7,	66.4};     //initialize with Fahrenheit values
        double [] precipitation ={2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6};      //initialize with inch values

        String tempLabel = "";
        String precipLabel = "";

        double average = 0.0;
        double average_sum = 0.0;
        double precip_sum = 0.0;
        boolean noError = false;

        //User input for temperature selection
        while(noError == false){

          //Temperature Input
          System.out.println();
          System.out.print("Please select a choice of temperature units (F or C): ");
          tempLabel = in.nextLine();

          //Checking temperature values for correct unit choice
          if(tempLabel.substring(0, 1).equalsIgnoreCase("F")){noError = true;}

          else if(tempLabel.substring(0, 1).equalsIgnoreCase("C")){
            for(int i = 0; i < temperature.length; i++){
              temperature[i] = (temperature[i] - 32.0) * (5.0 / 9.0);
            }
            noError = true;
          }

          else{
            System.out.println();
            System.out.println("Invalid Input! Please try again.");
            noError = false;
          }
        }

        //Precipitation Input
        noError = false;
        while(noError == false){
          System.out.println();
          System.out.print("Please select a choice of length units (In or Cm): ");
          precipLabel = in.nextLine();

          //Checking length units for correct unit choice
          if(precipLabel.substring(0, 1).equalsIgnoreCase("I")){noError = true;}

          else if(precipLabel.substring(0, 1).equalsIgnoreCase("C")){
            for(int i = 0; i < precipitation.length; i++){
              precipitation[i] = precipitation[i] * 2.54;
            }
            noError = true;
          }

          else{
            System.out.println();
            System.out.println("Invalid Input! Please try again.");
            noError = false;
          }
        }

        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
          average_sum += temperature[index];
          precip_sum += precipitation[index];
        }
        average = average_sum / temperature.length;

        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        for( int index = 0; index < temperature.length; index++)
        {
          //System.out.println(month[index] + "" + temperature[index] + "" + precipitation[index]);
          System.out.printf("%-14.3s", month[index]);
          System.out.printf("%.1f", temperature[index]);
          System.out.printf("%21.1f%n", precipitation[index]);

        }
        System.out.println();
        System.out.printf("Average Temperature: %2.1f    Total Rain: %2.1f", average, precip_sum);
        System.out.println();

    }//end main
}//end class
