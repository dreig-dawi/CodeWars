public class Solution 
{
    static int winner;
  
    public static int isSolved(int[][] board) 
    {
        if (check_win(board))
        {
          return winner;
        }
        if (unfinished(board))
        {
          return -1;
        }
        
        //Draw
        return 0;
    }
  
    public static boolean check_win(int[][] board)
    {
      if (check_horizontal(board) || check_vertical(board) || check_diagonal(board) || check_Idiagonal(board))
      {
        return true;
      }
      return false;
    }
  
    public static boolean check_horizontal(int[][] board)
    {
      int num;
      for (int i = 0; i < board.length; i++)
      {
        num = board[i][0];
        for (int j = 0; j < board[i].length; j++)
        {
          if (num == 0 || board[i][j] != num)
          {
            break;
          }
          if (j == board[i].length - 1)
          {
            winner = num;
            return true;
          }
        }
      }
      return false;
    }
  
    public static boolean check_vertical(int[][] board)
    {
      int num;
      for (int i = 0; i < board.length; i++)
      {
        num = board[0][i];
        for (int j = 0; j < board[i].length; j++)
        {
          if (num == 0 || board[j][i] != num)
          {
            break;
          }
          if (j == board[i].length - 1)
          {
            winner = num;
            return true;
          }
        }
      }
      return false;
    }
  
    public static boolean check_diagonal(int[][] board)
    {
      int num = board[0][0];
      if (num == 0)
      {
        return false;
      }
      for (int i = 0; i < board.length; i++)
      {
        if (board[i][i] != num)
        {
          return false;
        }
        if (i == board.length - 1)
        {
          winner = num;
          return true;
        }
      }
      return false;
    }
  
    public static boolean check_Idiagonal(int[][] board)
    {
      int num = board[0][board[0].length - 1];
      if (num == 0)
      {
        return false;
      }
      for (int i = 0, j = board[i].length - 1; i < board.length || j >= 0; i++, j--)
      { 
          if (board[i][j] != num)
          {
            return false;
          }
          if (j == 0)
          {
            winner = num;
            return true;
          }
      }
      return false;
    }
  
    public static boolean unfinished(int[][] board)
    {
      for (int i = 0; i < board.length; i++)
      {
        for (int j = 0; j < board[i].length; j++)
        {
          if (board[i][j] == 0)
          {
            return true;
          }
        }
      }
      return false;
    }
}