/**
* @author Jack Polk
* @version 4/23/18
*/
public class DiskDrive
{
     // declare instance variables
     private double myCapacity, size, occupiedSpace = 0;

     // postcondition: all instance variables are initialized
     public DiskDrive(double sizeCapacity, double fileSize)
     {
       size = fileSize;
       myCapacity = sizeCapacity;
     }

     // postcondition: the disk space occupied is increased by the amount given by the
     // parameter and cannot exceed the maximum
     public void addFile(double size)
     {
       if(occupiedSpace + size < myCapacity){occupiedSpace += size;}
     }

     // postcondition: the disk space occupied is decreased by the amount given by the
     // parameter and cannot be negative
     public void deleteFile(double size)
     {
       if(occupiedSpace - size > myCapacity){occupiedSpace -= size;}
     }

     // postcondition: a quantity equal to the unoccupied disk space is provided and is
      // not negative
     public double getFreeSpace()
     {
       return myCapacity - occupiedSpace;
     }
}
