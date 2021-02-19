import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        System.out.println("queue = " + q);
        System.out.println("size: " + q.size());

        for (int i = 10; i <= 50; i = i + 10) {
            q.add(i);
        }
        System.out.println("\nqueue = " + q);
        System.out.println("size: " + q.size());

        q.addAll(Arrays.asList(70, 80, 90));
        System.out.println("\nqueue = " + q);
        System.out.println("size: " + q.size());

        int item = q.remove();
        System.out.println("\nItem removed: " + item);
        System.out.println("\nqueue = " + q);
        System.out.println("size: " + q.size());

        Object[] ob = q.toArray();
        System.out.println("queue elements: ");
        for (Object o : ob) {
            System.out.print(o + " ");
        }
        System.out.println();

        q.clear();
        System.out.println("\nqueue = " + q);
        System.out.println("size: " + q.size());
    }
}
