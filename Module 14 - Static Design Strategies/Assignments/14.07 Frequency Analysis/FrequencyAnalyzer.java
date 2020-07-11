/**
* This is the implementation class of a letter frequency analyzer
*
* @author Jack Polk
* @version 02/22/2019
*/

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FrequencyAnalyzer
{
  private File file;
  private String fileName;
  private int[] letterFreqs = new int[26];

  public FrequencyAnalyzer(String fileName)
  {
    this.fileName = fileName;
    file = new File((fileName+".txt"));
  }

  public void calcLetterFreqs() throws IOException
  {
    Scanner inFile = new Scanner(file);
    String currentString;
    int currentChar;

    while(inFile.hasNext()){
      currentString = inFile.nextLine();

      for(int i = 0; i < currentString.length(); i++){
        currentChar = (int)currentString.charAt(i);

        if(currentChar >= 65 && currentChar <= 90){
          letterFreqs[currentChar - 65] = letterFreqs[currentChar - 65] + 1;
        }

        else if(currentChar >= 97 && currentChar <= 122){
          letterFreqs[currentChar - 97] = letterFreqs[currentChar - 97] + 1;
        }
      }//end for
    }//end while
  }

  public void displayLetterFreqs()
  {
    for(int i = 0; i < 26; i++){
      System.out.println("Number of times "+(char)(i+65)+" was found: " + letterFreqs[i]);
    }
  }

  public void writeLFsToFile() throws IOException
  {
    PrintWriter outFile = new PrintWriter(new File(fileName + "Freq.txt"));
    for(int i = 0; i < 26; i++){
      outFile.println("Number of times "+(char)(i+65)+" was found: " + letterFreqs[i]);
    }
    outFile.close();
    System.out.println("Results saved to " + fileName + "Freq.txt");
  }


}
