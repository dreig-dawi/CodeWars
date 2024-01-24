import java.util.List;

class Permutations 
{   
    public static List<String> singlePermutations(String s) 
    {
      if(n == 1) 
      {
        printArray(elements, delimiter);
      }
      else 
      {
         for(int i = 0; i < n-1; i++) 
         {
           printAllRecursive(n - 1, elements, delimiter);
           if(n % 2 == 0) 
           {
             swap(elements, i, n-1);
           }
           else
           {
             swap(elements, 0, n-1);
           }
         }
        printAllRecursive(n - 1, elements, delimiter);
      }
    return null;
    }
}