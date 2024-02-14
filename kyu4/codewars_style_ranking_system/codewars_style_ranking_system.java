class User
{
  int rank = -8;
  int progress = 0;
  
  public void incProgress(int act_rank)
  { 
    
    //Checking errors
    if (act_rank == 0 || act_rank > 8 || act_rank < -8)
    {
      throw new IllegalArgumentException("Rank out of bounds");
    }
    
    //Calculating rank
    if (act_rank == rank)
    {
      progress += 3;
    }
    else if (act_rank == rank - 1 || (act_rank == -1 && rank == 1))
    {
      progress++;
    }
    else if (act_rank > rank)
    {
      int d = act_rank - rank;
      if (act_rank > 0 && rank < 0)
      {
        d--;
      }
      progress += 10 * d * d;
    }
    
    //Calculating progress
    while (progress >= 100)
    {
      rank++;
      if (rank == 0)
      {
        rank++;
      }
      progress -= 100;
    }
    
    //Max rank
    if (rank == 8)
    {
      progress = 0;
    }
  }
}
