/**
 * Purpose:  This class tests the Candidate class with an array
 *
 * @author Jack Polk
 * @version 5/1/2019
 */

public class ElectionTesterV7
{
  public static void main(String[] args)
  {
    Candidate[] candidates = new Candidate[5];

    candidates[0] = new Candidate("John", 35);
    candidates[1] = new Candidate("Jane", 20);
    candidates[2] = new Candidate("Jesus", 50);
    candidates[3] = new Candidate("Pablo", 10);
    candidates[4] = new Candidate("Kjirsten", 53);

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

  public static void displayCandidateTable(Candidate[] candidates)
  {

    String name = "";
    int votes = 0;
    double percentVote = 0.0;
    int voteTotal = getVoteCount(candidates);

    System.out.println("===== Election Candidates =====");
    System.out.println("Candidate   Votes   Percent of Total");

    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null)
      {
        name = candidates[i].getName();
        votes = candidates[i].getVotes();
        percentVote = (double)votes / voteTotal * 100;

        System.out.println(name + "   " + votes + "   " + percentVote);
      }

      else{System.out.println("No Candidate Found");}
    }

    System.out.println("\nTotal votes: " + voteTotal + "\n");
  }

  public static void displayCandidates(Candidate[] candidates)
  {
    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null){System.out.println(candidates[i].toString());}
    }
  }

  public static int getVoteCount(Candidate[] candidates)
  {
    int totalVotes = 0;

    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null){totalVotes += candidates[i].getVotes();}
    }

    return totalVotes;
  }

  public static void replaceName(Candidate[] candidates, String oldName, String newName)
  {
    System.out.println("\n!!! Changing " + oldName + " to " + newName + "\n");
    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null && candidates[i].getName() == oldName)
      {
        candidates[i].setName(newName);
      }
    }
  }

  public static void replaceVotes(Candidate[] candidates, String name, int newVotes)
  {
    System.out.println("\n!!! Changing " + name + "'s votes to " + newVotes + "\n");
    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null && candidates[i].getName() == name)
      {
        candidates[i].setVotes(newVotes);
      }
    }
  }

  public static void replaceAll(Candidate[] candidates, String oldName, String newName, int newVotes)
  {
    System.out.println("\n!!! Changing " + oldName + " to " + newName + " with a vote count of " + newVotes + "\n");
    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null && candidates[i].getName() == oldName)
      {
        candidates[i].setName(newName);
        candidates[i].setVotes(newVotes);
      }
    }
  }

  public static void newCandidate(Candidate[] candidates, int arrPos, String name, int votes)
  {
    System.out.println("\n!!! Adding " + name + " at position " + arrPos + " with a vote count of " + votes + "\n");

    for(int i = candidates.length - 1; i  > arrPos; i--)
    {
      candidates[i] = candidates[i-1];
    }

    candidates[arrPos] = new Candidate(name, votes);
  }

  public static void newPriorCandidate(Candidate[] candidates, String tarName, String name, int votes)
  {
    System.out.println("\n!!! Adding " + name + " behind " + tarName + " with a vote count of " + votes + "\n");

    int tarPos = 0;

    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null && candidates[i].getName().equals(tarName))
      {
        tarPos = i;
      }
    }

    newCandidate(candidates, tarPos, name, votes);
  }

  public static void deleteCandidateIndex(Candidate[] candidates, int arrPos)
  {
    System.out.println("\n!!! Removing candidate at index " + arrPos + "\n");
    if(candidates[arrPos] != null)
    {
      for(int i = arrPos; i < candidates.length - 1; i++)
      {
        candidates[i] = candidates[i + 1];
      }
    }

    candidates[candidates.length - 1] = null;
  }

  public static void deleteCandidateName(Candidate[] candidates, String candidateName)
  {
    System.out.println("\n!!! Removing candidate " + candidateName + "\n");

    for(int i = 0; i < candidates.length; i++)
    {
      if(candidates[i] != null && candidates[i].getName().equals(candidateName))
      {
        deleteCandidateIndex(candidates, i);
      }
    }
  }


}
