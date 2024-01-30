import java.util.ArrayList

public class Solution
{
    public static long maxProduct(int[] numbers, int sub_size)
    {
      int list_length = numbers.length;
      int n_counted = 0, max = numbers[0];
      ArrayList<Integer> max_position = ArrayList<Integer>
      max = check_highest
      max_position.add(max);
    }

  public static int check_highest(int[] list, int length)
  {
    int highest = list[0];
    for (int i = 1; i < length; i++)
      {
        if (highest < list[i])
        {
          highest = list[i];
        }          
      }
    return highest
  }
}