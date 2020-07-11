public class CircleStats
{
     private double myRadius;

     public CircleStats(){}

     public double calcCircleArea(int diameter)
     {
       myRadius = (double)(diameter) / 2.0;
       return myRadius * myRadius * 3.141592654;
     }

     public double calcCircleArea(double radius)
     {
       myRadius = radius;
       return myRadius * myRadius * 3.141592654;
     }
}
