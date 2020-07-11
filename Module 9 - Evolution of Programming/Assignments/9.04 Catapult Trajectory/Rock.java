
/**
 * Creates objects called Rock which contain two double variables.
 *
 * @author Jacob Lopez
 * @version 1/6/19
 */
public class Rock
{
   private double degreeAngle, speed, distance;
   
   Rock (double isDegreeAngle, double isSpeed)
   {
       degreeAngle= isDegreeAngle;
       speed= isSpeed;
   }
   
   public void calculateDistance()
   {
       distance = (speed*speed*Math.sin(2*(Math.toRadians(degreeAngle))))/9.8;
   }
   
   public double getDistance()
   {
       return distance;
   }
   
   public double getSpeed()
   {
       return speed;
   }
   
}
