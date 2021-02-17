import java.util.*;

public class QueueEx {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> q = new ArrayDeque<Integer>();
        for (Integer i = 1; i <= 5; i++) {
            q.add(i);
        }
        System.out.println("The elements of the queue- " + q);
        int rem = q.remove();
        System.out.println("The removed Element- " + rem);
        System.out.println("The elements of the queue- " + q);
        System.out.println("The head of the queue- " + q.peek());
        System.out.println("The size of the Queue-" + q.size());
    }
}