import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<Integer>();
        TreeSet<Integer> tSet = new TreeSet<>();
        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
        for (Integer val : Arrays.asList(50, 30, 10, 40, 20)) {
            hSet.add(val);
            tSet.add(val);
            lhSet.add(val);
        }
        System.out.println("HashSet: " + hSet);
        hSet.removeIf(val -> (val == 30));
        System.out.println("After invoking removeIf() method: " + hSet);
        hSet.clear();
        System.out.println("After invoking clear() method: " + hSet);
        hSet.add(60);
        hSet.add(70);
        System.out.println("After new additions: " + hSet);
        hSet.removeAll(hSet);
        System.out.println("After invoking removeAll() method: " + hSet);
        System.out.println("\nTreeSet: " + tSet);
        System.out.println("First element of the TreeSet is: " + tSet.first());
        System.out.println("Last element of the TreeSet is: " + tSet.last());
        System.out.println("Using higher: " + tSet.higher(30));
        System.out.println("Using lower: " + tSet.lower(20));
        System.out.println("Using headSet with boolean value: " + tSet.headSet(40, true));
        System.out.println("Using tailSet with boolean value: " + tSet.tailSet(30, false));
        System.out.println("Removed First Element: " + tSet.pollFirst());
        System.out.println("Removed Last Element: " + tSet.pollLast());
        System.out.println("New TreeSet: " + tSet);
        System.out.println("\nLinkedHashSet: " + lhSet);
        Iterator<Integer> iterate = lhSet.iterator();
        System.out.print("LinkedHashSet using Iterator: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ");
        }
        System.out.println();
        LinkedHashSet<Integer> result;
        LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40));
        LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>(Arrays.asList(40, 50, 60));
        System.out.println("Numbers1: " + numbers1);
        System.out.println("Numbers2: " + numbers2);
        result = numbers1;
        result.addAll(numbers2);
        System.out.println("Union is: " + result);
        result = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40));
        result.retainAll(numbers2);
        System.out.println("Intersection is: " + result);
        result = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40));
        result.removeAll(numbers2);
        System.out.println("Difference is: " + result);
    }
}