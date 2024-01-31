public class NumberAndIPAddress 
{
	public static String numberAndIPaddress(String s) 
  {
    String number = "", result;
    char letter;
    int length = s.length();
    long numeric_result;
    
    //Checking if it is an IP
		if (s.matches("^(.*?([.])*)$"))
    {
      int binary1 = 0, binary2 = 0, binary3 = 0;
      int dots = 0;
      for (int i = 0; i < length; i++)
      {
        letter = s.charAt(i);
        if (letter == '.')
        {
          dots++;
          switch (dots)
          {
              case 1:
                binary1 = Integer.valueOf(number);
                break;
              case 2:
                binary2 = Integer.valueOf(number);
                break;
              case 3:
                binary3 = Integer.valueOf(number);
          }
          number = "";
        }
        else
        {          
          number += letter;
        }
      }
      result = binary1 + binary2 + binary3 + number;
      numeric_result = Long.parseLong(result, 2);
      result = "" + numeric_result;
      return result;      
    }
    
    System.out.println("False");
    return s;
  }
}
