
/**
 * This program models flipping an unbiased coin and counting the
 * number of times purpleStones or tails occurs.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Scanner;
public class HeadsOrTailsV2
{
	public static void main(String[] args)
	{
	    // Declare and initialize variables
	    int purpleStones = 0;
	    int yellowStones = 0;
	    int drawCount = 0;
	    int totalDraws = 20;
	    double randNum = 0.0;

	    // Simulate selecting stones
	    while(drawCount < totalDraws)
	    {
	    	//Random value between 0.0 (inclusive) and 1.0 (exclusive)
	        randNum = Math.random();
	        System.out.print(drawCount + "\t" + randNum);

	        if(randNum < 0.4)          //change to < 0.3
	        {
	            purpleStones++;
	            System.out.println("\t Purple Stone");
	        }
	        else
	        {
	            yellowStones++;
	            System.out.println("\t Yellow Stones");
	        }
	        drawCount++;

	    }

	    //Output number of Purple Stones and number of Yellow Stones
	    System.out.println();
	    System.out.println("Number of Purple Stones = " + purpleStones);
	    System.out.println("Number of Yellow Stones = " + yellowStones);
	}
}
