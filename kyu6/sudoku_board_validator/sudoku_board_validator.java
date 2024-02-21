import java.util.ArrayList;

public class SudokuValidator 
{

    public static boolean validate(int[][] board) 
    {
          System.out.println("V: " + check_vertical(board) + "..H: " + check_horizontal(board) + "..C: " + check_cube(board));
        if (!check_vertical(board) || !check_horizontal(board) || !check_cube(board))
        {    
          return false;
        }
        return true;
    }
  
    public static boolean check_vertical(int[][] board)
    {
      //Creating variable for every number
      ArrayList<Boolean> numbers = new ArrayList<Boolean>();
      for(int i = 0; i < 9; i++)
      {
        numbers.add(false);
      }
      
      for(int i = 0; i < board.length; i++)
      {
        
        //Setting variables to false
        for(int k = 0; k < 9; k++)
        {
          numbers.set(k, false);
        }
        
        for (int j = 0; j < board[i].length; j++)
        {
          switch (board[j][i])
          {
            case 1:
              if (numbers.get(0))
              {
                return false;
              }
              numbers.set(0, true);
              break;
            case 2:
              if (numbers.get(1))
              {
                return false;
              }
              numbers.set(1, true);
              break;
            case 3:
              if (numbers.get(2))
              {
                return false;
              }
              numbers.set(2, true);
              break;
            case 4:
              if (numbers.get(3))
              {
                return false;
              }
              numbers.set(3, true);
              break;
            case 5:
              if (numbers.get(4))
              {
                return false;
              }
              numbers.set(4, true);
              break;
            case 6:
              if (numbers.get(5))
              {
                return false;
              }
              numbers.set(5, true);
              break;
            case 7:
              if (numbers.get(6))
              {
                return false;
              }
              numbers.set(6, true);
              break;
            case 8:
              if (numbers.get(7))
              {
                return false;
              }
              numbers.set(7, true);
              break;
            case 9:
              if (numbers.get(8))
              {
                return false;
              }
              numbers.set(8, true);
              break;
            default:
              return false;
          }
        }
      }
      return true;
    }
  
    public static boolean check_horizontal(int[][] board)
    {
      //Creating varible for every number
      ArrayList<Boolean> numbers = new ArrayList<Boolean>();
      for(int i = 0; i < 9; i++)
      {
        numbers.add(false);
      }
      
      for(int i = 0; i < board.length; i++)
      {
        
        //Setting variables to false
        for(int k = 0; k < 9; k++)
        {
          numbers.set(k, false);
        }
        
        for (int j = 0; j < board[i].length; j++)
        {
          switch (board[i][j])
          {
            case 1:
              if (numbers.get(0))
              {
                return false;
              }
              numbers.set(0, true);
              break;
            case 2:
              if (numbers.get(1))
              {
                return false;
              }
              numbers.set(1, true);
              break;
            case 3:
              if (numbers.get(2))
              {
                return false;
              }
              numbers.set(2, true);
              break;
            case 4:
              if (numbers.get(3))
              {
                return false;
              }
              numbers.set(3, true);
              break;
            case 5:
              if (numbers.get(4))
              {
                return false;
              }
              numbers.set(4, true);
              break;
            case 6:
              if (numbers.get(5))
              {
                return false;
              }
              numbers.set(5, true);
              break;
            case 7:
              if (numbers.get(6))
              {
                return false;
              }
              numbers.set(6, true);
              break;
            case 8:
              if (numbers.get(7))
              {
                return false;
              }
              numbers.set(7, true);
              break;
            case 9:
              if (numbers.get(8))
              {
                return false;
              }
              numbers.set(8, true);
              break;
            default:
              return false;
          }
        }
      }
      return true;
    }
  
    public static boolean check_cube(int[][] board)
    {
      ArrayList<Boolean> numbers = new ArrayList<Boolean>();
      for (int i = 0; i < 9; i++)
      {
        numbers.add(false);
      }
      
      for (int i = 1; i < board.length - 1; i += 3)
      {
        for (int j = 1; j < board[i].length - 1; j += 3)
        {
          for (int k = 0; k < 9; k++)
          {
            numbers.set(k, false);
          }          
          for (int k = i - 1; k <= i + 1; k++)
          {
            for (int h = j - 1; h <= j + 1; h++)
            {
              switch (board[k][h])
              {
                case 1:
                  if (numbers.get(0))
                  {
                    return false;
                  }
                  numbers.set(0, true);
                  break;
                case 2:
                  if (numbers.get(1))
                  {
                    return false;
                  }
                  numbers.set(1, true);
                  break;
                case 3:
                  if (numbers.get(2))
                  {
                    return false;
                  }
                  numbers.set(2, true);
                  break;
                case 4:
                  if (numbers.get(3))
                  {
                    return false;
                  }
                  numbers.set(3, true);
                  break;
                case 5:
                  if (numbers.get(4))
                  {
                    return false;
                  }
                  numbers.set(4, true);
                  break;
                case 6:
                  if (numbers.get(5))
                  {
                    return false;
                  }
                  numbers.set(5, true);
                  break;
                case 7:
                  if (numbers.get(6))
                  {
                    return false;
                  }
                  numbers.set(6, true);
                  break;
                case 8:
                  if (numbers.get(7))
                  {
                    return false;
                  }
                  numbers.set(7, true);
                  break;
                case 9:
                  if (numbers.get(8))
                  {
                    return false;
                  }
                  numbers.set(8, true);
                  break;
                default:
                  return false;
              }
            }
          }
        }
      }
      return true;
    }
}