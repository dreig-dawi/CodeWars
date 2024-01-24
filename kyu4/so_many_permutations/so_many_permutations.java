import java.util.List;

class Permutations 
{   
  public static List<String> singlePermutations(String s) 
  {
    List<Character> letters;
    int length = s.length();
    for (int i = 0; i < length; i++)
    {
      letters.add(i, s.charAt(i));
    }
    permutations(length, letters);
    return null;
  }

  public static List<String> permutations(int length, List characters)
  {
    if(length == 1) 
    {
      list_add(elements);
    }
    else 
    {
       for(int i = 0; i < length - 1; i++) 
       {
         permutations(length - 1, character);
         if(n % 2 == 0) 
         {
           swap(elements, i, length - 1);
         }
         else
         {
           swap(elements, 0, length -  1);
         }
       }
      permutations(length - 1, character);
    }
    return null;
  }
}
