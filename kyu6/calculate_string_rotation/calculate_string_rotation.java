public class CalculateRotation 
{
  static int shiftedDiff(String first, String second)
  {
    String result = first;
    int n = 0, length = result.length();
    if (result.equals(second))
    {
      return 0;
    }
    while (!result.equals(second))
    {
      if (n == length)
      {
        return -1;
      }
      else
      {
        result = "";
        for (int i = n; i > 0; i--)
        {
          result += first.charAt(length - i);
        }
        for (int i = 0; i < length - n; i++)
        {
          result += first.charAt(i);
        }
      }
      n++;
    }
    return n - 1;
  }
}
