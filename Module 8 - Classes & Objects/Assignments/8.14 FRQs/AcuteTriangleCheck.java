/**
* @author Jack Polk
* @version 4/23/18
*/
public class AcuteTriangleCheck
{
  // precondition: the three sides make a triangle
  public static boolean isAcute(int side1, int side2, int side3)
  {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int[] numArray = {side1, side2, side3};
    int middle = 0;

    for(int i = 0; i < numArray.length; i++)
    {
      if(numArray[i] < min){min = numArray[i];}
      else if(numArray[i] > max){max = numArray[i];}
      else{numArray[i] = middle;}
    }

    if((max * max) < (min * min) + (middle * middle)){return true;}
    else{return false;}
  }

  public static void main(String [] args)
  {
    System.out.println(isAcute(6, 5, 4));
  }
}
