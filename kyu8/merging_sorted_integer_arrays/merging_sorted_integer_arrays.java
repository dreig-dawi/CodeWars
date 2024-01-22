import java.util.Arrays;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) 
  {
    int i = 0, total_length = first.length + second.length, result_length = 0;   
		int[] result_unsorted = new int[total_length];
    for (i = 0; i < first.length; i++)
    {
      result_unsorted[i] = first[i];  
    }
    for (int j = 0; i < second.length; j++)
    {
      if(check_duplicate(result_unsorted, second[j]))
      {
        continue;
      }
      result_unsorted[i + j] = second[j];
    }
    for (int l = 0; l < total_length; l++)
    {
      if (result_unsorted[l] == 0)
      {
        result_length = l;
      }
    }
    int[] result = new int[result_length];
    for (int m = 0; m < result_length; m++)
    {
      result[m] = result_unsorted[m];
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
