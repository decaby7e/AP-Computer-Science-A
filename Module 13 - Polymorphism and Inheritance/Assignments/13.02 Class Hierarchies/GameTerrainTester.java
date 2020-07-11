/**
* This class defines a basic Terrain.
*
* @author (enter your name)
* @version (enter today's date)
*/

public class GameTerrainTester
{
  public static void main(String []args)
  {
    //Class initializations
    Terrain n1 = new Terrain(256, 256);
    Mountain n2 = new Mountain(512, 512, 60);
    WinterMountain n3 = new WinterMountain(320, 640, 61, 30);
    Forest n4 = new Forest(400, 400, 1000);

    //Outputs
    System.out.println(n1.getTerrainSize());
    System.out.println("Mountain " + n2.getTerrainSize() + " and has " + n2.getMountainCount());
    System.out.println("Winter Mountain " + n3.getTerrainSize() + " and has "
                        + n3.getMountainCount() + " and its temperature is " + n3.getTemp());
    System.out.println("Forest " + n4.getTerrainSize() + " and has " + n4.getTreeCount());

  }

}
