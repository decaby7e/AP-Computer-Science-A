/**
 * Purpose:  This class defines a Student object
 *
 * @author Jack Polk
 * @version 5/1/2019
 */

public class Student
{
  // instance variables
  private int[] scores;
  private String name;

  // Constructor for objects of class Candidate
  public Student(String name, int[] scores)
  {
    // initialize instance variables
    this.name = name;
    this.scores = scores;
  }

  public String getName()
  {
    return name;
  }

  public int[] getScores()
  {
    return scores;
  }

  public int getScoreFromIndex(int index)
  {
    return scores[index];
  }

  public void setName(String newName)
  {
    name = newName;
  }

  public void setScoreFromIndex(int index, int newScore)
  {
    scores[index] = newScore;
  }

  public String toString()
  {
    String string = String.format("%-11s   ", getName());

    for(int i = 0; i < scores.length; i++)
    {
      string += String.format("%-3d   ", scores[i]);
    }

    return string;
  }
}
