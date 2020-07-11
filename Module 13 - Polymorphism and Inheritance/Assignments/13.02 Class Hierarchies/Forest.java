
 /**
 * This class defines a basic Terrain.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */

public class Forest extends Terrain
{
    // instance variables
    private int treeCount;

    // Constructor for objects of class Terrain
    public Forest(int l, int w, int n)
    {
        // initialize instance variables
        super(l, w);

        treeCount = n;
    }

    public String getTreeCount()
    {
        return treeCount + " trees";
    }
}
