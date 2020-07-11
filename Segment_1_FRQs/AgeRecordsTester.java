/**
* @author Jack Polk
* @version 4/29/18
*/
public class AgeRecordsTester
{
  public static void main(String [] args)
  {
      String category = "T";
      int[][] individualAges = { {5, 43, 13, 16, 28},
                                 {43, 15, 35, 10, 21}
                               };
      String[][] ageCategory = { {"C", "A", "T", "T", "Y"},
                                 {"A", "T", "A", "C", "Y"}
                               };

      int k = 0;
      double sum = 0;

      for(int row = 0; row < ageCategory.length; row++)//String[] i : ageCategory
      {
        for(int col = 0; col < ageCategory[row].length; col++)//String cat : i
        {
          if(ageCategory[row][col] == category)
          {
            sum += individualAges[row][col];
            k++;
          }
        }
      }

      if(sum == 0)
      {
        System.out.println("-1.0");
      }
      else
      {
        System.out.println(sum / k);
      }
    }

}
