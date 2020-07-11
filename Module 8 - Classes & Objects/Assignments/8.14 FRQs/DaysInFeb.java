/**
* @author Jack Polk
* @version 4/23/18
*/

public class DaysInFeb
{
  public static int daysInFebruary(int year)
  {
    if(((year%4==0)&&(year%100!=0))||(year%400==0))
    {
      return 29;
    }

    else
    {
      return 28;
    }
  }

  public static void main(String [] args)
  {
    System.out.println(daysInFebruary(1600));
  }
}
