
 /**
 * This class defines a basic Terrain.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */

public class Mountain extends Terrain
{
    // instance variables
    private int mountCount;

    // Constructor for objects of class Terrain
    public Mountain(int l, int w, int m)
    {
        // initialize instance variables
        super(l, w);

        mountCount = m;
    }

    public String getMountainCount()
    {
        return mountCount + " mountains";
    }
}
