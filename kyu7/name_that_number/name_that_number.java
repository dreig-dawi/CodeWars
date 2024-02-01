public class Kata {
  public static String nameThatNumber(int x) 
  {
    int unit = x % 10, ten = x / 10;
    String result = "";
    switch (unit)
    {
        case 1:
          result = "one";
          break;  
        case 2:
          result = "two";
          break;
        case 3:
          result = "three";
          break;
        case 4:
          result = "four";
          break;
        case 5:
          result = "five";
          break;
        case 6:
          result = "six";
          break;
        case 7:
          result = "seven";
          break;
        case 8:
          result = "eight";
          break;
        case 9:
          result = "nine";
    }
    switch (ten)
    {
        case 1:
          if (x != 18)
          {            
            result += "teen";
          }
          else
          {
            result += "een";
          }
          break;
        case 2:
          result = "twenty " + result;
          break;
        case 3:
          result = "thirty " + result;
          break;
        case 4:
          result = "forty " + result;
          break;
        case 5:
          result = "fifty " + result;
          break;
        case 6:
          result = "sixty " + result;
          break;
        case 7:
          result = "seventy " + result;
          break;
        case 8:
          result = "eighty " + result;
          break;
        case 9:
          result = "ninety " + result;
    }
    switch (x)
    {
        case 0:
          result = "zero";
          break;
        case 10:
          result = "ten";
          break;
        case 11:
          result = "eleven";
          break;
        case 12:
          result = "twelve";
    }
    return result.replaceAll("\\s*$", "");
  }
}