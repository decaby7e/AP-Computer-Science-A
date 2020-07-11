/**
* This class tests the Encryption class
*
* @author Jack Polk
* @version 02/11/2019
*/

import java.util.Scanner;

public class CaesarTester
{
  public static void main(String[] args)
  {
    boolean quit = false;

    int shiftKeyValue = getShiftKey();

    Encryption cipher = new Encryption(shiftKeyValue);
    Decryption decipher = new Decryption(shiftKeyValue);

    String cipherAlphabet = cipher.genCipherAlphabet();

    System.out.println("\nOriginal Alphabet: " + cipher.alphabet);
    System.out.println("Cipher Alphabet:   " + cipherAlphabet);

    Scanner input = new Scanner(System.in);
    while(!quit)
    {
      System.out.println("\nEncrypt or decrypt? (e/d) (\"q\" to exit): ");

      String option = input.nextLine().toLowerCase();

      if(option.equals("q")){quit = true;}

      else if(option.equals("e"))
      {
        System.out.println("");
        String plainText = getPlainText();

        String cipherText = cipher.encryptMessage(cipherAlphabet, plainText);


        System.out.println("Plaintext Message: " + plainText);
        System.out.println("Ciphertext Message: " + cipherText);
      }

      else if(option.equals("d"))
      {
        System.out.println("");
        String notPlainText = getTextThatIsNotPlain();

        String plainText = decipher.decryptMessage(cipherAlphabet, notPlainText);


        System.out.println("Ciphertext Message: " + notPlainText);
        System.out.println("Plaintext Message: " + plainText);
      }

      else{System.out.println("\nInvalid choice");}
    }
  }

  public static int getShiftKey()
  {
    Scanner input = new Scanner(System.in);

    boolean valid = false;
    int shiftKeyValue = 0;

    while(!valid)
    {
      System.out.print("Please enter your desired shift-key value (0-25): ");
      shiftKeyValue = input.nextInt();

      if(!(shiftKeyValue < 0 || shiftKeyValue > 25)){valid = true;}
    }

    return shiftKeyValue;
  }

  public static String getPlainText()
  {
    Scanner input = new Scanner(System.in);
    String plainText;

    System.out.print("Please enter your string to be encrypted: ");
    plainText = input.nextLine();

    return plainText;
  }

  public static String getTextThatIsNotPlain()
  {
    Scanner input = new Scanner(System.in);
    String notPlainText;

    System.out.print("Please enter your string to be decrypted: ");
    notPlainText = input.nextLine();

    return notPlainText;
  }

}
