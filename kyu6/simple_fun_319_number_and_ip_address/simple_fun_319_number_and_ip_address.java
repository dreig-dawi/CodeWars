public class NumberAndIPAddress 
{
	public static String numberAndIPaddress(String s) 
  {
    String number = "", result;
    char letter;
    int length = s.length();
    System.out.println(s);
    
    //Checking if it is an IP
		if (s.contains("."))
    {
      String binary1 = "", binary2 = "", binary3 = "";
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
                binary1 = Integer.toBinaryString(Integer.valueOf(number));
                break;
              case 2:
                binary2 = Integer.toBinaryString(Integer.valueOf(number));
                break;
              case 3:
                binary3 = Integer.toBinaryString(Integer.valueOf(number));
          }
          number = "";
        }
        else
        {          
          number += letter;
        }
      }
      number = Integer.toBinaryString(Integer.valueOf(number));
      
      //Making sure binary has 8 digits
      binary1 = digits_8(binary1);
      binary2 = digits_8(binary2);
      binary3 = digits_8(binary3);
      number = digits_8(number);
      
      result ="" + binary1 + binary2 + binary3 + number;
      
      //Parse long to String
      return "" + to_decimal(result);
    }
    
    //Number introduced
    else
    {
      String decimal1 = "", decimal2 = "", decimal3 = "", decimal4 = "";
      char digit;
      
      //Making sure result has 32 digits
      result = digits_32(Long.toBinaryString(Long.valueOf(s)));
      System.out.println(result);
      
      //Loop through s, stoping every 8 digits
      for (int i = 0; i < 4; i++)
      {
        for (int j = i * 8; j < 8 + (i * 8); j++)
        {
          digit = result.charAt(j);
          switch (i)
          {
              case 0:
                decimal1 += digit;
                break;
              case 1:
                decimal2 += digit;
                break;
              case 2:
                decimal3 += digit;
                break;
              case 3:
              decimal4 += digit;
          }
        }
      }
      result = to_decimal(decimal1) + "." + to_decimal(decimal2) + "." + to_decimal(decimal3) + "." +to_decimal(decimal4);
      return result;
    }
    
  }
  
  public static String digits_8(String binary)
  {
    int length = binary.length();
    if (length < 8)
    {
      int add = 8 - length;
      for (int i = 0; i < add; i++)
      {
        binary = "0" + binary;
      }
    }
    return binary;
  }
  
  public static String digits_32(String binary)
  {
    int length = binary.length();
    if (length < 32)
    {
      int add = 32 - length;
      for (int i = 0; i < add; i++)
      {
        binary = "0" + binary;
      }
    }
    return binary;
  }
  
  public static long to_decimal(String binary)
  {
    return Long.parseLong(binary, 2);
  }

}
