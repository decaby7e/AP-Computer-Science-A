
 /**
 * This class defines a basic Terrain.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */

public class WinterMountain extends Mountain
{
    // instance variables
    private int temp;

    // Constructor for objects of class Terrain
    public WinterMountain(int l, int w, int m, int t)
    {
        // initialize instance variables
        super(l, w, m);

        temp = t;
    }

    public String getTemp()
    {
        return temp + " degrees";
    }
}
