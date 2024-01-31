public class FindIndexOfSubArray 
{
    private int[] arr;
    public FindIndexOfSubArray(int[] arr) 
    {
        this.arr = arr;
    }

    public int[] findIndexOfSubArray()
    {
      //Checking if the first part fo the array si sorted
      int first = 3;
      
      int[] result = new int[2];
      
      //Check 
      if (arr.length < 4)
      {
        return result;
      }
      
      boolean checked = false, ascending = check_ascending(arr, first), descending = check_descending(arr, first);
      //Calculation subarray start position
      if (ascending)
      {
        for (int i = 1; i < arr.length; i++)
        {
          if (arr[i] < arr[i - 1] && !checked)
          {
            result[0] = i - 1;
            checked = true;
          }
          else if (arr[i] >= arr[i - 1] && checked)
          {
            result[1] = i;
          }
        }
      }
      else if (descending)
      {
        for (int i = 1; i < arr.length; i++)
        {
          if (arr[i] > arr[i - 1] && !checked)
          {
            result[0] = i - 1;
            checked = true;
          }
          else if (arr[i] <= arr[i - 1] && checked)
          {
            result[1] = i;
          }
        }
      }
      else
      {
        while (first < arr.length - 1)
        {   
          first++;
          ascending = check_ascending(arr, first);
          descending = check_descending(arr, first);
          if (ascending || descending)
          {
            result[1] = first - 2;
            return result;
          }
        }
        return result;
      }
      if (result[0] != 0 && result[1] == 0)
      {
        result[1] = arr.length - 1;
      }
      return result;
    }
  
  public static boolean check_ascending(int[] arr, int n)
  {
    for (int i = n; i > n - 3; i--)
    {
      if (arr[i] < arr[i - 1])
      {
        return false;
      }
    }
    return true;
  }
  
  public static boolean check_descending(int[] arr, int n)
  {
    for (int i = n; i > n - 3; i--)
    {
      if (arr[i] > arr[i - 1])
      {
        return false;
      }
    }
    return true;
  }
}
