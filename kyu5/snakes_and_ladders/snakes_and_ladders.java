public class SnakesLadders 
{
    int player1 = 0, player2 = 0, n = 1;
    boolean win = false, player = true;
  
    public SnakesLadders() {}
  
    public String play(int die1, int die2) 
    {
        if (win)
        {
          return "Game over!";
        }
      
        //Moving player
        int square = die1 + die2;
        square += (player) ? player1 : player2;
        n = (player) ? 1 : 2;
        //Calculating bounce
        if (square > 100)
        {
          square = 200 - square;
        }
      
        //Checking win
        else if (square == 100)
        {
          win = true;
          return "Player " + n + " Wins!";
        }
        
        //Checking snails and ladders and replacing player position
        square = check_square(square);
        if(player)
        {          
          player1 = square;
        }
        else 
        {
          player2 = square;
        }
        
        
        //Checking doubles
        if (die1 == die2)
        {
          return "Player " + n + " is on square " + square;
        }
        else
        {
          player = (player) ? false : true;
          return "Player " + n + " is on square " + square;
        }
        
    }
  
    public int check_square(int position)
    {
      switch (position)
      {
          case 2:
            return 38;
          case 7:
            return 14;
          case 8:
            return 31;
          case 15:
            return 26;
          case 16:
            return 6;
          case 21:
            return 42;
          case 28:
            return 84;
          case 36:
            return 44;
          case 46:
            return 25;
          case 49:
            return 11;
          case 51:
            return 67;
          case 62:
            return 19;
          case 64:
            return 60;
          case 71:
            return 91;
          case 74:
            return 53;
          case 78:
            return 98;
          case 87:
            return 94;
          case 89:
            return 68;
          case 92:
            return 88;
          case 95:
            return 75;
          case 99:
            return 80;
          default:
            return position;
      }
    }
  
    
}