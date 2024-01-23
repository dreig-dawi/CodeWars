public class CircleOfNumbers 
{
    public static int circleOfNumbers(int n, int firstNumber) 
    {
      int middle = n / 2;
      int move = firstNumber;
      int result = middle + move;
      if (result < n)
      {
        return result;
      }     
      int laps = (result / n);
      int position = result - (laps * n);
      return position;
    }
}
