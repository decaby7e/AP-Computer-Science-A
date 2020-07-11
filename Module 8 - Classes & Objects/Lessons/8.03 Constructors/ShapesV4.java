/**
 * The purpose of this program is to calculate the hypotenuse
 * of a triangle and its area. All calculations are done within
 * methods. An object is instantiated and all methods are invoked
 * on the object.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class ShapesV4
{
    //default constructor
    public ShapesV4()
    {
    }

    //calculate area of a triangle
    public double calcTriArea(int s1, int s2)
    {
        return s1 * s2 * 0.5;
    }
    //calculate the hypotenuse of a right triangle
    public double calcHypotenuse(int s1, int s2)
    {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }

    //Calculates the area of a rectangle
    public double calcAreaRectangle(int w, int l)
    {
      return w * l;
    }

    //Calculates the perimeter of a rectangle
    public int calcRectPerimeter(int w, int l)
    {
      return w * 2 + l * 2;
    }

    //Calculates the circumference of a circle
    public double calcCircumference(int r)
    {
      return Math.PI * 2 * r;
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, rectPerimeter, radius;
        double triArea, hypotenuse, rectArea, circleCircum;

        //initialization of variables
        side1 = 10;
        side2 = 5;
        radius = 1;
        triArea = 0;
        hypotenuse = 0;

        ShapesV4 shapes = new ShapesV4();

        //call methods
        triArea = shapes.calcTriArea(side1, side2);
        hypotenuse = shapes.calcHypotenuse(side1, side2);
        rectArea = shapes.calcAreaRectangle(side1, side2);
        rectPerimeter = shapes.calcRectPerimeter(side1, side2);
        circleCircum = shapes.calcCircumference(radius);

        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf(" Hypotenuse = %8.2f%n", hypotenuse);
        System.out.printf(" Rectangle Area = %8.2f%n", rectArea);
        System.out.printf(" Rectangle Perimeter = %8d%n", rectPerimeter);
        System.out.printf(" Circumference = %8.2f%n", circleCircum);
    }//end main method
}//end class
