import java.util.ArrayList;

public class PascalsTriangle 
{
    public static long[] generate(int level) 
    {
      
      //Introduce result into results_list
      ArrayList<Double> result_list = new ArrayList<Double>();
      for (int i = 0; i < level; i++)
      {
        if (i == 0)
        {
          result_list.add((double)1);
        }
        else if (i == 1)
        {
          result_list.add((double)1);
          result_list.add((double)1);
        }
        else
        {
          for (long k = 0; k < i + 1; k++)
          {
            result_list.add(binomial_coefficient(i, k));
            System.out.println(binomial_coefficient(i, k) + "..Destrozo");
          }
        }
      }
      
      //Turning result_list(ArrayList<Long>) into result(long[])
      long[] result = new long[result_list.size()];
      for (int i = 0; i < result.length; i++)
      {
        result[i] = result_list.get(i);
        System.out.println("result(long[]): "+result[i]);
      }
      
      System.out.println(result);
      return result;
    }
  
    public static double factorial(long number)
    {
      long factorial = 1;
      for (long i = number; i > 0; i--)
      {
        factorial *= i;
      }
      System.out.println("FACTORIAL: " + factorial);
      return factorial;
    }
  
    public static double binomial_coefficient(double n, double k)
    {
      System.out.println("N: "+n+"..K: "+k);
      System.out.println("Nominator: " + factorial(n));
      System.out.println("DENominator: " + (factorial(k) * factorial(n - k)));
      System.out.println("DESTROZO RESULT: " + factorial(n) / (factorial(k) * factorial(n - k)));
      return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
