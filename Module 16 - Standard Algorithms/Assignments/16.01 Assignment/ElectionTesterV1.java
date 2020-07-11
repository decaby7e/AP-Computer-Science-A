/**
 * Purpose:  This class tests the Candidate class with an array
 *
 * @author Jack Polk
 * @version 4/23/19
 */

public class ElectionTesterV1
{
  public static void main(String[] args)
  {
    Candidate[] candidates = new Candidate[5];

    candidates[0] = new Candidate("John", 35);
    candidates[1] = new Candidate("Jane", 20);
    candidates[2] = new Candidate("Jesus", 50);
    candidates[3] = new Candidate("Pablo", 10);
    candidates[4] = new Candidate("Kjirsten", 53);

    System.out.println();
    getCandidates(candidates);
    System.out.println();
    getCandidateTable(candidates);
  }

  public static void getCandidates(Candidate[] candidates)
  {
    for(int i = 0; i < candidates.length; i++)
    {
      System.out.println(candidates[i].toString());
    }
  }

  public static int getVoteCount(Candidate[] candidates)
  {
    int totalVotes = 0;

    for(int i = 0; i < candidates.length; i++)
    {
      totalVotes += candidates[i].getVotes();
    }

    return totalVotes;
  }

  public static void getCandidateTable(Candidate[] candidates)
  {
    String name = "";
    int votes = 0;
    double percentVote = 0.0;
    int voteTotal = getVoteCount(candidates);

    System.out.println("===== Election Candidates =====");
    System.out.println("Candidate   Votes   Percent of Total");

    for(int i = 0; i < candidates.length; i++)
    {
      name = candidates[i].getName();
      votes = candidates[i].getVotes();
      percentVote = (double)votes / voteTotal * 100;

      System.out.println(name + "   " + votes + "   " + percentVote);
    }

    System.out.println("");
    System.out.println("Total votes: " + voteTotal);
    System.out.println("");
  }
}
