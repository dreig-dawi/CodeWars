import java.util.List;

class Permutations 
{   
  public static List<String> singlePermutations(String s) 
  {
    List<char> letters = new List<char>();
    int length = s.length;
    for (int i = 0; i < length; i++)
    {
      letter.add(i, s.charAt(i));
    }
    permutations(length);
    return null;
  }

  public static List<String> permutations(int length, List<char> characters)
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
