
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *
 * @author Jack Polk
 * @version 10/23/2017
 */
public class CalculationsV5//Double variables are introduced
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

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println("3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println("10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();

        // 2.03 Additional int Equations
        int iNum4 = 76;
        int iNum5 = 5;
        int iNum6 = 13;
        System.out.println("Integer Expression 1");
        System.out.println(iNum5 + " + " + iNum6 + " - " + iNum4 + " = " + (iNum5 + iNum6 - iNum4));
        System.out.println();

        System.out.println("Integer Expression 2");
        System.out.println(iNum6 + " % " + iNum4 + " * " + iNum5 + " = " + (iNum6 % iNum4 * iNum5));
        System.out.println();

        System.out.println("Integer Expression 3");
        System.out.println(iNum5 + " + " + iNum5 + " * " + iNum6 + " = " + (iNum5 + iNum5 * iNum6));
        System.out.println();
        //2.04 Additional double Equations


    } // end of main method
} // end of class
