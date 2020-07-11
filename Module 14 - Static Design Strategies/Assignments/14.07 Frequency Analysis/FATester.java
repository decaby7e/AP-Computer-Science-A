/**
* This is the tester class of a letter frequency analyzer
*
* @author Jack Polk
* @version 02/22/2019
*/

import java.util.*;
import java.io.File;
import java.io.IOException;

public class FATester
{
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) throws IOException
  {
    String fileName = getFileName();
    
    FrequencyAnalyzer freqAnalysis = new FrequencyAnalyzer(fileName);

    freqAnalysis.calcLetterFreqs();

    freqAnalysis.displayLetterFreqs();

    freqAnalysis.writeLFsToFile();
  }

  public static String getFileName()
  {
    System.out.print("Please enter the name of the plaintext text file (without .txt): ");
    String fileName = in.next();

    return fileName;
  }
}
