public class NumberAndIPAddress 
{
	public static String numberAndIPaddress(String s) 
  {
    String number, result;
    char letter;
    int length = s.length();
    long binary_result, decimal_result;
    
    //Checking if it is an IP
		if (s.matches("^(.*?([.])*)$"))
    {
      int binary1, binary2, binary3;
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
      binary_result = Long.parseLong(result);
      decimal_result = Long.parseLong(binary_result, 2);
      result = "" + decimal_result;
      return result;      
    }
    
    System.out.println("False");
    return s;
  }
}