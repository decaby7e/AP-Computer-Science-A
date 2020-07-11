
/**
 * Purpose: To effectively perform addition, subtraction, multiplication,
 * division, and modulus operations on integers and decimals, which are
 * stored in variables who's names correlate to their data type, and display
 * the output of these operations in a user-friendly manner.
 *
 * @author Jack Polk
 * @version 10/25/2017
 */
public class CalculationsV6//Double variables are fully implemented into the program
{
    public static void main(String[ ] args)
    {
        //Integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;

        //Double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();

        // 2.03 Additional int Equations
        int iNum4 = 76;
        int iNum5 = 5;
        int iNum6 = 13;

        System.out.println("Integer Expressions");
        System.out.println(iNum5 + " + " + iNum6 + " - " + iNum4 + " = " + (iNum5 + iNum6 - iNum4));
        System.out.println(iNum6 + " % " + iNum4 + " * " + iNum5 + " = " + (iNum6 % iNum4 * iNum5));
        System.out.println(iNum5 + " / " + iNum5 + " * " + iNum6 + " = " + (iNum5 / iNum5 * iNum6));
        System.out.println();

        //2.04 Additional double Equations
        double dNum4 = 6.32;
        double dNum5 = 5.92;
        double dNum6 = 12.4;

        System.out.println("Double Expressions");
        System.out.println(dNum4 + " / " + dNum6 + " + " + dNum5 + " = " + (dNum4 / dNum6 + dNum5));
        System.out.println(dNum4 + " % " + dNum3 + " - " + dNum6 + " = " + (dNum4 % dNum3 - dNum6));
        System.out.println(dNum5 + " * " + dNum2 + " + " + dNum1 + " = " + (dNum5 * dNum2 + dNum1));
        System.out.println();
    } // end of main method
} // end of class
