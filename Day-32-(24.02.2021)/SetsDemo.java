import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {

    public static void main(String[] args) {
        // Create HashSet object
        HashSet<Integer> hSet = new HashSet<Integer>();

        // Create TreeSet object
        TreeSet<Integer> tSet = new TreeSet<>();

        // Create LinkedHashSet object
        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();

        // Add three objects in HashSet, TreeSet and LinkedHashSet
        for (Integer val : Arrays.asList(50, 30, 10, 40, 20)) {
            hSet.add(val);
            tSet.add(val);
            lhSet.add(val);
        }

        System.out.println("HashSet: " + hSet);

        // Removing element on the basis of specified condition
        hSet.removeIf(val -> (val == 30));
        System.out.println("After invoking removeIf() method: " + hSet);

        // Removing all the elements available in the HashSet
        hSet.clear();
        System.out.println("After invoking clear() method: " + hSet);

        // Adding new elements
        hSet.add(60);
        hSet.add(70);
        System.out.println("After new additions: " + hSet);

        // Removing all the new elements from HashSet
        hSet.removeAll(hSet);
        System.out.println("After invoking removeAll() method: " + hSet);

        System.out.println("\nTreeSet: " + tSet);
        System.out.println("First element of the TreeSet is: " + tSet.first());
        System.out.println("Last element of the TreeSet is: " + tSet.last());

        // Using higher()
        System.out.println("Using higher: " + tSet.higher(30));
        // Using lower()
        System.out.println("Using lower: " + tSet.lower(20));
        // Using headSet() with specified boolean value

        System.out.println("Using headSet with boolean value: " + tSet.headSet(40, true));
        // Using tailSet() with specified boolean value
        System.out.println("Using tailSet with boolean value: " + tSet.tailSet(30, false));
        // Using pollFirst()
        System.out.println("Removed First Element: " + tSet.pollFirst());
        // Using pollLast()
        System.out.println("Removed Last Element: " + tSet.pollLast());
        System.out.println("New TreeSet: " + tSet);

        System.out.println("\nLinkedHashSet: " + lhSet);
        // Calling the iterator() method
        Iterator<Integer> iterate = lhSet.iterator();
        System.out.print("LinkedHashSet using Iterator: ");
        // Accessing elements
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ");
        }
        System.out.println();

        LinkedHashSet<Integer> result; // for storing result
        LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40));
        LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>(Arrays.asList(40, 50, 60));
        System.out.println("Numbers1: " + numbers1);
        System.out.println("Numbers2: " + numbers2);

        // Union of two sets numbers1 and numbers2
        result = numbers1;
        result.addAll(numbers2);
        System.out.println("Union is: " + result);
        // Intersection of two sets numbers1 and numbers2
        result = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40)); // result is now numbers1
        result.retainAll(numbers2);
        System.out.println("Intersection is: " + result);
        // Difference between two sets numbers1 and numbers2
        result = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40)); // result is now numbers1
        result.removeAll(numbers2);
        System.out.println("Difference is: " + result);
    }

}
