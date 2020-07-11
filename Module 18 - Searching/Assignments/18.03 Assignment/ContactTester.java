/**
 * Purpose: To create a contact book and use searching
 *          and sorting with that book
 *
 * @author Jack Polk
 * @version 5/22/2019
 *
 */

import java.util.*;

public class ContactTester
{
  public static void main(String[] args)
  {
    List<Contact> book = new ArrayList<Contact>();

    book.add(new Contact("Tom Smith", "Father", "tomsmith@g.com", "Feb 2", "555-978-2156"));
    book.add(new Contact("Mary Jane", "Mother", "mjane@g.com", "Oct 5", "555-234-1452"));
    book.add(new Contact("John Doe", "Brother", "jdoe@g.com", "Nov 1", "555-685-8502"));
    book.add(new Contact("Betty Fatsnaps", "Sister", "bfat@h.com", "Jan 4", "555-296-4950"));
    book.add(new Contact("Jake Paul", "Friend", "jpaul@yt.com", "Jul 6", "555-299-2384"));
    book.add(new Contact("Felix James", "Mentor", "fjame@g.com", "Jan 23", "555-201-2398"));
    book.add(new Contact("Michael Smith", "Friend", "mdog@g.com", "Mar 21", "555-100-2000"));
    book.add(new Contact("Jack Williams", "Teacher", "jwill@g.com", "Nov 1", "555-619-4200"));
    book.add(new Contact("Tony Stark", "Friend", "tstark@aveng.com", "Sep 23", "555-101-2929"));
    book.add(new Contact("Peter Yvonne", "Friend", "pete@g.com", "May 3", "555-198-1124"));

    System.out.println();
    displayTable(book);
    System.out.println();

    //Lets get the binary searches out of the way...

    insertionSort(book, 0);             //Sort by name (0)
    binarySearch(book, "John Doe", 0);  //Find John
    System.out.println();

    insertionSort(book, 1);           //Now sort by relation (1)
    binarySearch(book, "Friend", 1);  //We have lots of those
    System.out.println();

    //Now its time for the beautiful seq searches :)

    sequentialSearch(book, "Nov 1", 2);  //Find November 1st Birthdays
    System.out.println();

    sequentialSearch(book, "555-619-4200", 3);  //Find 555-619-4200
    System.out.println();

    sequentialSearch(book, "tstark@aveng.com", 4);  //Find tstark@aveng.com
    System.out.println();

  }

  //Type lables for searching and sorting:
  //0 - Name           1 - Relationship
  //2 - Birthday Month 3 - Phone Number
  //4 - Email Address

  // Sorting Methods \\

  public static void insertionSort(List<Contact> arr, int type)
  {
    if(type == 0)
    {
      for(int i = 0 ; i < arr.size() ; i++)
      {
          Contact next = arr.get(i);
          int insertIndex = 0;
          int k = i;
          while( k > 0 && insertIndex == 0 )
          {
              if( next.getName().compareTo(arr.get(k-1).getName()) > 0 )
              {
                  insertIndex = k;
              }
              else
              {
                  arr.set(k, arr.get(k-1));
              }
              k--;
          }
          arr.set(insertIndex, next);
      }
    }

    else if(type == 1)
    {
      for(int i = 0 ; i < arr.size() ; i++)
      {
          Contact next = arr.get(i);
          int insertIndex = 0;
          int k = i;
          while( k > 0 && insertIndex == 0 )
          {
              if( next.getRelation().compareTo(arr.get(k-1).getRelation()) > 0 )
              {
                  insertIndex = k;
              }
              else
              {
                  arr.set(k, arr.get(k-1));
              }
              k--;
          }
          arr.set(insertIndex, next);
      }
    }

    else if(type == 2)
    {
      for(int i = 0 ; i < arr.size() ; i++)
      {
          Contact next = arr.get(i);
          int insertIndex = 0;
          int k = i;
          while( k > 0 && insertIndex == 0 )
          {
              if( next.getBirthday().compareTo(arr.get(k-1).getBirthday()) > 0 )
              {
                  insertIndex = k;
              }
              else
              {
                  arr.set(k, arr.get(k-1));
              }
              k--;
          }
          arr.set(insertIndex, next);
      }
    }

    else if(type == 3)
    {
      for(int i = 0 ; i < arr.size() ; i++)
      {
          Contact next = arr.get(i);
          int insertIndex = 0;
          int k = i;
          while( k > 0 && insertIndex == 0 )
          {
              if( next.getPhone().compareTo(arr.get(k-1).getPhone()) > 0 )
              {
                  insertIndex = k;
              }
              else
              {
                  arr.set(k, arr.get(k-1));
              }
              k--;
          }
          arr.set(insertIndex, next);
      }
    }

    else if(type == 4)
    {
      for(int i = 0 ; i < arr.size() ; i++)
      {
          Contact next = arr.get(i);
          int insertIndex = 0;
          int k = i;
          while( k > 0 && insertIndex == 0 )
          {
              if( next.getEmail().compareTo(arr.get(k-1).getEmail()) > 0 )
              {
                  insertIndex = k;
              }
              else
              {
                  arr.set(k, arr.get(k-1));
              }
              k--;
          }
          arr.set(insertIndex, next);
      }
    }

    else{System.out.println("INCORRECT TYPE PARAMETER!");}
  }

  // Searching Methods \\

  public static void binarySearch(List<Contact> arr, String toFind, int type)
  {
    int high = arr.size();
    int low = -1;
    int probe;

    if(type == 0)
    {
      while( high - low > 1 )
      {
          probe = ( high + low ) / 2;

          if(arr.get(probe).getName().compareTo(toFind) > 0)
              high = probe;
          else
          {
              low = probe;
              if(arr.get(probe).getName().compareTo(toFind) == 0)
              {
                  break;
              }
          }
      }

      if( (low >= 0) && (arr.get(low).getName().compareTo(toFind) == 0 ))
      {
          linearPrintLoc(arr, low, toFind, type);
      }
      else
          System.out.println("NOT found: " + toFind);
    }

    else if(type == 1)
    {
      while( high - low > 1 )
      {
          probe = ( high + low ) / 2;

          if(arr.get(probe).getRelation().compareTo(toFind) > 0)
              high = probe;
          else
          {
              low = probe;
              if(arr.get(probe).getRelation().compareTo(toFind) == 0)
              {
                  break;
              }
          }
      }

      if( (low >= 0) && (arr.get(low).getRelation().compareTo(toFind) == 0 ))
      {
          linearPrintLoc(arr, low, toFind, type);
      }
      else
          System.out.println("NOT found: " + toFind);
    }

    else{System.out.println("INCORRECT TYPE PARAMETER!");}
  }

  public static void sequentialSearch(List<Contact> arr, String toFind, int type)
  {
    int found = -1;
    if(type == 2)
    {
      for(int i = 0; i < arr.size(); i++)
      {
          if(arr.get(i).getBirthday().compareTo(toFind) == 0)
          {
              found = i;
              break;
          }
      }

      if(found != -1)
      {
          System.out.println("We found " + toFind + " in the roster: ");
          System.out.println(arr.get(found));
      }
      else
          System.out.println(toFind + " is not in the roster");
    }

    else if(type == 3)
    {
      for(int i = 0; i < arr.size(); i++)
      {
          if(arr.get(i).getPhone().compareTo(toFind) == 0)
          {
              found = i;
              break;
          }
      }

      if(found != -1)
      {
          System.out.println("We found " + toFind + " in the roster: ");
          System.out.println(arr.get(found));
      }
      else
          System.out.println(toFind + " is not in the roster");
    }

    else if(type == 4)
    {
      for(int i = 0; i < arr.size(); i++)
      {
          if(arr.get(i).getEmail().compareTo(toFind) == 0)
          {
              found = i;
              break;
          }
      }

      if(found != -1)
      {
          System.out.println("We found " + toFind + " in the roster: ");
          System.out.println(arr.get(found));
      }
      else
          System.out.println(toFind + " is not in the roster");
    }

    else{System.out.println("INCORRECT TYPE PARAMETER!");}
  }

  // Supplemental Methods \\

  public static void displayTable(List<Contact> arr)
  {
    System.out.println("  Name          Relation   Bday   Phone Number   Email");
    for(int i = 0; i < arr.size(); i++)
    {
      System.out.println(arr.get(i));
    }
  }

  public static void linearPrintLoc(List<Contact> arr, int low, String toFind, int type)
  {
      int i;
      int start = low;
      int end = low;

      if(type == 0)
      {
        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (arr.get(i).getName().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < arr.size()) && (arr.get(i).getName().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        System.out.println("We found...");
        for(i = start; i <= end; i++)
            System.out.println(arr.get(i));
      }

      else if(type == 1)
      {
        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (arr.get(i).getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < arr.size()) && (arr.get(i).getRelation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        System.out.println("We found...");
        for(i = start; i <= end; i++)
            System.out.println(arr.get(i));
      }

      else{System.out.println("INCORRECT TYPE PARAMETER!");}

  }
}
