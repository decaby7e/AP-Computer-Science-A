public class AgeRecords
{
      private int[][] individualAges;
      private String[][] ageCategory;

      // constructors not shown

      // postcondition: returns −1.0 if category does not appear in ageCategory
      // otherwise, returns the average of all individualAges with corresponding
      // ageCategory values that are equal to the parameter category.
      public double categoryAverage(String category)
      {
        int k = 0;
        double sum = 0;

        for(int row = 0; row < ageCategory.length; row++)
        {
          for(int col = 0; col < ageCategory[row].length; col++)
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
          return -1.0;
        }
        else
        {
          return sum / k;
        }
      }

      // other methods not shown

}
