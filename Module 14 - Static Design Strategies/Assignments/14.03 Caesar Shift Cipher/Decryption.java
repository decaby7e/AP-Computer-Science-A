/**
* This class manages the decryption of the message
*
* @author Jack Polk
* @version 02/11/2019
*/

public class Decryption
{
  final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

  public static int shiftNum;

  public Decryption(int n)
  {
    shiftNum = n;
  }

  public static String decryptMessage(String cipherAlphabet, String cipherText)
  {
    char[] plainText = new char[cipherText.length()];

    for(int i = 0; i < cipherText.length(); i++)
    {
      for(int j = 0; j < 26; j++)
      {
        if(cipherText.toLowerCase().charAt(i) == cipherAlphabet.charAt(j))
        {
          plainText[i] = alphabet.charAt(j);
        }

        else if((int)cipherText.toLowerCase().charAt(i) < 97 || (int)cipherText.toLowerCase().charAt(i) > 122)
        {
          plainText[i] = cipherText.charAt(i);
        }
      }
    }

    return new String(plainText);
  }

}
