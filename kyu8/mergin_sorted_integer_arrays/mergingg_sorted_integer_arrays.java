import java.util.Arrays;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) 
  {
    int i = 0, new_length = first.length + second.length;    
		int [] result = new int[new_length];
    for (i = 0; i < first.length; i++)
    {
      result[i] = first[i];  
    }
    for (int j = 0; i < second.length; j++)
    {
      if(check_duplicate(result, second[j]))
      {
        continue;
      }
      result[i + j] = second[j];
    }
    Arrays.sort(result);
    return result;
	}
  
  public static boolean check_duplicate(int[] array, int num)
  {
    for(int k = 0; k < array.length; k++)
    {
      if (array[k] == num)
      {
        return true;
      }
    }
    return false;
  }
}