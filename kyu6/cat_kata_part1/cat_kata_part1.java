public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) 
    {
      System.out.println(minDistance);
      int row_quantity = yard.length, col_quantity = yard[0].length(), cats = 0, row1 = 0, row2 = 0, col1 = 0, col2 = 0;
      double distance = 100, new_distance;
      boolean rowcol1 = true;
      String word;
      for (int i = row_quantity - 1; i >= 0; i--)
      {
        word = yard[i];
        System.out.println(word + i);
        for (int j = 0; j < col_quantity; j++)
        {
          if (row2 != 0 || col2 != 0)
          {
            new_distance = Math.sqrt((Math.pow((row2 - row1), 2) + Math.pow((col2 - col1), 2)));
            distance = new_distance < distance ? new_distance : distance;
            System.out.println("New_distance: " + new_distance + "..Distance: " + distance);
          }
          if (word.charAt(j) != '-' && rowcol1)
          {
            row1 = i;
            col1 = j;
            rowcol1 = false;
            System.out.println("1: " + word.charAt(j));
          }
          else if (word.charAt(j) != '-' && !rowcol1)
          {
            row2 = i;
            col2 = j;
            rowcol1 = true;
            System.out.println("2: " + word.charAt(j));
          }
        }
      }
      if (row2 == 0 && col2 == 0)
      {
        return true;
      }
      if (distance >= minDistance)
      {
        return true;
      }
      return false;
    }
}
