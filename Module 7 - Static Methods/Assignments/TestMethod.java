/**
* @author Jack Polk
* @version 10/23/2017
*/

//System.out.FUNCTIONNAME

public class TestMethod
{
  public static int testMethod(String [] stringArray){
    int min = Integer.MAX_VALUE;
    int index = 0;

    for(int i = 0; i < stringArray.length; i++){

      if(stringArray[i].length() < min){
        min =  stringArray[i].length();
        index = i;
      }

      //else{index = i;}
    }
    return index;
  }

  public static void main(String [] args)
  {
    String [] stringArray = {"gergawef", "wqefqwefqwefb", "fwefea", "sdwq"};
    int min = testMethod(stringArray);
    System.out.println(min);
 }
}
