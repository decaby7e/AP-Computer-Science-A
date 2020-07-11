/**
 * Purpose: To sort Movie objects with years, titles, and the studio names
 *
 * @author Jack Polk
 * @version 5/5/2019
 *
 */
public class MovieSorterV3
{
  public static void main(String[] args)
  {
    Movie[] movies = new Movie[10];

    movies[0] = new Movie("Aliens", 1986, "Fox");
    movies[1] = new Movie("Toy Story", 1995, "Pixar");
    movies[2] = new Movie("IT", 2017, "Lin Pictures");
    movies[3] = new Movie("Ghostbusters", 1984, "Columbia");
    movies[4] = new Movie("Die Hard", 1988, "Silver Pictures");
    movies[5] = new Movie("Pulp Fiction", 1994, "Jersey Films");
    movies[6] = new M17ovie("Titanic", 1997, "Paramount");
    movies[7] = new Movie("Interstellar", 2014, "Syncopy");
    movies[8] = new Movie("Inception", 2010, "Legendary Pictures");
    movies[9] = new Movie("Avengers", 2012, "Marvel");

    //Original array of movies
    System.out.println("\n Original Movie List\n");
    displayMovieTable(movies);

    //Sory array in different ways
    System.out.println("\n Sorted by title in ascending order...\n");
    sortByTitle(movies, 1);
    displayMovieTable(movies);

    System.out.println("\n Sorted by title in descending order...\n");
    sortByTitle(movies, 2);
    displayMovieTable(movies);

    System.out.println("\n Sorted by year in ascending order...\n");
    sortByYear(movies, 1);
    displayMovieTable(movies);

    System.out.println("\n Sorted by year in descending order...\n");
    sortByYear(movies, 2);
    displayMovieTable(movies);

    System.out.println("\n Sorted by studio in ascending order...\n");
    sortByStudio(movies, 1);
    displayMovieTable(movies);

    System.out.println("\n Sorted by studio in descending order...\n");
    sortByStudio(movies, 2);
    displayMovieTable(movies);
  }

  //Display methods//

  public static void displayMovieTable(Movie[] arr)
  {
    System.out.println("Movie                 Year         Studio          ");
    System.out.println("===================================================");

    for(Movie movie : arr)
    {
      System.out.printf("%-12s          %-4d        %-20s%n", movie.getTitle(), movie.getYear(), movie.getStudio());
    }
  }

  //Sorting methods//

  public static void sortByTitle(Movie[] arr, int order)
  {
    int i;
    int k;
    int maxPos;
    Movie temp;

    for (i = arr.length - 1; i >= 0; i--)
    {
      //Find largest object in list
      maxPos = 0;
      for (k = 0; k <= i; k++)
      {
          if (arr[k].getTitle().compareTo(arr[maxPos].getTitle()) > 0 && order == 1)
            maxPos = k;
          else if (arr[k].getTitle().compareTo(arr[maxPos].getTitle()) < 0 && order == 2)
            maxPos = k;
      }

      temp = arr[i];
      arr[i] = arr[maxPos];
      arr[maxPos] = temp;
    }

  }

  public static void sortByYear(Movie[] arr, int order)
  {
    int i;
    int k;
    int maxPos;
    Movie temp;

    for (i = arr.length - 1; i >= 0; i--)
    {
      //Find largest object in list
      maxPos = 0;
      for (k = 0; k <= i; k++)
      {
          if (arr[k].getYear() > arr[maxPos].getYear() && order == 1)
            maxPos = k;
          else if(arr[k].getYear() < arr[maxPos].getYear() && order == 2)
            maxPos = k;
      }

      temp = arr[i];
      arr[i] = arr[maxPos];
      arr[maxPos] = temp;
    }

  }

  public static void sortByStudio(Movie[] arr, int order)
  {
    int i;
    int k;
    int maxPos;
    Movie temp;

    for (i = arr.length - 1; i >= 0; i--)
    {
      //Find largest object in list
      maxPos = 0;
      for (k = 0; k <= i; k++)
      {
          if (arr[k].getStudio().compareTo(arr[maxPos].getStudio()) > 0 && order == 1)
              maxPos = k;
          else if (arr[k].getStudio().compareTo(arr[maxPos].getStudio()) < 0 && order == 2)
              maxPos = k;
      }

      temp = arr[i];
      arr[i] = arr[maxPos];
      arr[maxPos] = temp;
    }

  }

}
