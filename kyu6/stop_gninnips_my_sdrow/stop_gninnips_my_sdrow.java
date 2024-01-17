public class SpinWords {

  public String spinWords(String sentence) 
  {
    
    //Creating variables
    String copy = "";
    char letter;
    int letter_quantity = 0, last_word = 0;
    int length = sentence.length();
    boolean end = false;
    
    //Looping through the sentence
    for (int i = 0; i < length; i ++)
    {
      
      //Checking if it is the end of the sentence
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
        if (end)
        {
          letter_quantity = i - last_word;
        }
        
        //Flipping long words
        if (letter_quantity > 4)
        { 
          for (int k = letter_quantity + last_word; k >= last_word; k--)
          {
            if (sentence.charAt(k) == ' ')
            {
              continue;
            }
            copy += sentence.charAt(k);
          }
          letter_quantity++;
        }
        
        //Copying small words
        else
        {
          for (int j = last_word; j <= i; j++)
          {
            if (sentence.charAt(j) == ' ')
            {
              continue;
            }
            copy += sentence.charAt(j);
          }
        }
        
        //Adding separation of words
        if (!end && letter_quantity != 0)
        {
          copy += " ";
        }
        
        //Reseting some variables
        letter_quantity = 0;
        last_word = i;
      }
    }
    return copy;
  }
}
