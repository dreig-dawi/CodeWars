import java.util.ArrayList;
import java.util.Collections;

public class Kata
{
  public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
  {
    int arrays_quantity = arrayOfArrays.length;
    if (arrays_quantity == 0)
    {
      return 0;
    }
    ArrayList<Integer> length = new ArrayList<Integer>();
    for (int i = 0; i < arrays_quantity; i++)
    {
      length.add(arrayOfArrays[i].length);
    }
    Collections.sort(length);
    for (int i = 1; i < length.size(); i++)
    {
      if (length.get(i) - length.get(i - 1) != 1)
      {
        return length.get(i) - 1;
      }
    }
    return 0;
  }
}