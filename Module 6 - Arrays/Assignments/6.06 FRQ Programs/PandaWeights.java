import java.util.Scanner;
public class PandaWeights
{
  public static double average(double [] array)
  {
    double sum = 0;

    for(double a : array)
    {
      sum += a;
    }
    double average = sum / array.length;
    return average;
  }

  public static double min(double [] array)
  {
    double min = Double.MAX_VALUE;

    for(int i = 0; i < array.length; i++)
    {
        if(array[i] < min)
          min = array[i];
    }
    return min;
  }

  public static double max(double [] array)
  {
    double max = Double.MIN_VALUE;

    for(int i = 0; i < array.length; i++)
    {
      if(array[i] > max)
        max = array[i];
    }
    return max;
  }

  public static void main(String [] args)
  {
    double [] weights = {43.1, 46.7, 29.4, 60.3, 58.3, 49.9, 51.2, 33.9, 37.5, 43.9};
    double min = min(weights);
    double max = max(weights);

    System.out.println("Minimum weight: " + min);
    System.out.println("Maximum weight: " + max);
    System.out.println("Average weight: " + average(weights));

    System.out.print("All weights excluding outliers: ");
    for(int i = 0; i < weights.length; i++)
    {
      if(!(weights[i] == max || weights[i] == min))
      {
        System.out.print(weights[i] + " ");
      }
    }

 }
}
