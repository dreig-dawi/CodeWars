public class Kata
{
  public static boolean CheckIfFlush(String[] cards)
  {
    int hand_length = cards.length, card_length;
    boolean flush = true;
    char suit = '\n';
    for (int i = 0; i < hand_length; i++)
    {
      card_length = cards[i].length();
      if (i == 0)
      {
        suit = cards[i].charAt(card_length - 1);
      }
      else if (cards[i].charAt(card_length - 1) != suit)
      {
        flush = false;
      }
    }
    return flush; 
  }
}
