import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// HashMap is implemented as a hash table, and there is no ordering on keys or values. 
// TreeMap is implemented based on red-black tree structure, and it is ordered by the key. 
// LinkedHashMap preserves the insertion order
public class MapsDemo {

    public static void main(String args[]) {
        // Create an empty HashMap object
        HashMap<Integer, String> hMap = new HashMap<>();

        System.out.println("HashMap related operations:~");
        System.out.println("==========================");

        // Add elements to this HashMap object
        hMap.put(60, "Friday");
        hMap.put(40, "Wednesday");
        hMap.put(30, "Tuesday");
        hMap.put(50, "Thursday");
        hMap.put(20, "Monday");
        hMap.put(70, "Saturday");
        hMap.put(10, "Sunday");

        System.out.println("HashMap object: " + hMap + "\n");

        System.out.println("HashMap key-value pairs:-> ");
        // Using nested class Map.Entry of Map interface
        for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key = " + key + "; Value = " + value);
        }
        System.out.println();

        // Create a TreeMap object using existing HashMap object
        TreeMap<Integer, String> tMap = new TreeMap<>(hMap);

        System.out.println("\nTreeMap related operations:~");
        System.out.println("==========================");

        System.out.println("TreeMap object: " + tMap + "\n");

        // Retrieve all keys
        System.out.println("Keys of tree map: " + tMap.keySet());

        // Retrieve all values
        System.out.println("Values of tree map: " + tMap.values());

        // Retrieve the First key and its value
        System.out.println("\nFirst key: " + tMap.firstKey() + " and Value: " + tMap.get(tMap.firstKey()) + "\n");

        // Remove the first key and value
        System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contains: " + tMap.values() + "\n");

        // Retrieve the Last key and value
        System.out.println("Last key: " + tMap.lastKey() + " and Value: " + tMap.get(tMap.lastKey()) + "\n");

        // Remove the last key and value
        System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contains: " + tMap.values());

        // Create a LinkedHashMap object using existing HashMap object
        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<>(hMap);

        System.out.println("\n\nLinkedHashMap related operations:~");
        System.out.println("================================");
        System.out.println("LinkedHashMap object: " + lhMap + "\n");

        // Search for a key in LinkedHashMap object
        Integer key = 30;
        if (lhMap.containsKey(key)) {
            System.out.println("Key " + key + " in LinkedHashMap has value " + lhMap.get(key));
        } else {
            System.out.println("Key " + key + " is not found!");
        }

        // Returns a Set view of the keys contained in this map
        Set<Integer> set = lhMap.keySet();
        System.out.println("Key Set: " + set);
    }

}
