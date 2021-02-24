import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(60, "Friday");
        hMap.put(40, "Wednesday");
        hMap.put(30, "Tuesday");
        hMap.put(50, "Thursday");
        hMap.put(20, "Monday");
        hMap.put(70, "Saturday");
        hMap.put(10, "Sunday");
        System.out.println("HashMap object: " + hMap + "\n");
        System.out.println("HashMap key-value pairs:-> ");
        for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = " + key + "; Value = " + value);
        }
        System.out.println();
        TreeMap<Integer, String> tMap = new TreeMap<>(hMap);
        System.out.println("TreeMap object: " + tMap + "\n");
        System.out.println("Keys of tree map: " + tMap.keySet());
        System.out.println("Values of tree map: " + tMap.values());
        System.out.println("\nFirst key: " + tMap.firstKey() + " and Value: " + tMap.get(tMap.firstKey()) + "\n");
        System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contains: " + tMap.values() + "\n");
        System.out.println("Last key: " + tMap.lastKey() + " and Value: " + tMap.get(tMap.lastKey()) + "\n");
        System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contains: " + tMap.values());
        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<>(hMap);
        System.out.println("LinkedHashMap object: " + lhMap + "\n");
        Integer key = 30;
        if (lhMap.containsKey(key)) {
            System.out.println("Key " + key + " in LinkedHashMap has value " + lhMap.get(key));
        } else {
            System.out.println("Key " + key + " is not found!");
        }
        Set<Integer> set = lhMap.keySet();
        System.out.println("Key Set: " + set);
    }
}