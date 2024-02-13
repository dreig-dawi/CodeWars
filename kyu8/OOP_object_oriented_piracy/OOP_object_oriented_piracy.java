public class Ship 
{
  private final double draft;
  private final int crew;
    
  public Ship(double draft, int crew) 
  {
    this.draft = draft;
    this.crew = crew;
  }

  public boolean isWorthIt()
  {
    boolean result = (draft - (1.5 * crew) > 20) ? true : false;
    return result;
  }
} 