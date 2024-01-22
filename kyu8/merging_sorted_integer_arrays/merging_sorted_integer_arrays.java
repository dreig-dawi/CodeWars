import java.util.Arrays;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) 
  {
    int i = 0, result_length, zeros = 0;
    int total_length = first.length + second.length;
		int[] unsorted_result = new int[total_length], result;
    boolean checked = false;
    
    //Copying the first array into result_unsorted
    for (i = 0; i < first.length; i++)
    {
      unsorted_result[i] = first[i];  
    }
    
    //Copyng the second array into result unsorted
    for (int j = 0; j < second.length; j++)
    {
      
      //Making sure we are not copying an existing number
      if(check_duplicate(unsorted_result, second[j]))
      {
        continue;
      }
      unsorted_result[i + j] = second[j];
    }
    
    for (int n = 0; n < total_length; n++)
    {
      System.out.println(unsorted_result[n]);
    }

    //Checking 0s
    for (int m = 0; m < total_length; m++)
    {
      if (unsorted_result[m] == 0)
      {
        zeros++;
      }
    }
    
    //Creating array result
    result_length = (check_0(unsorted_result, total_length)) ? total_length - zeros : total_length - zeros + 1;
    result = new int[result_length];
    for (int o = 0, p = 0; o < total_length; o++)
    {
      if (check_0(unsorted_result, total_length) && !checked && unsorted_result[o] == 0)
      {
        result[p] = unsorted_result[o];
        p++;
        continue;
      }
      if (checked && unsorted_result[o] == 0)
      {
        continue;
      }
      result[p] = unsorted_result[o];
      p++;
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
        System.out.println("Sale true en k = " + k);
        return true;
      }
    }
    return false;
  }
  
  public static boolean check_0(int[] int_array, int array_length)
  {
    for (int q = 0; q < array_length; q++)
    {
      if (int_array[q] == 0)
      {
        return true;
      }
      return false;
    }
  }
}
