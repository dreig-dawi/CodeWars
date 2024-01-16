public class SpinWords {

  public String spinWords(String sentence) 
  {
    String copy = "";
    char letter;
    int letter_quantity = 0, last_word = 0;
    int length = sentence.length();
    boolean end = false;
    for (int i = 0; i < length; i ++)
    {
      if (i == length - 1)
      {
        end = true;
      }
      letter = sentence.charAt(i);
      if (letter != ' ' && !end)
      {
        letter_quantity++;
      }
      else
      {
        if (letter_quantity > 4)
        { 
          for (int k = letter_quantity; k >= 0; k--)
          {
            copy += sentence.charAt(k + last_word);
          }
        }
        else
        {
          for (int j = last_word; j < i; j++)
          {
            copy += sentence.charAt(j);
          }
        }
        if (!end && letter_quantity != 0)
        {
          copy += " ";
        }
        letter_quantity = 0;
        last_word = i;
      }
    }
    return copy;
  }
}