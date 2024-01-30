public class Dinglemouse 
{

  public static String whatTimeIsIt(final double angle) 
  {
    double hour = angle / 30;
    double min = angle % 30 * 2;
    System.out.println("Angle: " + angle + "..Time: " + hour + "..TimeINT: " + angle % 30);
    String result = "";
    result = ((int)hour < 10) ? "0" + (int)hour + ":": (int)hour + ":";
    if ((int)hour == 0)
    {
      result = "12:";
    }
    if ((int)min == 0)
    {
      result += "00";
    }
    else
    {
      result += ((int)min < 10) ? "0" + (int)min : (int)min;
    }
    return result;
  }

}