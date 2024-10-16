import java.util.TreeMap;
import java.util.Map;

public interface TreeMapBasic {
    public static void main(String[] args) {
        Map<String,Integer> num = new TreeMap<>();
        num.put("One", 10);
        num.put("Two", 20);
        num.put("Three", 30);
        // System.out.println(num);

        // Add if not present : 
        num.putIfAbsent("Two", 2);
        num.putIfAbsent("Four", 40);
        System.out.println(num.keySet());


        // Iterate in Map :
        for (Map.Entry<String,Integer> e : num.entrySet()){
            // System.out.println("Entry Sets are : "+e);
            // System.out.println("Keys are : "+ e.getKey());
            // System.out.println("values are : "+ e.getValue());
        }
        // For only keyset : 
        for(String key : num.keySet()){
            // System.out.println("Keys are : "+ key);
        }

        for(Integer value : num.values()){
            // System.out.println("Values are : "+ value);
        }
    }
}

