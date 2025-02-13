/*
 * Activity 3.8.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    // Create 2D array of Tile objects with 3 rows and 4 columns
    Tile[][] gameboard = new Tile[3][4];
    
    // Counter to keep track of current position in tileValues array
    int valueIndex = 0;
    
    // Populate gameboard with Tile objects
    for (int row = 0; row < gameboard.length; row++) {
        for (int col = 0; col < gameboard[0].length; col++) {
            gameboard[row][col] = new Tile(tileValues[valueIndex]);
            valueIndex++;
        }
    }
    System.out.println(java.util.Arrays.toString(gameboard[0]));
    System.out.println(java.util.Arrays.toString(gameboard[1]));
    System.out.println(java.util.Arrays.toString(gameboard[2]));
  }
}
