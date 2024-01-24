import java.util.List;
import java.util.ArrayList;

class Permutations 
{   
  static ArrayList<String> result = new ArrayList();
  
  public static List<String> singlePermutations(String s) 
  {
    permutation("", s);
    System.out.println("REsult: " + result);
    for (int i = 0; i < result.size(); i++)
    {      
      result.remove(s.length() != result.get(i).length());
    }
    return result;
  }
  
  public static void permutation(String prefix, String str) 
  {
    int n = str.length();
    if (n == 0) 
    {      
      result.add(prefix);
      System.out.println(prefix);
    }
    else 
    {
      for (int i = 0; i < n; i++)
      {            
        permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
      }
    }
  }
}
