import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ParseMolecule {
    
    public static Map<String,Integer> getAtoms(String formula) 
    {
      HashMap<String,Integer> result = new HashMap<String,Integer>();
      Pattern p = Pattern.compile("([A-Z][a-z]*)(\\d*)");
      Matcher m = p.matcher(formula);
      while (m.find()) 
      {
       String element = m.group(1);
       int count =  Integer.parseInt(m.group(2).equals("") ? "1" : m.group(2));
       result.put(element, count + (result.get(element) == null ? 0 : result.get(element)));
      }
      return result;
    }
}