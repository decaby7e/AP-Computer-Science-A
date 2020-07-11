import java.util.Scanner;
public class RectangleSimilarity
{
  public static void main(String [] args)
  {
    Scanner userInput = new Scanner(System.in);
    int rect1L = 0;
    int rect1W = 0;
    int rect2L = 0;
    int rect2W = 0;
    double lRatio = 0;
    double wRatio = 0;

    System.out.println("Please enter the length of rectangle 1: ");
    rect1L = userInput.nextInt();
    System.out.println("Please enter the width of rectangle 1: ");
    rect1W = userInput.nextInt();
    System.out.println("Please enter the length of rectangle 2: ");
    rect2L = userInput.nextInt();
    System.out.println("Please enter the width of rectangle 2: ");
    rect2W = userInput.nextInt();

    lRatio = (double)rect1L / (double)rect2L;
    wRatio = (double)rect1W / (double)rect2W;

    if(lRatio == wRatio)
    {
      System.out.println("With a length ratio of " + lRatio + " and a width ratio of " + wRatio
                          + ", the rectangles are similar.");
    }
    else
    {
      System.out.println("With a length ratio of " + lRatio + " and a width ratio of " + wRatio
                          + ", the rectangles are not similar.");
    }
 }
}
