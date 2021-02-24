import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDuplicateEx {
    public static void main(String[] args) {
        Integer list[] = { 7, 3, 5, 9, 1, 3, 9 };
        Set<Integer> set = new HashSet<>(Arrays.asList(list));
        System.out.println(set);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            ;
        }
        System.out.println();
        set.clear();
        System.out.println(set);
    }
}