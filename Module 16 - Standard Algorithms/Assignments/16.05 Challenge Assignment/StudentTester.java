/**
 * Purpose: This class implements the student object
 *
 * @author Jack Polk
 * @version 5/1/2019
 */

public class StudentTester
{
  public static void main(String[] args)
  {
    //Create a collection of 12 students
    String[] studentNames = {"Tom S.", "Jerry S.", "Bill A.", "Linda J.", "John P.",
                             "Jesus R.", "Pablo R.", "Kjirsten G.", "Bob A.",
                             "Jack P.", "Garry L.", "Jim Z."};
    int[][] studentScores =
    {
      {50, 90, 90, 100, 20}, {100, 100, 100, 100, 99},
      {70, 80, 69, 70, 90}, {10, 20, 30, 40, 50},
      {52, 87, 45, 96, 32}, {54, 87, 98, 63, 24},
      {72, 85, 94, 56, 52}, {54, 58, 71, 66, 32},
      {89, 21, 78, 65, 87}, {45, 98, 87, 32, 54},
      {26, 84, 85, 14, 89}, {12, 78, 90, 74, 95}
    };

    Student[] students = new Student[studentNames.length];
    for(int i = 0; i < 12; i++){
      students[i] = new Student(studentNames[i], studentScores[i]);
    }

    //Test all methods and show changes with a table after each one
    displayStudentTable(students);

    System.out.println("\n Renaming Tom S. as Tim S... \n");
    replaceName(students, "Tom S.", "Tim S.");
    displayStudentTable(students);

    System.out.println("\n Replacing Quiz 5 of Jerry S. with a 101% \n");
    replaceQuiz(students, "Jerry S.", 4, 101);
    displayStudentTable(students);

    System.out.println("\n Replacing Bill A. with Phill Y... \n");
    replaceStudent(students, "Bill A.", "Phill Y.", new int[] {25, 67, 32, 99, 80});
    displayStudentTable(students);

    System.out.println("\n Adding student Paul S. after Linda J... \n");
    newStudent(students, "Linda J.", "Paul S.", new int[] {55, 55, 67, 89, 100});
    displayStudentTable(students);

    System.out.println("\n Removing Jack P... \n");
    removeStudent(students, "Jack P.");
    displayStudentTable(students);
  }

  //Display a table of all students and their test scores
  public static void displayStudentTable(Student[] arr)
  {
    System.out.println("Name          Q1    Q2    Q3    Q4    Q5");
    System.out.println("========================================");
    for(int i = 0; i < arr.length; i++)
    {
      if(!isNull(arr[i])){System.out.println(arr[i].toString());}
    }
  }

  //Replace a student with a new one based on old and new names
  public static void replaceName(Student[] arr, String oldName, String newName)
  {
    int i = indexOfName(arr, oldName);
    arr[i].setName(newName);
  }

  //Replace a student's quiz score based on name and old quiz index
  public static void replaceQuiz(Student[] arr, String name, int quizPos, int newQuiz)
  {
    int i = indexOfName(arr, name);
    arr[i].setScoreFromIndex(quizPos, newQuiz);
  }

  //Replace a student completely based on old name with new name and scores
  public static void replaceStudent(Student[] arr, String oldName, String newName, int[] newScores)
  {
    int i = indexOfName(arr, oldName);
    arr[i] = new Student(newName, newScores);
  }

  //Insert a new student into the array after a existing student
  public static void newStudent(Student[] arr, String oldName, String newName, int[] newScores)
  {
    int oldIndex = indexOfName(arr, oldName);

    for(int i = arr.length - 1; i > oldIndex; i--)
    {
      arr[i] = arr[i-1];
    }

    arr[oldIndex + 1] = new Student(newName, newScores);
  }

  //Remove a student from the class
  public static void removeStudent(Student[] arr, String name)
  {
    int i = indexOfName(arr, name);
    arr[i] = null;
  }

  //SUPPLEMENTARY METHODS

  //Return index of name from array
  public static int indexOfName(Student[] arr, String name)
  {
    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i].getName() == name){return i;}
    }

    return -1;
  }

  public static boolean isNull(Student obj)
  {
    if(obj == null){return true;}
    return false;
  }

}
