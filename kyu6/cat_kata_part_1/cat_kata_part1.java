public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) 
    {
      int row_quantity = yard.length, col_quantity = yard[0].length(), distance, cats = 0, row1, row2, col1, col2;
      int[] cat_row = new int[row_quantity];
      int[] cat_col = new int[col_quantity];
      
      //Making sure the array is filled with numbers < 0
      for (int k = 0; k < row_quantity; k++)
      {
        cat_row[k] = -1;
        for (int l = 0; l < col_quantity; l++)
        {
          cat_col[l] = -1;
        }
      }
      
      boolean rowcol1 = true;
      String word;
      for (int i = 0; i < row_quanity; i++)
      {
        word = yard[i];
        for (int j = 0; j < col_quantity; j++)
        {
          if (word.charAt(j) != '-')
          {
            cat_row[i] = i;
            cat_col[j] = j;
            cats++;
          }
        }
      }
      for (int m = 0; m < row_quantity; m++)
      {
        for (int n = 0; n < col_quantity; n++)
        {
          if (cat_row[m] > 0 && cat_col[n] > 0 && rowcol1)
          {
            row1 = cat_row[m];
            col1 = cat_col[n];
          }
        }
      }
      int distance = (int)Math.sqrt(Math.pow((row2 - row1), 2) + Math.pow((col2 - col1), 2));
      System.out.println("Row1: " + row1 + "..Col1: " + col1 + "..Row2: " + row2 + "..Col2: " + col2 + "..Distance: " + distance + "..MinDistance: " + minDistance);
      if (distance > minDistance)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}
