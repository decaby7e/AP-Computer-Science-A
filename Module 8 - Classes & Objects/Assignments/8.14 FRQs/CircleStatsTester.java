public class CircleStatsTester
{
     public static void main(String[] args)
     {
         int diameter = 5;
         double radius = 2.5;
         CircleStats cStats = new CircleStats();

         System.out.println("The area = " + cStats.calcCircleArea(diameter));
         System.out.println("The area = " + cStats.calcCircleArea(radius));

     }
}
