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
    Scanner input = new Scanner(System.in);
    Decryption decipher = new Decryption();

    System.out.print("\nEnter cipherAlphabet: ");
    String cipherAlphabet = input.next();

    System.out.println("\nOriginal Alphabet: " + decipher.alphabet);
    System.out.println("Cipher Alphabet:   " + cipherAlphabet);

    System.out.println("");
    String notPlainText = getTextThatIsNotPlain();

    String plainText = decipher.decryptMessage(cipherAlphabet, notPlainText);

    System.out.println("Ciphertext Message: " + notPlainText);
    System.out.println("Plaintext Message: " + plainText);
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
