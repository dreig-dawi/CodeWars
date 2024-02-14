public class MazeRunner 
{
  public static String walk(int[][] maze, String[] directions) 
  {
    for (int i = 0; i < maze.length; i++)
    {
      for (int j = 0; j < maze[i].length; j++)
      {
        System.out.print(maze[i][j]);
      }
      System.out.println();
    }
    for (int i = 0; i < directions.length; i++)
    {System.out.print(directions[i]);}
    System.out.println();
    
    //Find start
    int x = 0, y = 0;
    for (int i = 0; i < maze.length; i++)
    {
      for (int j = 0; j < maze[i].length; j++)
      {
        if (maze[i][j] == 2)
        {
          x = i;
          y = j;
          break;
        }
      }
    }
    
    for (int i = 0; i < directions.length; i++)
    {
      //Moving
      switch (directions[i])
      {
        case "N":
          x--;
          break;
        case "E":
          y++;
          break;
        case "S":
          x++;
          break;
        case "W":
          y--;
       }
      
      //Checking out of bounds
      if (x < 0 || y < 0 || x >= maze.length || y >= maze[x].length)
      {
        return "Dead";
      }
      
      //Checking position
      switch (maze[x][y])
      {
          case 3:
            return "Finish";
          case 1:
            return "Dead";
      }
      
    }
    return "Lost";
  }
  
}