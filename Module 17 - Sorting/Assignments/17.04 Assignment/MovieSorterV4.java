/**
 * Purpose: To sort Movie objects with years, titles, and the studio names
 *
 * @author Jack Polk
 * @version 5/5/2019
 *
 */
public class MovieSorterV4
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
    System.out.println("\n Sorted by title in ascending order...\n");
    sortByTitle(movies, 0, movies.length - 1);
    displayMovieTable(movies);

    System.out.println("\n Sorted by year in ascending order...\n");
    sortByYear(movies, 0, movies.length - 1);
    displayMovieTable(movies);

    System.out.println("\n Sorted by studio in ascending order...\n");
    sortByStudio(movies, 0, movies.length - 1);
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


  public static void sortByTitle(Movie[] arr, int low, int high)
  {
    if( low == high )
      return;

    int mid = (low + high) / 2;

    sortByTitle(arr, low, mid);       // recursive call
    sortByTitle(arr, mid + 1, high);   // recursive call

    merge(arr, low, mid, high, 1);
  }

  public static void sortByYear(Movie[] arr, int low, int high)
  {
    if( low == high )
      return;

    int mid = (low + high) / 2;

    sortByYear(arr, low, mid);       // recursive call
    sortByYear(arr, mid + 1, high);   // recursive call

    merge(arr, low, mid, high, 2);
  }

  public static void sortByStudio(Movie[] arr, int low, int high)
  {
    if( low == high )
      return;

    int mid = (low + high) / 2;

    sortByStudio(arr, low, mid);       // recursive call
    sortByStudio(arr, mid + 1, high);   // recursive call

    merge(arr, low, mid, high);
  }


  // Supplementary Methods //


  public static void merge(Movie[] arr, int low, int mid, int high)
  {
      Movie[] temp = new Movie[high - low + 1];

      int i = low, j = mid + 1, n = 0;

      while(i <= mid || j <= high)
      {
          if(i > mid)
          {
              temp[n] = arr[j];
              j++;
          }
          else if(j > high)
          {
              temp[n] = arr[i];
              i++;
          }
          else if(arr[i].getTitle().compareTo(arr[j].getTitle()) < 0  && type == 1)
          {
              temp[n] = arr[i];
              i++;
          }
          else if(arr[i].getYear() < arr[j].getYear() && type == 2)
          {
              temp[n] = arr[i];
              i++;
          }
          else if(arr[i].getStudio().compareTo(arr[j].getStudio()) < 0 && type == 3)
          {
              temp[n] = arr[i];
              i++;
          }
          else
          {
              temp[n] = arr[j];
              j++;
          }
          n++;
      }

      for( int k = low ; k <= high ; k++ )
          arr[k] = temp[k - low];
  }

}
