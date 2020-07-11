/**
 *
 * To calculate the trajectory of a projectile based on launch angles and launch
 * velocities using a matrix of values for the storage of calculated values
 *
 * @author Jack Polk
 * @version 4/19/18
 *
*/

public class CatapultTrajectoryTester
{
  public static void main(String [] args)
  {
    //Object and variable declarations
    int[] speeds = {20, 25, 30, 35, 40, 45, 50};
    int[] degrees = {25, 30, 35, 40, 45, 50};
    double[][] projectilesTable = new double [speeds.length][degrees.length];
    CatapultTrajectory projectile;

    //Assign values to every array position
    for(int i = 0; i < speeds.length; i++)
    {
      for(int j = 0; j < degrees.length; j++)
      {
        projectile = new CatapultTrajectory(speeds[i], degrees[j]);
        projectile.degreesToRadians();
        projectile.mphSpeedTosiSpeed();
        projectile.calculateDistance();
        projectilesTable[i][j] = projectile.getDistanceFt();
        //System.out.println("i: " + i + " j: " + j + " d: " + projectilesTable[i][j]);
      }
    }

    //Display output
    System.out.println("                    Projectile Distance (ft)                    ");
    System.out.println("  MPH   25 deg    30 deg    35 deg    40 deg    45 deg    50 deg");
    System.out.println("================================================================");
    for(int i = 0; i < speeds.length; i++)
    {
      System.out.printf("   %2d ", speeds[i]);
      for(int j = 0; j < degrees.length; j++)
      {
        System.out.printf("  %6.2f  ", projectilesTable[i][j]);
      }
      System.out.println();
    }
  }
}
