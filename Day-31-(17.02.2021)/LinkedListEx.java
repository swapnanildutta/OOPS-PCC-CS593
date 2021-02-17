import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int size;
        Iterator iterator;
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        size = list.size();
        System.out.print("Linked list data: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list size: " + size);
        }
        list.addFirst(55);
        System.out.println("Adding data at first location: 55");
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        list.addLast(66);
        System.out.println("Adding data at last location: 66");
        System.out.print("Now the list contain: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        list.add(2, 99);
        System.out.println("Adding data at 3rd location: 99");
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        System.out.println("First data: " + list.getFirst());
        System.out.println("Last data: " + list.getLast());
        System.out.println("Data at position 3 is: " + list.get(3));
        int first = list.removeFirst();
        System.out.println("Data removed from 1st location: " + first);
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        int last = list.removeLast();
        System.out.println("Data removed from last location: " + last);
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        int second = list.remove(1);
        System.out.println("Data removed from 2nd location: " + second);
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());
        list.clear();
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            System.out.println("Linked list size: " + size);
        }
    }
}