import java.text.DecimalFormat;

public class PizzaPayments 
{
  public static double michaelPays(double cost) 
  {
    if (cost < 5)
    {
      return Math.round(cost * 100) / 100.0;
    }
    if (cost / 3 > 10)
    {
      return Math.round((cost - 10) * 100) / 100.0;
    }
    cost = Math.round((cost - (cost / 3)) * 100) / 100.0;
    return cost;
  }
}