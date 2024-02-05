import java.util.HashMap;

public class Scramblies 
{
    
    public static boolean scramble(String str1, String str2) 
    { 
      boolean exists;
      int counter = 0;
      char letter;
      HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
      for (int i = 0; i < str2.length(); i++)
      {
        letter = str2.charAt(i);
        if (!letters.containsKey(letter))
        {
          letters.put(letter, 1);
        }
        else
        {
          letters.put(letter, letters.get(letter) + 1);
        }
      }
      for (char i : letters.keySet())
      {
        exists = false;
        counter = 0;
        letter = i;
        for (int j = 0; j < str1.length(); j++)
        {
          if (i == str1.charAt(j))
          {
            counter++;
          }
          if (counter == letters.get(i))
          {
            exists = true;
            break;
          }
        }
        if (!exists)
        {
          return false;
        }
      }
      return true;
    }
}