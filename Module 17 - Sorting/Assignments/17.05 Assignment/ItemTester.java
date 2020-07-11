/**
 * Purpose: Tests the item class and sorts it with algorithms
 *
 * @author Jack Polk
 * @version 5/15/2019
 *
 */

import java.util.*;

public class ItemTester
{
  public static void main(String[] args)
  {
    List<Item> items = new ArrayList<Item>();

    items.add(new Item("Bed", 132, 499.99, 50));
    items.add(new Item("Computer", 415, 899.99, 100));
    items.add(new Item("Phone", 253, 1299.99, 102));
    items.add(new Item("Mirror", 324, 29.99, 500));
    items.add(new Item("Brush", 134, 5.99, 5000));
    items.add(new Item("Pencil", 645, 0.99, 50000));
    items.add(new Item("Cup", 234, 1.99, 4200));
    items.add(new Item("Iron", 789, 39.99, 900));
    items.add(new Item("Razor", 647, 12.99, 6000));
    items.add(new Item("Statue", 902, 10000.79, 5));

    System.out.println("\n* Original items *\n");
    displayItemTable(items);

    //Begin sorting

    System.out.println("\n* Merge sort by number*\n");
    sortMergeByNum(items, 0, items.size() - 1);
    displayItemTable(items);

    System.out.println("\n* Selection sort by price*\n");
    sortSelectionByPrice(items);
    displayItemTable(items);

    System.out.println("\n* Insertion sort *\n");
    sortInsertionByName(items);
    displayItemTable(items);
  }

  // Sorting methods //

  public static void sortMergeByNum(List<Item> items, int low, int high)
  {
    if( low == high )
      return;

    int mid = (low + high) / 2;

    sortMergeByNum(items, low, mid);       // recursive call
    sortMergeByNum(items, mid + 1, high);   // recursive call

    merge(items, low, mid, high, 2);
  }

  public static void sortSelectionByPrice(List<Item> arr)
  {
    int i;
    int k;
    int maxPos;
    Item temp;

    for (i = arr.size() - 1; i >= 0; i--)
    {
      //Find largest object in list
      maxPos = 0;
      for (k = 0; k <= i; k++)
      {
          if (arr.get(k).price > arr.get(maxPos).price)
            maxPos = k;
      }

      temp = arr.get(i);
      arr.set(i, arr.get(maxPos));
      arr.set(maxPos, temp);
    }
  }

  public static void sortInsertionByName(List<Item> arr)
  {
    for(Item item : arr)
    {
        Item next = item;
        int insertIndex = 0;
        int k = arr.indexOf(item);
        while( k > 0 && insertIndex == 0 )
        {
          if(next.name.compareTo(arr.get(k-1).name) > 0)
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

  // Supplementary Methods //

  public static void displayItemTable(List<Item> items)
  {
    System.out.println("Item          Number      Cost           Quantity");
    System.out.println("=================================================");

    for(Item item : items)
    {
      System.out.printf("%-12s  %-4d        $%-12s  %-4d%n", item.name, item.num, item.price, item.quant);
    }
  }

  public static void merge(List<Item> arr, int low, int mid, int high, int type)
  {
      List<Item> temp = new ArrayList<Item>();
      for(int i = 0; i < high - low + 1; i++)
        temp.add(new Item("NONE", 0, 0.0, 0));

      int i = low, j = mid + 1, n = 0;

      while(i <= mid || j <= high)
      {
          if(i > mid)
          {
              temp.set(n, arr.get(j));
              j++;
          }
          else if(j > high)
          {
              temp.set(n, arr.get(i));
              i++;
          }

          else if(arr.get(i).num < arr.get(j).num)
          {
              temp.set(n, arr.get(i));
              i++;
          }

          else
          {
              temp.set(n, arr.get(j));
              j++;
          }
          n++;
      }

      for( int k = low ; k <= high ; k++ )
          arr.set(k, temp.get(k - low));
  }

}
