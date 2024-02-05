import java.util.ArrayList

public class PascalsTriangle 
{
    public static long[] generate(int level) 
    {
      ArrayList<Long> result_list = new ArrayList<Long>;
      for (int i = 0; i < level; i++)
      {
        if (i == 0)
        {
          result_list.add(1);
        }
        else if (i == 1)
        {
          result_list.add(1);
          result_list.add(1);
        }
        else
        {
          for (int k = 0; k < i + 1; i++)
          {
            result_list.add(factorial(level))
          }
        }
      }
      
      return new long[0];
    }
  
    public static int factorial(int number)
    {
      int factorial = 1;
      for (int i = number; i > 0; i--)
      {
        factorial *= i;
      }
      return factorial
    }
}