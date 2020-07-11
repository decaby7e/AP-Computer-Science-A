/**
 * Purpose:  This class tests the Candidate class with an ArrayList
 *
 * @author Jack Polk
 * @version 4/28/2019
 */

import java.util.*;

public class ElectionTesterV6
{
  public static void main(String[] args)
  {
    List<Candidate> candidates = new ArrayList<Candidate>();

    candidates.add(new Candidate("John", 35));
    candidates.add(new Candidate("Jane", 20));
    candidates.add(new Candidate("Jesus", 50));
    candidates.add(new Candidate("Pablo", 10));
    candidates.add(new Candidate("Kjirsten", 53));

    //Print original info
    System.out.println("\n===== ORIGINAL RESULTS =====\n");
    displayCandidateTable(candidates);

    //Modify original info
    System.out.println("\n======== NEW RESULTS ========\n");

    //Replacement modifications
    replaceName(candidates, "John", "BetterJohn");
    displayCandidateTable(candidates);

    replaceVotes(candidates, "Jane", 270);
    displayCandidateTable(candidates);

    replaceAll(candidates, "Kjirsten", "Thor", 777);
    displayCandidateTable(candidates);

    //Insertion modifications
    newCandidate(candidates, 1, "Bob", 69);
    displayCandidateTable(candidates);

    newPriorCandidate(candidates, "Jane", "James", 420);
    displayCandidateTable(candidates);
  }

  public static void displayCandidates(List<Candidate> candidates)
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

  public static void displayCandidateTable(List<Candidate> candidates)
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

    System.out.println("\nTotal votes: " + voteTotal + "\n");
  }

  public static void replaceName(List<Candidate> candidates, String oldName, String newName)
  {
    System.out.println("\n!!! Changing " + oldName + " to " + newName + "\n");
    for(Candidate candidate : candidates)
    {
      if(candidate.getName() == oldName)
      {
        candidate.setName(newName);
      }
    }
  }

  public static void replaceVotes(List<Candidate> candidates, String name, int newVotes)
  {
    System.out.println("\n!!! Changing " + name + "'s votes to " + newVotes + "\n");
    for(Candidate candidate : candidates)
    {
      if(candidate.getName() == name)
      {
        candidate.setVotes(newVotes);
      }
    }
  }

  public static void replaceAll(List<Candidate> candidates, String oldName, String newName, int newVotes)
  {
    System.out.println("\n!!! Changing " + oldName + " to " + newName + " with a vote count of " + newVotes + "\n");
    for(Candidate candidate : candidates)
    {
      if(candidate.getName() == oldName)
      {
        candidate.setName(newName);
        candidate.setVotes(newVotes);
      }
    }
  }

  public static void newCandidate(List<Candidate> candidates, int arrPos, String name, int votes)
  {
    System.out.println("\n!!! Adding " + name + " at position " + arrPos + " with a vote count of " + votes + "\n");

    candidates.add(arrPos, new Candidate(name, votes));
  }

  public static void newPriorCandidate(List<Candidate> candidates, String tarName, String name, int votes)
  {
    System.out.println("\n!!! Adding " + name + " behind " + tarName + " with a vote count of " + votes + "\n");

    int arrPos = 0;

    for(Candidate candidate : candidates)
    {
      if(candidate.getName().equals(tarName))
      {
        arrPos = candidates.indexOf(candidate);
      }
    }

    newCandidate(candidates, arrPos, name, votes);
  }

}
