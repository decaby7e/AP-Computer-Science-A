/**
 * @purpose: The purpose of this program is to approximate pi using the Monte Carlo method
 * through the use of object oriented programming
 *
 * @author Jack Polk
 * @version 4/18/18
 */

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class EstimatePiOOPTester
{
  public static void main(String [] args) throws IOException
  {
    //Variable and Object Declarations
    String[] allTrials;
    int j = 0, sumTests = 0, sumTrials = 0;
    double sumPi = 0;

    PrintWriter allTests = new PrintWriter(new File("tests.txt"));
    ArrayList<EstimatePiOOP> tests = new ArrayList<EstimatePiOOP>();
      tests.add(new EstimatePiOOP(10, 50));
      tests.add(new EstimatePiOOP(100, 40));
      tests.add(new EstimatePiOOP(1000, 60));
      tests.add(new EstimatePiOOP(1250, 30));
      tests.add(new EstimatePiOOP(1500, 70));
      tests.add(new EstimatePiOOP(1750, 20));
      tests.add(new EstimatePiOOP(2000, 90));
      tests.add(new EstimatePiOOP(4000, 150));
      tests.add(new EstimatePiOOP(6000, 200));
      tests.add(new EstimatePiOOP(10000, 15));

    //Run all tests
    for(EstimatePiOOP dataRecord : tests)
    {
      dataRecord.calculatePis();
      dataRecord.averagePi();
      dataRecord.toString();
    }

    //Tests Results Output
    for(EstimatePiOOP dataRecord : tests)
    {
      allTests.println("Test set #" + (j+1));

      for(int i = 0; i < dataRecord.getNumTests(); i++)
      {
        allTests.printf("Trial # %d: %6.5f%n", (i+1), dataRecord.getPiValues()[i]);
      }

      allTests.println();
      j++;
    }
    System.out.println("Test results outputed to tests.txt\n");
    j = 0;

    EstimatePiOOP dataRecord;

    //Output Tables
    System.out.println("|-----------------------------------------------------------------|");
    System.out.println("|                      Pi Estimation Tests                        |");
    System.out.println("| Index | Number of Tests | Number of Trials per Test | Average Pi|");
    System.out.println("|-------|-----------------|---------------------------|-----------|");

    for(int i = 0; i < tests.size(); i++)
    {
      dataRecord = tests.get(i);
      System.out.println(dataRecord.toString(i));
    }
    System.out.println("|-----------------------------------------------------------------|");
//////////////////////////////////////////////////////////////////////////////////////////////////////////
    System.out.println("|                          Statistics                             |");
    System.out.println("| Total Number of Tests | Total Number of Trials | Total Average  |");
    System.out.println("|-----------------------|------------------------|----------------|");

    for(int i = 0; i < tests.size(); i++)
    {
      dataRecord = tests.get(i);
      sumPi += dataRecord.getAveragePi();
      sumTests += dataRecord.getNumTests();
      sumTrials += dataRecord.getNumTrials();
    }

    System.out.printf("|         %d           |        %d           |     %6.5f    |%n", sumTrials, sumTests, (sumPi / tests.size()) );
    System.out.println("|-----------------------------------------------------------------|");

  }
}
