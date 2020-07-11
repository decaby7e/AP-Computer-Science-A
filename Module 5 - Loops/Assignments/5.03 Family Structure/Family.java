
/**
 * The purpose of this program is to calculate statistics based on
 * file input about familiy genders
 *
 * @author Jack Polk
 * @version 01/30/18
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    public static void main(String[] args) throws IOException
    {

        //Variable Declarations
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        String token = "";

        int numFamilies = 0;
        int numBB = 0;
        int numGG = 0;
        int numBoth = 0;
        int percentBB = 0;
        int percentGG = 0;
        int percentBoth = 0;

        //Information Gathering
        while( inFile.hasNext() )
        {
            token = inFile.next( );
            numFamilies++;
            if(token.equalsIgnoreCase("BB"))
            {
              numBB++;
            }

            if(token.equalsIgnoreCase("GG"))
            {
              numGG++;
            }

            if(token.equalsIgnoreCase("BG") || token.equalsIgnoreCase("GB"))
            {
              numBoth++;
            }

        }

        //Calculations
        percentBB = (int)((double)numBB / (double)(numFamilies) * 100);
        percentGG = (int)((double)numGG / (double)(numFamilies) * 100);
        percentBoth = (int)((double)numBoth / (double)(numFamilies) * 100);

        //Display
        System.out.println("Statistics for Families in " + fileName);
        System.out.println("\n");
        System.out.println("Total Number of Families: " + numFamilies);
        System.out.println("");
        System.out.println("Gender Statistics:");
        System.out.println("\t2 Boys: " + numBB + " Represents " + percentBB + "%");
        System.out.println("\t2 Girls: " + numGG + " Represents " + percentGG + "%");
        System.out.println("\t1 Boy; 1 Girl: " + numBoth + " Represents " + percentBoth + "%");
        System.out.println("");

        //Closing File
        inFile.close();

    }//end of main method
}//end of class
