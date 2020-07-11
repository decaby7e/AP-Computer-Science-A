/**
*
* Purpose: To generate random passwords that are at least 6 characters in length
*          with different variations, all based on user input, and output these
*          passwords to a text file, which is then read back to the user through
*          the terminal.
*
* @author Jack Polk
* @version 2/11/2018
*
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class SecretPasswords
{
  public static void main(String [] args) throws IOException
  {
    //Variable & Object Declaration
    Scanner userInput = new Scanner(System.in);
    Random rand = new Random();
    PrintWriter outFile = new PrintWriter(new File("passwords.txt"));

    int menuOption = 0;
    int passLength = 0;
    int passCount = 0;
    int buffer = 0;
    String password = "";


    //Menu Screen
    System.out.println("");
    System.out.println("Welcome to the Password Generator!");
    System.out.println("");
    System.out.println("1. All lowercase");
    System.out.println("2. All uppercase");
    System.out.println("3. Alphanumeric with lowercase");
    System.out.println("4. Alphanumeric with mixed cases");
    System.out.println("5. Quit");
    System.out.println("");

    while(!(menuOption == 5)){
      menuOption = 0;
      passLength = 0;
      buffer = 0;
      password = "";

      System.out.println("Please Select an option: ");
      menuOption = userInput.nextInt();

      if(menuOption < 5 && menuOption > 0){
        System.out.println("");
        passCount++;

        while(passLength < 6 || passLength == 0){
          System.out.println("Please enter a password length 6 or more characters long: ");
          passLength = userInput.nextInt();

          if(passLength < 6 || passLength == 0){
            System.out.println("");
            System.out.println("Invalid password length. Must be 6 or greater.");
          }

          else{
            System.out.println("");
            System.out.println("Done!");
            System.out.println("There are currently " + passCount + " passwords created.");
            System.out.println("");
          }

        }//End of while
      }//End of if

      else if(menuOption == 5){}

      else{
        System.out.println("");
        System.out.println("Invalid input. Please select a valid option.");
      }

      //Menu Options
      //All Lowercase
      if(menuOption == 1){
        for(int n = 0; n < passLength; n++){
          password += (char)(rand.nextInt(26) + 97);
        }
        outFile.print("Password " + passCount + ": " + password);
        outFile.println();
      }

      //All Uppercase
      else if(menuOption == 2){
        for(int n = 0; n < passLength; n++){
          password += (char)(rand.nextInt(26) + 65);
        }
        outFile.print("Password " + passCount + ": " + password);
        outFile.println();
      }

      //Alphanumeric with Lowercase
      else if(menuOption == 3){
        for(int n = 0; n < passLength; n++){
          buffer = rand.nextInt(74) + 48;
          while(buffer > 57 && buffer < 97){
            buffer = rand.nextInt(74) + 48;
          }
          password += (char)buffer;
        }
        outFile.print("Password " + passCount + ": " + password);
        outFile.println();
      }

      //Alphanumeric with Mixed Cases
      else if (menuOption == 4){
        for(int n = 0; n < passLength; n++){
          buffer = rand.nextInt(74) + 48;
          while((buffer > 57 && buffer < 65) || (buffer > 90 && buffer < 97)){
            buffer = rand.nextInt(74) + 48;
          }
          password += (char)buffer;
        }
      outFile.print("Password " + passCount + ": " + password);
      outFile.println();
      }
    }//End of While Loop
    outFile.close();

    //Output of passwords to terminal
    Scanner passFile = new Scanner(new File("passwords.txt"));

    System.out.println("");
    System.out.println("Thank You For Using The Password Generator!");
    System.out.println("");
    System.out.println("Passwords Generated:");
    reSystem.out.println("");

    for(int i = 0; i < passCount; i++){
      System.out.println("\t" + passFile.nextLine());
    }
    System.out.println("");
    System.out.println("Total Number of Passwords: " + passCount);
    System.out.println("");
 }//end main
}//end class
