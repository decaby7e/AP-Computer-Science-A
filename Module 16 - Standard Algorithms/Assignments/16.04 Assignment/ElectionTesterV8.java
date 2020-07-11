/**
 * Purpose:  This class tests the Candidate class with an ArrayList
 *
 * @author Jack Polk
 * @version 5/1/2019
 */

import java.util.*;

public class ElectionTesterV8
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

    //Deletion modifications
    deleteCandidateName(candidates, "BetterJohn");
    displayCandidateTable(candidates);

    deleteCandidateIndex(candidates, 3);
    displayCandidateTable(candidates);
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
      if(candidate != null)
      {
        name = candidate.getName();
        votes = candidate.getVotes();
        percentVote = (double)votes / voteTotal * 100;

        System.out.println(name + "   " + votes + "   " + percentVote);
      }

      else{System.out.println("No Candidate Found");}
    }

    System.out.println("\nTotal votes: " + voteTotal + "\n");
  }

  public static void displayCandidates(List<Candidate> candidates)
  {
    for(Candidate candidate : candidates)
    {
      if(candidate != null){System.out.println(candidate.toString());}
    }
  }

  public static int getVoteCount(List<Candidate> candidates)
  {
    int totalVotes = 0;

    for(Candidate candidate : candidates)
    {
      if(candidate != null){totalVotes += candidate.getVotes();}
    }

    return totalVotes;
  }

  public static void replaceName(List<Candidate> candidates, String oldName, String newName)
  {
    System.out.println("\n!!! Changing " + oldName + " to " + newName + "\n");

    for(Candidate candidate : candidates)
    {
      if(candidate != null && candidate.getName() == oldName)
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
      if(candidate != null && candidate.getName() == name)
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
      if(candidate != null && candidate.getName() == oldName)
      {
        candidate.setName(newName);
        candidate.setVotes(newVotes);
      }
    }
  }

  public static void newCandidate(List<Candidate> candidates, int arrPos, String name, int votes)
  {
    System.out.println("\n!!! Adding " + name + " at position " + arrPos + " with a vote count of " + votes + "\n");

    for(int i = candidates.size() - 1; i  > arrPos; i--)
    {
      candidates.set(i, candidates.get(i-1));
    }

    candidates.set(arrPos, new Candidate(name, votes));
  }

  public static void newPriorCandidate(List<Candidate> candidates, String tarName, String name, int votes)
  {
    System.out.println("\n!!! Adding " + name + " behind " + tarName + " with a vote count of " + votes + "\n");

    int tarPos = 0;

    for(Candidate candidate : candidates)
    {
      if(candidate != null && candidate.getName().equals(tarName))
      {
        tarPos = candidates.indexOf(candidate);
      }
    }

    newCandidate(candidates, tarPos, name, votes);
  }

  public static void deleteCandidateIndex(List<Candidate> candidates, int arrPos)
  {
    System.out.println("\n!!! Removing candidate at index " + arrPos + "\n");
    if(candidates.get(arrPos) != null)
    {
      for(int i = arrPos; i < candidates.size() - 1; i++)
      {
        candidates.set(i, candidates.get(i+1));
      }
    }

    candidates.set(candidates.size() - 1, null);
  }

  public static void deleteCandidateName(List<Candidate> candidates, String candidateName)
  {
    System.out.println("\n!!! Removing candidate " + candidateName + "\n");

    for(Candidate candidate : candidates)
    {
      if(candidate != null && candidate.getName().equals(candidateName))
      {
        deleteCandidateIndex(candidates, candidates.indexOf(candidate));
      }
    }
  }


}
