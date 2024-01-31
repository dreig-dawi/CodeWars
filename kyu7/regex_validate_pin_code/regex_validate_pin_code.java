import org.apache.commons.lang3.StringUtils;

public class Solution 
{
  public static boolean validatePin(String pin) 
  {
    int length = pin.length();
    if ((length == 4 || length == 6) && StringUtils.isNumeric(pin))
    {
      return true;
    }
    return false;
  }
}