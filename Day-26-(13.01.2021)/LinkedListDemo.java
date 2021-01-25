import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        //Create a LinkedList collection of Integers
        LinkedList<Integer> list = new LinkedList<Integer>();
        int size;
        Iterator iterator;

        //Add data in the list
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        size = list.size();
        System.out.print("Linked list data: ");

        //Create a iterator
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        //Check list empty or not
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        } 
        else {
            System.out.println("Linked list size: " + size);
        }

        //Add at the first place
        list.addFirst(55);
        System.out.println("Adding data at first location: 55");
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());

        //Adding last or append
        list.addLast(66);
        System.out.println("Adding data at last location: 66");
        System.out.print("Now the list contain: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());

        //Adding data at 3rd position
        list.add(2, 99);
         System.out.println("Adding data at 3rd location: 99");
        System.out.print("Now the list contains: ");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());

        //Retrieve first data
        System.out.println("First data: " + list.getFirst());

        //Retrieve last data
        System.out.println("Last data: " + list.getLast());

        //Retrieve specific data
        System.out.println("Data at position 3 is: " + list.get(3));

        //Remove first element
        int first = list.removeFirst();
        System.out.println("Data removed from 1st location: " + first);
        System.out.print("Now the list contains: ");
        iterator = list.iterator();

        //After removing data
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());

        //Remove last element
        int last = list.removeLast();
        System.out.println("Data removed from last location: " + last);
        System.out.print("Now the list contains: ");
        iterator = list.iterator();

        //After removing data
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());

        //Remove 2nd data
        int second = list.remove(1);
        System.out.println("Data removed from 2nd location: " + second);
        System.out.print("Now the list contains: ");
        iterator = list.iterator();

        //After removing data
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("Now the size of list: " + list.size());

        //Remove all elements
        list.clear();
        if (list.isEmpty()) {
            System.out.println("Linked list is empty");
        } 
        else {
            System.out.println("Linked list size: " + size);
        }
    }
}