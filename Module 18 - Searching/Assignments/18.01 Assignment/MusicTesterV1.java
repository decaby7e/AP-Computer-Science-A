/**
 * Purpose: Tests the music classes with searches
 *
 * @author Jack Polk
 * @version 5/16/2019
 *
 */
public class MusicTesterV1
{
  public static void main(String[] args)
  {
    Music[] arr = new Music[10];

    arr[0] = new Music("Mobamba", 2017, "Sheck Wes");
    arr[1] = new Music("Sicko Mode", 2018, "Travis Scott");
    arr[2] = new Music("Money", 1973, "Pink Floyd");
    arr[3] = new Music("Time", 1973, "Pink Floyd");
    arr[4] = new Music("Young Lust", 1979, "Pink Floyd");
    arr[5] = new Music("Nonstop", 2018, "Drake");
    arr[6] = new Music("The Duck Song", 2009, "Bryant Oden");
    arr[7] = new Music("Nickelodeon Girls", 2016, "Pink Guy");
    arr[8] = new Music("Baby", 2008, "Justin Beiber");
    arr[9] = new Music("a lot", 2018, "21 Savavge ft. J. Cole");

    //Original table
    displayMusicTable(arr);

    System.out.println(" \nBegin finding\n");

    //Find "Money"
    findByTitle(arr, "Money");

    //Find "FeRrIs WhEeL"
    findByTitle(arr, "FeRrIs WhEeL");

    //Find 1973
    findByYear(arr, 1973);

    //Find 2008
    findByYear(arr, 2008);

    //Find "Pink Floyd"
    findByArtist(arr, "Pink Floyd");

  }

  // Sorting methods //

  public static void findByTitle(Music[] arr, String title)
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

  public static void findByYear(Music[] arr, int year)
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

  public static void findByArtist(Music[] arr, String artist)
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

  // Supplemental methods //

  public static void displayMusicTable(Music[] arr)
  {
    System.out.println("Title     Year     Artist");
    for(int i = 0; i < arr.length; i++)
    {
      System.out.println(arr[i].toString());
    }
  }
}
