/**
 * This class defines a student tester.
 *
 * @author Jack Polk
 * @version 05/26/2019
 */

public class StudentTester2
{
  public static void main(String[] args)
  {
    double[] d1 = {95.3, 23.1, 90.0, 100.0};
    double[] d2 = new double[0];

    Student2 s1 = new Student2("John", "Doe", d1);
    //Student2 s2 = new Student2("", "Doe", d1);
    Student2 s3 = new Student2("Jack", "Smith", d2);

    System.out.println(s1);
    System.out.println(s3);
  }
}
