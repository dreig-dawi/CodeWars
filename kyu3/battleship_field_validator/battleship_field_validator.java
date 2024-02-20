public class BattleField 
{
    ArrayList<Integer> restrictions = new ArrayList<Integer>;
  
    public static boolean fieldValidator(int[][] field) 
    {
      boolean battleship = check(field, 4);
      boolean cruiser1 = check(field, 3), cruiser2 = check(field, 3);
      boolean destroyer1 = check(field, 2), destroyer2 = check(field, 3), destroyer3 = check(field, 3);
      boolean submarine1 = check(field, 1), submarine2 = check(field, 1), submarine3 = check(field, 1), submarine4 = check(field, 1);  
      if (!battleship || !cruiser1 || !cruiser2 || !destroyer1 || !destroyer2 || !destroyer3 || !submarine1 || !subamrine2 || !submarine3 || !submarine4)
      {        
        return false;
      }
      return true;
    }
  
    public static boolean check(int[][] board, int size)
    {
      for (int i = 0; i < board.length; i++)
      {
        for (int j = 0; j < board[i].length; j++)
        {
          if (check_vertical(board, size) || check_horizontal(board, size))
          {
            return true;
          }
          return false;
        }
      }
    }
}