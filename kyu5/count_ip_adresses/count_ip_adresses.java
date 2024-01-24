public class CountIPAddresses 
{
	public static long ipsBetween(String start, String end) 
  {
    int start_length = start.length(), end_length = end.length(), dots = 3;
    String digits = "";
    char start_char, end_char;
    long start_int = 0, end_int = 0;
    
    //Looping through start String
    for (int i = 0; i < start_length; i++)
    {
      start_char = start.charAt(i);
      if (start_char != '.' || dots == 0)
      {
        digits += start_char;
      }
      else
      {
        start_int += (long)(Integer.parseInt(digits) * Math.pow(256, dots));
        dots--;
        digits = "";
      }
    }
    start_int += (long)(Integer.parseInt(digits));

    //Reseting variables
    dots = 3;
    digits = "";
    
    //Looping through end String
    for (int i = 0; i < end_length; i++)
    {
      end_char = end.charAt(i);
      if (end_char != '.' || dots == 0)
      {
        digits += end_char;
        System.out.println(digits);
      }
      else
      {
        end_int += (long)(Integer.parseInt(digits) * Math.pow(256, dots));
        dots--;
        digits = "";
      }
    }
    end_int += (long)(Integer.parseInt(digits));
    
		return end_int - start_int;
	}
}
