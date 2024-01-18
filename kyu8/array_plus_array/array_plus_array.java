public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) 
  {
    int length = arr1.length, result = 0;
    for (int i = 0; i < length; i++)
    {
      result += arr1[i];
    }
    length = arr2.length;
    for (int j = 0; j < length; j++)
    {
      result += arr2[j];
    }
    return result;
  }

}
