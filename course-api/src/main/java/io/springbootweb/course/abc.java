import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class abc {
  public static void main(String[] args) {
    HashMap<String, List<String>> capitalCities = new HashMap<String, List<String>>();
    capitalCities.put("England", Arrays.asList(new String[]{"London","abc"}));
    capitalCities.put("Germany", Arrays.asList(new String[]{"Berlin"}));
    List<String> cities=new ArrayList<String>();  
    cities=capitalCities.get("England");
    System.out.println(cities);
    
 
    System.out.println(capitalCities); 
  }
}
