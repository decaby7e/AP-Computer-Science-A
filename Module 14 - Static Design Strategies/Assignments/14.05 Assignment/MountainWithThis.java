 /**
 * This class defines a basic Terrain.
 *
 * @author Jack Polk
 * @version 02/17/2019
 */

public class MountainWithThis
{
    // instance variables
    private int mountCount;
    private int length, width;

    // Constructor for objects of class Terrain
    public MountainWithThis(int length, int width, int mountCount)
    {
        // initialize instance variables
        this.length = length;
        this.width = width;
        this.mountCount = mountCount;
    }

    public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }

    public String getMountainCount()
    {
        return mountCount + " mountains";
    }
}
