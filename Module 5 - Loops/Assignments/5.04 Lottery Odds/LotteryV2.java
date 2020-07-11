/**
 * The Lottery program generates a 3-digit random lottery number ranging
 * from 000 to 999 (inclusive). The user takes a guess and the program
 * provides feedback if the front pair, back pair, all three, or none
 * of the digits match.
 *
 * @author Jack Polk
 * @version 2/1/2018
 */

import java.util.Scanner;
public class LotteryV2
{
    public static void main(String[] args)
    {
        //Object and Variable Declarations
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        int lotNumLength = 3;              //number of digits per lottery number
        String lotteryNum = "";
        String userPick = "";


        //Lottery Draw (3 Random Numbers)
        for(int n = 1; n <= lotNumLength; n++)
        {
            int digit = (int) (Math.random() * 9);  //generate a random integer from 0 to 9 (inclusive)
            lotteryNum += "" + digit;               //concatenate the random digit to the lottery String
            //System.out.println(lotteryNum);         //debug statement; use while testing program
        }

        //User Input
        System.out.println("Enter your " + lotNumLength + " digit lottery number: ");
        userPick = in.next();

        //Error Checking (Input Length)
        if(userPick.length() != lotNumLength)
        {
        	System.out.println("Sorry, your pick did not contain the right number of digits.");
        }

        else
        {
	        //Create Strings with front and back pair digits for easy comparison
	        String lotteryFrontPair = lotteryNum.substring(0, 2);//abc --> ab
	        String lotteryBackPair = lotteryNum.substring(1);//abc --> bc
	        String userFrontPair = userPick.substring(0, 2);//def --> de
	        String userBackPair = userPick.substring(1);//def --> ef

          //Compare the user's guess to the lottery number and report results

	        if(userFrontPair.equals(lotteryFrontPair) && !userPick.equals(lotteryNum))
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, the front pair matched!");
	        }
          else if(userBackPair.equals(lotteryBackPair) && !userPick.equals(lotteryNum))
          {
              System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, the back pair matched!");
           }
	        else if(userPick.equals(lotteryNum))
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tJackpot! Both pairs matched!");
	        }
	        else
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tSorry, no digits match. \n\tThe odds were not in your favor :(");
            }
        }
    } //end main
}//end class Lottery
