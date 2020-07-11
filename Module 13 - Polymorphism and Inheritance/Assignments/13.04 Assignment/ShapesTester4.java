/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Jack Polk
 * @version 01/24/2019
 */

import java.util.*;
public class ShapesTester4
{
    public static void main(String [] args)
    {
        //Extra variables
        String temp = "";

        //Define shapes
        Rectangle4 rect = new Rectangle4(3, 14);
        Box4 box = new Box4(1, 5, 9);
        Cube4 cube = new Cube4(2);
        SquareBox4 sBox = new SquareBox4(3, 5);
        Kite4 kite = new Kite4(9, 7);

        ArrayList<Rectangle4> rects = new ArrayList<Rectangle4>();
        rects.add(rect);
        rects.add(box);
        rects.add(cube);
        rects.add(sBox);

        //Print shape dimensions
        System.out.println("Shape Dimensions:");
        for(Rectangle4 n : rects)
        {
          showEffectBoth(n);
        }
        System.out.println(kite.toString());//Special Kite case
        System.out.println("");

        //Print equality cases
        System.out.println("Equality Cases: ");
        if(cube.equals(sBox)){temp = "IS";}
        else{temp = "IS NOT";}
        System.out.println("Cube " + cube.toDimensions() + " " + temp + " the same as Square Box " + sBox.toDimensions());

        if(rect.equals(kite)){temp = "IS";}
        else{temp = "IS NOT";}
        System.out.println("Rectangle " + rect.toDimensions() + " " + temp +  " the same as Kite " + kite.toDimensions());
    }

    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}
