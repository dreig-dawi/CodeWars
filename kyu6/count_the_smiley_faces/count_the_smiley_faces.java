import java.util.*;

public class SmileFaces 
{  
  public static int countSmileys(List<String> arr) 
  {
    int size = arr.size();
    int length, smileys = 0;
    String element;
    char character;
    boolean eyes = false, nose = false;
    for (int i = 0; i < size; i++)
    {
      element = arr.get(i);
      length = element.length();
      for (int j = 0; j < length; j++)
      {
        character = element.charAt(j);
        if (!eyes && (character == ':' || character == ';'))
        {
          eyes = true;
        }
        else if (eyes && (character == ')' || character == 'D') && (j == length - 1))
        {
          smileys++;
          break;
        }
        else if (eyes && (character == '-' || character == '~') && !nose)
        {
          nose = true;
          continue;
        }
        else
        {
          break;
        }
      }
      eyes = false;
      nose = false;
    }
    return smileys;
  }
}
