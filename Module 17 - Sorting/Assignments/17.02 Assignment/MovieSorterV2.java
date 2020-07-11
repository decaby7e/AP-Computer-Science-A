/**
 * Purpose: To sort Movie objects with years, titles, and the studio names
 *
 * @author Jack Polk
 * @version 5/2/2019
 *
 */
public class MovieSorterV2
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
    movies[6] = new Movie("Titanic", 1997, "Paramount");
    movies[7] = new Movie("Interstellar", 2014, "Syncopy");
    movies[8] = new Movie("Inception", 2010, "Legendary Pictures");
    movies[9] = new Movie("Avengers", 2012, "Marvel");

    //Original array of movies
    System.out.println("\n Original Movie List\n");
    displayMovieTable(movies);

    //Sory array in different ways
    System.out.println("\n Sorted by title in descending order...\n");
    displayMovieTable(sortByTitle(movies, 2));

    System.out.println("\n Sorted by year in ascending order...\n");
    displayMovieTable(sortByYear(movies, 1));

    System.out.println("\n Sorted by studio in ascending order...\n");
    displayMovieTable(sortByStudio(movies, 1));
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

  public static Movie[] sortByTitle(Movie[] arr, int order)
  {
    Movie[] newArr = new Movie[arr.length];

    for(int i = 0 ; i < arr.length ; i++)
    {
      Movie next = arr[i];
      int insertIndex = 0;
      int k = i;
      while( k > 0 && insertIndex == 0 )
      {
        if(order == 1)
        {
          if(next.getTitle().compareTo(newArr[k-1].getTitle()) > 0)
          {
            insertIndex = k;
          }

          else
          {
            newArr[k] = newArr[k - 1];
          }
        }

        else if(order == 2)
        {
          if(next.getTitle().compareTo(newArr[k-1].getTitle()) < 0)
          {
            insertIndex = k;
          }

          else
          {
            newArr[k] = newArr[k - 1];
          }
        }

        k--;
      }

      newArr[insertIndex] = next;
    }

    return newArr;
  }

  public static Movie[] sortByYear(Movie[] arr, int order)
  {
    Movie[] newArr = new Movie[arr.length];

    for(int i = 0 ; i < arr.length ; i++)
    {
        Movie next = arr[i];
        int insertIndex = 0;
        int k = i;
        while( k > 0 && insertIndex == 0 )
        {
          if(order == 1)
          {
            if(next.getYear() > newArr[k-1].getYear())
            {
              insertIndex = k;
            }

            else
            {
              newArr[k] = newArr[k - 1];
            }
          }

          else if(order == 2)
          {
            if(next.getYear() < newArr[k-1].getYear())
            {
              insertIndex = k;
            }

            else
            {
              newArr[k] = newArr[k - 1];
            }
          }

          k--;
        }

        newArr[insertIndex] = next;

    }

    return newArr;
  }

  public static Movie[] sortByStudio(Movie[] arr, int order)
  {
    Movie[] newArr = new Movie[arr.length];

    for(int i = 0 ; i < arr.length ; i++)
    {
        Movie next = arr[i];
        int insertIndex = 0;
        int k = i;
        while( k > 0 && insertIndex == 0 )
        {
          if(order == 1)
          {
            if(next.getStudio().compareTo(newArr[k-1].getStudio()) > 0)
            {
              insertIndex = k;
            }

            else
            {
              newArr[k] = newArr[k - 1];
            }
          }

          else if(order == 2)
          {
            if(next.getStudio().compareTo(newArr[k-1].getStudio()) < 0)
            {
              insertIndex = k;
            }

            else
            {
              newArr[k] = newArr[k - 1];
            }
          }


          k--;
        }

        newArr[insertIndex] = next;

    }

    return newArr;
  }

}
