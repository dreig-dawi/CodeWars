import java.util.ArrayList;

public class Kata 
{
  public static int[] arrayDiff(int[] a, int[] b) 
  {    
    ArrayList<Integer> result_list = new ArrayList<Integer>();
    boolean exists = false;
    
    //Adding non-restricted numbers to result_list
    for (int i = 0; i < a.length; i++)
    {
      exists = false;
      for (int j = 0; j < b.length; j++)
      {
        if (a[i] == b[j])
        {
          exists = true;
          break;
        }
      }
      if (!exists)
      {
        result_list.add(a[i]);
      }
    }
    
    //Creating result from result_list
    int[] result = new int[result_list.size()];
    for (int i = 0; i < result.length; i++)
    {
      result[i] = result_list.get(i);
    }
    return result;
    
  }
}