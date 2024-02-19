public class Connect4 
{
  
  int[][] board = new int[6][7];
  boolean player1 = true, won = false;
  int n;
	
  public String play(int column) 
  {
    
    //Checking game finished
    if (won)
    {
      return "Game has finished!";
    }
    
    //Playing turn
    for (int i = 5; i >= 0; i--)
    {
      if (board[i][column] == 0)
      {
        board[i][column] = (player1) ? 1 : 2;
        n = board[i][column];
        player1 = switch_player(player1);
        break;
      }

      //If 'for' finishes without a change, return full column
      else if (i == 0)
      {
        return "Column full!";
      }
    }
    
    
    //Checking horizontal
    for (int i = 0; i < board.length; i++)
    {
      for (int j = 0; j < board[i].length - 3; j++)
      {
        if(board[i][j] != 0 && board[i][j] == board[i][j + 1] && board[i][j] == board[i][j + 2] && board[i][j] == board[i][j + 3])
        {
          won = true;
          return "Player " + n + " wins!";
        }
      }
    }
    
    //Checking vertical
    for (int i = 0; i < board.length - 3; i++)
    {
      for (int j = 0; j < board[i].length; j++)
      {
        if(board[i][j] != 0 && board[i][j] == board[i + 1][j] && board[i][j] == board[i + 2][j] && board[i][j] == board[i + 3][j])
        {
          won = true;
          return "Player " + n + " wins!";
        }
      }
    }
    
    //Checking diagonal '\'
    for (int i = 0; i < board.length - 3; i++)
    {
      for (int j = 0; j < board[i].length - 3; j++)
      {
        if(board[i][j] != 0 && board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2] && board[i][j] == board[i + 3][j + 3])
        {
          won = true;
          return "Player " + n + " wins!";
        }
      }
    }
    
    //Checking diagonal '/'
    for (int i = 5; i >= board.length - 3; i--)
    {
      for (int j = 0; j < board[i].length - 3; j++)
      {
        if(board[i][j] != 0 && board[i][j] == board[i - 1][j + 1] && board[i][j] == board[i - 2][j + 2] && board[i][j] == board[i - 3][j + 3])
        {
          won = true;
          return "Player " + n + " wins!";
        }
      }
    }
    
    //No win
    return "Player " + n + " has a turn";
  }
  
  public boolean switch_player(boolean player)
  {
    boolean result = (player) ? false : true;
    return result;
  }
  
}