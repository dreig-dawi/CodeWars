public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int contador = 0;
    boolean cinco = false;
    for (int i = start; i <= end; i++)
    {
      for (int j = 10, copia = i; copia != 0; copia /= 10)
      {
        System.out.println("j = " + j + ".. i = " + i + ".. copia = " + copia + "..cinco: " + cinco);
        if (copia % j == 5 || i % j == (-5))
        {
          cinco = true;
          break;
        }        
      }
      if (!cinco)
      {
        contador++;        
      }
      cinco = false;
    }
    return contador;
  }
}