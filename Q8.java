import java.util.HashMap;
import java.util.Map;


public class Q8 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Amol", "43298772");
        map.put("Ameya", "41298772");
        map.put("Sanket", "42298772");
        map.put("Soham", "44298772");
        map.put("Bhavesh", "47298772");

        System.out.println(map.size());
        System.out.println(map.get("Amol"));

        for(Map.Entry<String, String> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    
}
