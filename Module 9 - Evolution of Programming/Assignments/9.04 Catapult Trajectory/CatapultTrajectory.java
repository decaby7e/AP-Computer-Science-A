/**
 *
 * To calculate the trajectory of a projectile based on launch angles and launch
 * velocities using a matrix of values for the storage of calculated values
 *
 * @author Jack Polk
 * @version 4/19/18
 *
*/

public class CatapultTrajectory
{
  private int myDegree;
  private double mphSpeed, siSpeed, radian, distance, gravity = 9.80665;

  public CatapultTrajectory(double launchSpeed, int degree)
  {
    myDegree = degree;
    mphSpeed = launchSpeed;
  }

  public void degreesToRadians()
  {
    radian = myDegree * (Math.PI / 180);
  }

  public void mphSpeedTosiSpeed()
  {
    siSpeed = (11.0/25.0) * mphSpeed;
  }

  public void calculateDistance()
  {
    distance = (Math.pow(siSpeed, 2) * Math.sin(2 * radian)) / gravity;
  }

  public double getSISpeed()
  {
    return siSpeed;
  }

  public double getMPHSpeed()
  {
    return mphSpeed;
  }

  public double getDistance()
  {
    return distance;
  }

  public double getDistanceFt()
  {
    return distance * 3.281;
  }
}
