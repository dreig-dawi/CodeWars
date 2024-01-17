public class SpinWords {

  public String spinWords(String sentence) 
  {
    String copy = "";
    char letter;
    int letter_quantity = 0, last_word = 0;
    int length = sentence.length();
    boolean end = false, spinned = false;
    for (int i = 0; i < length; i ++)
    {
      if (i == length - 1)
      {
        end = true;
        System.out.println("End: " + end);
      }
      letter = sentence.charAt(i);
      if (letter != ' ' && !end)
      {
        letter_quantity++;
        System.out.println("Letter quantity+: " + letter_quantity);
      }
      else
      {
        if (letter_quantity > 4)
        { 
          for (int k = letter_quantity; k >= 0; k--)
          {
            copy += sentence.charAt(k + last_word);
            System.out.println(">4." + copy + ".");
          }
          System.out.println("i: " + i);
          spinned =true;
        }
        else
        {
          System.out.println("i..: " + i);
          for (int j = last_word; j <= i; j++)
          {
            if (sentence.charAt(j) == ' ')
            {
              continue;
            }
            copy += sentence.charAt(j);
            System.out.println("." + copy +".");
          }
        }
        if (!end && letter_quantity != 0 && !spinned)
        {
          copy += " ";
          System.out.println(".." + copy + "..");
        }
        letter_quantity = 0;
        if (spinned)
        {
          i++;
          letter_quantity++;
        }
        last_word = i;
        spinned = false;
        System.out.println("Letere + last word: " + letter_quantity + " " + last_word);
      }
    }
    return copy;
  }
}
