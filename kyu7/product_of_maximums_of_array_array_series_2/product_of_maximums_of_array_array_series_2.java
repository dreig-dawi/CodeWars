import java.util.ArrayList;

public class Solution
{
  public static long maxProduct(int[] numbers, int sub_size)
  { 
    int highest = min(numbers);
    int length = numbers.length;
    
    //Solving for no array
    if (length == 0)
    {
      return 0;
    }
    
    int highest_position = max_position(numbers);
    ArrayList<Integer> highests_numbers = new ArrayList<Integer>();
    ArrayList<Integer> positions = new ArrayList<Integer>();
    for(int j = 0; j < sub_size; j++)
    {
      for (int i = 0; i < length; i++)
      {
        if (highest < numbers[i] && !restricted_position(positions, i))
        {
          highest = numbers[i];
          highest_position = i;
        }        
      }
      positions.add(highest_position);
      highests_numbers.add(highest);
      highest = min(numbers);
    }
    
    //Creating and calculating result
    long result = highests_numbers.get(0);
    for (int i = 1; i < highests_numbers.size(); i++)
    {
      result *= highests_numbers.get(i);
    }
    return result;
  }
  
  public static boolean restricted_position(ArrayList<Integer> restricted,int position)
  {
    for (int i = 0; i < restricted.size(); i++)
    {
      if (restricted.get(i) == position)
      {
        return true;
      }
    }
    return false;
  }
  
  public static int min(int[] list)
  {
    int min = list[0];
    for (int i = 0; i < list.length; i++)
    {
      if (min > list[i])
      {
        min = list[i];
      }
    }
    return min;
  }
  
  public static int max_position(int[] list)
  {
    int max = list[0];
    int position = 0;
    for (int i = 1; i < list.length; i++)
    {
      if (max < list[i])
      {
        max = i;
      }
    }
    return max;
  }
}
