public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) 
  {
    int text_length = text.length();
    String result = "";
    char letter;
    boolean end_comment = false;
    for (int i = 0; i < text_length; i++)
    {
      letter = text.charAt(i);
      if (symbol_check(letter, commentSymbols))
      {
        end_comment = true;
        continue;
      }
      else if (end_comment)
      {
        if (end_check(letter))
        {
          if (i > 0 && i < (text_length - 1))
          {
            if (!empty_check(text, i))
            {
                result = result.replaceAll("\\s*$", "");
            }                      
          }
          result += '\n';
          end_comment = false;
        }
      }
      else
      {
        if (end_check(letter))
        {
          result = result.replaceAll("\\s*$", "");
        }
        result += letter;
      }
    }
    result = result.replaceAll("\\s*$", "");
    return result;
	}
  
	public static boolean symbol_check(char letter, String[] symbols)
  {
    int array_length = symbols.length;
    char symbol;
    for (int j = 0; j < array_length; j++)
    {
      symbol = symbols[j].charAt(0);
      if (letter == symbols[j].charAt(0))
      {
        return true;
      }
    }
    return false;
  }
  
  public static boolean end_check(char letter)
  {
    if (letter == '\n')
    {
      return true;
    }
    return false;
  }
  
  public static boolean empty_check(String text, int n)
  {
    return (text.charAt(n - 1) == text.charAt(n + 1)) ? true : false;
  }
}
