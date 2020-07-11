/**
 * Purpose:  This class tests the Candidate class with an ArrayList
 *
 * @author Jack Polk
 * @version 4/23/19
 */

import java.util.*;

public class ElectionTesterV2
{
  public static void main(String[] args)
  {
    List<Candidate> candidates = new ArrayList<Candidate>();

    candidates.add(new Candidate("John", 35));
    candidates.add(new Candidate("Jane", 20));
    candidates.add(new Candidate("Jesus", 50));
    candidates.add(new Candidate("Pablo", 10));
    candidates.add(new Candidate("Kjirsten", 53));

    System.out.println();
    getCandidates(candidates);
    System.out.println();
    getCandidateTable(candidates);
  }

  public static void getCandidates(List<Candidate> candidates)
  {
    for(Candidate candidate : candidates)
    {
      System.out.println(candidate.toString());
    }
  }

  public static int getVoteCount(List<Candidate> candidates)
  {
    int totalVotes = 0;

    for(Candidate candidate : candidates)
    {
      totalVotes += candidate.getVotes();
    }

    return totalVotes;
  }

  public static void getCandidateTable(List<Candidate> candidates)
  {
    String name = "";
    int votes = 0;
    double percentVote = 0.0;
    int voteTotal = getVoteCount(candidates);

    System.out.println("===== Election Candidates =====");
    System.out.println("Candidate   Votes   Percent of Total");

    for(Candidate candidate : candidates)
    {
      name = candidate.getName();
      votes = candidate.getVotes();
      percentVote = (double)votes / voteTotal * 100;

      System.out.println(name + "   " + votes + "   " + percentVote);
    }

    System.out.println("");
    System.out.println("Total votes: " + voteTotal);
    System.out.println("");
  }
}
