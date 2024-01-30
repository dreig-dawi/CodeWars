public class FindIndexOfSubArray 
{
    private int[] arr;
    public FindIndexOfSubArray(int[] arr) 
    {
        this.arr = arr;
    }

    public int[] findIndexOfSubArray()
    {
      for (int i = 0; i < arr.length; i++)
      {        
        System.out.println(arr[i]);
      }
      
      int[] result = new int[2];
      
      //Check 
      if (arr.length < 4)
      {
        return result;
      }
      
      boolean checked = false, ascending = check_ascending(arr), descending = check_descending(arr);
      
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
        return result;
      }
      System.out.println(result[0] + ".." + result[1]);
      return result;
    }
  
  public static boolean check_ascending(int[] arr)
  {
    for (int i = 0; i < 3; i++)
    {
      if (arr[i] > arr[i + 1])
      {
        return false;
      }
    }
    return true;
  }
  
  public static boolean check_descending(int[] arr)
  {
    for (int i = 0; i < 3; i++)
    {
      if (arr[i] < arr[i + 1])
      {
        return false;
      }
    }
    return true;
  }
}