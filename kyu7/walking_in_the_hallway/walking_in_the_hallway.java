public class Hallway 
{
  public static int contact(String hallway) 
  {
    System.out.println(hallway);
    int hallway_length = hallway.length();
    int steps = 0, result = -1;
    boolean walker = false, stepped = false;
    
    //Looping through String
    for(int i = 0; i < hallway_length; i++)
    {
      if (hallway.charAt(i) == '>')
      {
        walker = true;
        steps = i;
      }
      else if (walker && hallway.charAt(i) == '<')
      {
        walker = false;
        
        //Checking if a disance has already been marked
        if (!stepped)
        {
          result = i - steps;
          stepped = true;
        }
        else
        {          
          result = (result < i - steps) ? result : i - steps;
        }
      }      
    }
    
    //Calculating steps correctly
    if (result != -1)
    {      
      result = (result % 2 == 0) ? result / 2 : (result + 1) / 2;
    }
    return result;
  }
}
