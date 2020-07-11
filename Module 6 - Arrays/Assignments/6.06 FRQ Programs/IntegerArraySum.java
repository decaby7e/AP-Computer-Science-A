public class IntegerArraySum
{
  public static void main(String [] args)
  {
    int [] intArr = {1, 3, 5, 7, 9};
    int sum = 0;

    for(int a : intArr){
      sum += a;
    }

    System.out.println(sum + "Is the sum of the elements of an array containing all odd integers between 0 and 10.");
 }
}
