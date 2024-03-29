public class Kata 
{
    public static String encryptThis(String text) 
    {
      String result = "";
      int length = text.length();
      int word = 0;
      char character;
      boolean word_check = false;
      if (length != 0)
      {
        for (int i = 0; i < length; i++)
        {
          if (!word_check)
          {
            word = i;
            word_check = true;
          }
          else if (word_check && text.charAt(i) == ' ')
          {
            word_check = false;
            result += (int)text.charAt(word);
            if (i - word > 2)
            {              
              result += text.charAt(i - 1);
              for (int j = word + 2; j < i - 1; j++)
              {
                result += text.charAt(j);
              }
              result += text.charAt(word + 1);
            }
            else if (i - word == 2)
            {
              result += text.charAt(i - 1);
            }
            result += " ";
          }
          if (check_last(text, i) && word_check)
          {
            result += check_last(text, word) ? "" + (int)text.charAt(word) : "" + (int)text.charAt(word) + text.charAt(i);
            for (int j = word + 2; j < length - 1; j++)
            {
              result += text.charAt(j);
            }
            if (!check_last(text, word) && i - word != 1)
            {              
              result += text.charAt(word + 1);
            }
          }
        }
      }
      return result;
    }
  
  public static boolean check_last(String text, int n)
  {
    if(text.length() - n == 1)
    {
      return true;
    }
    return false;
  }
}
