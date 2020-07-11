/**
 * Purpose: Tests the MusicV2 classes with searches
 *
 * @author Jack Polk
 * @version 5/16/2019
 *
 */
public class MusicTesterV2
{
  public static void main(String[] args)
  {
    MusicV2[] arr = new MusicV2[10];

    arr[0] = new MusicV2("Mobamba", 2017, "Sheck Wes");
    arr[1] = new MusicV2("Sicko Mode", 2018, "Travis Scott");
    arr[2] = new MusicV2("Money", 1973, "Pink Floyd");
    arr[3] = new MusicV2("Time", 1973, "Pink Floyd");
    arr[4] = new MusicV2("Young Lust", 1979, "Pink Floyd");
    arr[5] = new MusicV2("Nonstop", 2018, "Drake");
    arr[6] = new MusicV2("The Duck Song", 2009, "Bryant Oden");
    arr[7] = new MusicV2("Nickelodeon Girls", 2016, "Pink Guy");
    arr[8] = new MusicV2("Baby", 2008, "Justin Beiber");
    arr[9] = new MusicV2("A lot", 2018, "21 Savavge ft. J. Cole");

    //Original table
    displayMusicV2Table(arr);

    //Begin finding
    System.out.println(" \nBegin finding\n");

    //TITLE SORT
    sortByTitle(arr);

    //Find "Money"
    findBinaryByTitle(arr, "Money");

    //Find "FeRrIs WhEeL"
    findBinaryByTitle(arr, "FeRrIs WhEeL");

    //YEAR SORT
    sortByYear(arr);

    //Find 1973
    findBinaryByYear(arr, 1973);

    //Find 2008
    findBinaryByYear(arr, 2008);

    //ARTIST SORT
    sortByArtist(arr);

    //Find "Pink Floyd"
    findBinaryByArtist(arr, "Pink Floyd");

    //Find "Bryant Oden"
    findBinaryByArtist(arr, "Bryant Oden");
  }

  // Finding methods //

  public static void findBinaryByTitle(MusicV2[] arr, String toFind)
  {
    int high = arr.length;
    int low = -1;
    int probe;

    while(high - low > 1)
    {
      probe = (high + low) / 2;

      if(arr[probe].getTitle().compareTo(toFind) > 0)
      {
        high = probe;
      }
      else
      {
        low = probe;
      }
    }

    if((low >= 0) && (arr[low].getTitle().compareTo(toFind) == 0))
    {
      System.out.println("We found " + toFind + " in the roster w/ binary search: ");
      System.out.println(arr[low]);
    }
    else
    {
      System.out.println("Not Found.");
    }
  }

  public static void findBinaryByArtist(MusicV2[] arr, String toFind)
  {
    int high = arr.length;
    int low = -1;
    int probe;

    while(high - low > 1)
    {
      probe = (high + low) / 2;

      if(arr[probe].getArtist().compareTo(toFind) > 0)
      {
        high = probe;
      }
      else
      {
        low = probe;
      }
    }

    if((low >= 0) && (arr[low].getArtist().compareTo(toFind) == 0))
    {
      System.out.println("We found " + toFind + " in the roster w/ binary search: ");
      System.out.println(arr[low]);
    }
    else
    {
      System.out.println("Not Found.");
    }
  }

  public static void findBinaryByYear(MusicV2[] arr, int toFind)
  {
    int high = arr.length;
    int low = -1;
    int probe;

    while(high - low > 1)
    {
      probe = (high + low) / 2;

      if(arr[probe].getYear() > toFind)
      {
        high = probe;
      }
      else
      {
        low = probe;
      }
    }

    if((low >= 0) && (arr[low].getYear() == toFind))
    {
      System.out.println("We found " + toFind + " in the roster w/ binary search: ");
      System.out.println(arr[low]);
    }
    else
    {
      System.out.println("Not Found.");
    }
  }




  public static void findByTitle(MusicV2[] arr, String title)
  {
    int found = -1;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i].getTitle().compareTo(title) == 0)
      {
        found = i;
        System.out.println("We found " + title + " in the roster: ");
        System.out.println(arr[found]);
      }
    }
  }

  public static void findByYear(MusicV2[] arr, int year)
  {
    int found = -1;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i].getYear() == year)
      {
        found = i;
        System.out.println("We found " + year + " in the roster: ");
        System.out.println(arr[found]);
      }
    }
  }

  public static void findByArtist(MusicV2[] arr, String artist)
  {
    int found = -1;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i].getArtist().compareTo(artist) == 0)
      {
        System.out.println("We found " + artist + " in the roster: ");
        found = i;
        System.out.println(arr[found]);
      }
    }
  }

  // Sorting methods //

  public static void sortByTitle(MusicV2[] arr)
  {
    for(int i = 0 ; i < arr.length ; i++)
    {
      MusicV2 next = arr[i];
      int insertIndex = 0;
      int k = i;
      while( k > 0 && insertIndex == 0 )
      {
        if(next.getTitle().compareTo(arr[k-1].getTitle()) > 0)
        {
          insertIndex = k;
        }

        else
        {
          arr[k] = arr[k - 1];
        }

        k--;
      }
      arr[insertIndex] = next;
    }
  }

  public static void sortByYear(MusicV2[] arr)
  {
    for(int i = 0 ; i < arr.length ; i++)
    {
        MusicV2 next = arr[i];
        int insertIndex = 0;
        int k = i;
        while( k > 0 && insertIndex == 0 )
        {
          if(next.getYear() > arr[k-1].getYear())
          {
            insertIndex = k;
          }

          else
          {
            arr[k] = arr[k - 1];
          }

          k--;
        }
        arr[insertIndex] = next;
    }
  }

  public static void sortByArtist(MusicV2[] arr)
  {
    for(int i = 0 ; i < arr.length ; i++)
    {
      MusicV2 next = arr[i];
      int insertIndex = 0;
      int k = i;
      while( k > 0 && insertIndex == 0 )
      {
        if(next.getArtist().compareTo(arr[k-1].getArtist()) > 0)
        {
          insertIndex = k;
        }

        else
        {
          arr[k] = arr[k - 1];
        }

        k--;
      }
      arr[insertIndex] = next;
    }
  }

  // Supplemental methods //

  public static void displayMusicV2Table(MusicV2[] arr)
  {
    System.out.println("Title     Year     Artist");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i].toString());
    }
  }
}
