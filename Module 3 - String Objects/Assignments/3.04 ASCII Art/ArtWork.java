/**
 * This program is made to present this image in ASCII art:
 *
 *   _ _ _ _ _ _ _ _
    /               \
   /    |-|   |-|    \
  /     |-|   |-|     \
 |                     |
  \     ---------     /
   \                 /
    \_ _ _ _ _ _ _ _/
 *
 * @author Jack Polk
 * @version 12/3/2017
 */
public class ArtWork
{
  public static void main(String[ ] args)
  {
    String row1 = "    _ _ _ _ _ _ _ _\n";
    String row2 = "   /               \\\n";
    String row3 = "  /    |-|   |-|    \\\n";
    String row4 = " /     |-|   |-|     \\\n";
    String row5 = "|                     |\n";
    String row6 = " \\     ---------     /\n";
    String row7 = "  \\                 /\n";
    String row8 = "   \\_ _ _ _ _ _ _ _/\n";
    String name = "By: Jack Polk ;)\n";

    System.out.print(row1);
    System.out.print(row2);
    System.out.print(row3);
    System.out.print(row4);
    System.out.print(row5);
    System.out.print(row6);
    System.out.print(row7);
    System.out.print(row8);
    System.out.print("\n");
    System.out.print(name);
    System.out.print("\n");

  }
}
