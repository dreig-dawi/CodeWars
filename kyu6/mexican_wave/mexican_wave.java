import java.util.ArrayList;
public class MexicanWave 
{

    public static String[] wave(String str) 
    {
      ArrayList<String> result_list = new ArrayList<String>();
      String copy = "";
      int length = str.length();
      int spaces = 0;
      char letter;
      for (int i = 0; i < length; i++)
      {
        spaces = 0;
        for (int j = 0; j < length; j++)
        {
          letter = str.charAt(j);
          if (letter == ' ')
          {
            copy += letter;
            spaces++;
          }
          else if (i + spaces == j)
          {
            copy += Character.toUpperCase(letter);
          }
          else
          {
            copy += letter;
          }
        }
        result_list.add(copy);
        copy = "";
      }
      String[] result = new String[length - spaces];
      for (int i = 0; i < length - spaces; i++)
      {
        result[i] = result_list.get(i);
      }
      return result;
    }
}