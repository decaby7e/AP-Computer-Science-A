public class DoubleArrayAdder
{
  public static void main(String [] args)
  {
    double[ ] a1 = new double[5];
    double[ ] a2 = new double[5];
    // Assume that there is code here that prompts the user to enter these 10 double
    // values and stores them in a1 and a2. You don't know what the user will type, but
    // you may assume that the code is correct and no errors occur in this portion of the program.

    // Complete your code below this line
    double [] a3 = new double[5];
    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter 5 values for a1: ");
    for(int i = 0; i < 5; i++)
    {
      a1[i] = userInput.nextDouble();
    }

    System.out.println("Please enter 5 values for a2: ");
    for(int i = 0; i < 5; i++)
    {
      a2[i] = userInput.nextDouble();
    }

    for(int i = 0; i < 5; i++)
    {
      a3[i] = a1[i] + a2[i];
    }

    for(double a : a3)
    {
      System.out.println("a3: " + a);
    }
 }
}
