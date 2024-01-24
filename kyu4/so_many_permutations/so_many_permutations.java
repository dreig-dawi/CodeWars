import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Permutations 
{   
  static ArrayList<String> result = new ArrayList();
  
  public static List<String> singlePermutations(String s) 
  {
    permutation("", s);
    System.out.println("REsult: " + result);
    result.removeIf(n -> (n.length() != s.length()));
    
    //Removing duplicates
    Set<String> no_duplicates = new HashSet<String>(result);
    result.clear();
    result.addAll(no_duplicates);
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
