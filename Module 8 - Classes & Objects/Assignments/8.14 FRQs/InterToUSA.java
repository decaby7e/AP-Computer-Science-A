/**
* @author Jack Polk
* @version 4/23/18
*/

public class InterToUSA
{
  // precondition: the String value of the time parameter is valid and between
  // 00:00 and 23:59 and has a length of 5 characters.
  public static String convertTime(String worldFormat)
  {
    int firstPart = Integer.parseInt(worldFormat.substring(0, 2));
    int secondPart = Integer.parseInt(worldFormat.substring(3, 5));
    String firstPartString = worldFormat.substring(0, 2);
    String secondPartString = worldFormat.substring(3, 5);
    String usFormat = "";

    if(firstPart < 12 && firstPart >= 0)
    {
      if(firstPart == 0)
      {
        usFormat = "12:" + secondPartString + " AM";
      }

      else
      {
        usFormat = firstPart + ":" + secondPartString + " AM";
      }
    }

    else if(firstPart >= 12 && firstPart <= 24)
    {
        firstPart = firstPart - 12;
        if(firstPart == 0)
        {
          usFormat = "12:" + secondPartString + " PM";
        }
        else
        {
          usFormat = firstPart + ":" + secondPartString + " PM";
        }
    }
    return usFormat;
  }

  public static void main(String [] args)
  {

  }
}
