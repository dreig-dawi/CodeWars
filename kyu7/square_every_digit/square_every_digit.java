public class SquareDigit 
{
  public int squareDigits(int n) 
  {
    String result = "" + n;
    int digits = (int)Math.pow(10, result.length());
    result = "";
    for (int i = digits; i > 0; i /= 10)
    {
      result += (n / i) * (n / i);
      n %= i;
    }
    return Integer.valueOf(result);
  }
}