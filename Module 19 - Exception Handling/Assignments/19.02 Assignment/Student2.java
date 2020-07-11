/**
 * This class defines a student.
 *
 * @author Jack Polk
 * @version 05/26/2019
 */

public class Student2
{
  private String fName, lName, letterGrade, gradeList = "";
  private double[] scores;

  public Student2(String fName, String lName, double[] scores)
  {
    if(fName.length() == 0){throw new RuntimeException("First/last name cannot be empty");}
    else{this.fName = fName;}
    if(lName.length() == 0){throw new RuntimeException("First/last name cannot be empty");}
    else{this.lName = lName;}

    this.scores = scores;
    letterGrade = calcLetterGrade(scores);

    for(int i = 0; i < scores.length; i++){gradeList += scores[i] + " ";}
  }

  private String calcLetterGrade(double[] arr)
  {
    String letterGrade;
    double total = 0.0;
    double len = 0.0;
    double avg = 0.0;

    if(arr.length <= 0){throw new IllegalArgumentException("Score collection size cannot be non-positive");}

    for(int i = 0; i < arr.length; i++){total+=arr[i];}
    avg = total / len;

    if(avg >= 90 && avg <= 100){letterGrade = "A";}
    else if(avg >= 80 && avg < 90){letterGrade = "B";}
    else if(avg >= 70 && avg < 80){letterGrade = "C";}
    else if(avg >= 60 && avg < 70){letterGrade = "D";}
    else{letterGrade = "F";}

    return letterGrade;
  }

  public String toString()
  {
    return fName +" "+ lName + " (" + letterGrade + "): " + gradeList;
  }
}
