
/**
 * Tests objects created with the Rock class and is able to output how far each rock will travel with a given degree and intital speed.
 *
 * @author Jacob Lopez
 * @version 1/6/19
 */
import java.util.ArrayList;
public class RockTester
{
    public static void main(String [] args)
    {
        Rock dataObject;
        double [][] rockstuff = new double [5][6];
        int x = 0;
        
        double [] speeds = new double [5];
        speeds [0] = 25.;
        speeds [1] = 30.;
        speeds [2] = 35.;
        speeds [3] = 40.;
        speeds [4] = 45.;
        
        double [] angles = new double [6];
        angles [0] = 25.;
        angles [1] = 30.;
        angles [2] = 35.;
        angles [3] = 40.;
        angles [4] = 45.; 
        angles [5] = 50.;
        
        ArrayList <Rock> allRocks = new ArrayList <Rock>();
        
        for(double angle:angles)
        {
            for(double speed:speeds)
            {
                allRocks.add(new Rock(angle, speed));
            }
        }
        
        for (Rock Rock: allRocks)
        {
            Rock.calculateDistance();
        }
        
        for(int i=0; i<angles.length; i++)
        {
            for(int a=0; a<speeds.length; a++)
            {
                dataObject = allRocks.get(x);
                double dataValue = dataObject.getDistance();
                rockstuff[a][i]= dataValue;
                x++;
            }
        }
        
        System.out.printf("Projectile Distance (meters)\n");
        System.out.printf("%-8s%-8s%-8s%-8s%-8s%-8s%-8s\n", "M/S", 
        "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
        System.out.printf("=======================================================\n");
        
        x=0;
        
        for(int a=0; a<speeds.length; a++)
        {
            dataObject= allRocks.get(x);
            System.out.printf("%-8.0f", dataObject.getSpeed());
            for(int i=0; i<angles.length; i++)
            {
                System.out.printf("%-8.1f", rockstuff [a][i]);
            }
            System.out.println("");
            x++;
        }
    }
}
