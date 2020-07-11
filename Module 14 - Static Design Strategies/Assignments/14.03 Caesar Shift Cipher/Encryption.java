/**
* This class manages the encryption of the message
*
* @author Jack Polk
* @version 02/11/2019
*/

public class Encryption
{
  final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

  public static int shiftNum;

  public Encryption(int n)
  {
    shiftNum = n;
  }

  public static String genCipherAlphabet()
  {
    char[] cipherAlphabet = new char[26];

    for(int i = 0; i < 26; i++)
    {
      if((shiftNum + i) < 26)
      {
        cipherAlphabet[i + shiftNum] = alphabet.charAt(i);
      }

      else
      {
        cipherAlphabet[i-(26-shiftNum)] = alphabet.charAt(i);
      }

    }
    return new String(cipherAlphabet);
  }

  public static String encryptMessage(String cipherAlphabet, String plainText)
  {
    char[] cipherText = new char[plainText.length()];

    for(int i = 0; i < plainText.length(); i++)
    {
      for(int j = 0; j < 26; j++)
      {
        if(plainText.toLowerCase().charAt(i) == alphabet.charAt(j))
        {
          cipherText[i] = cipherAlphabet.charAt(j);
        }

        else if((int)plainText.toLowerCase().charAt(i) < 97 || (int)plainText.toLowerCase().charAt(i) > 122)
        {
          cipherText[i] = plainText.charAt(i);
        }
      }
    }

    return new String(cipherText);
  }

}
