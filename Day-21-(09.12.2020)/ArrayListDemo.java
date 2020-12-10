//package mycollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(30, 50, 70, 90, 60));
        System.out.println("ArrayList: " + al);
        System.out.println("Size: " + al.size());
        al.add(80);
        al.add(2, 20);
        System.out.println("ArrayList: " + al);
        System.out.println("Size: " + al.size());
        al.ensureCapacity(100);
        
        Collections.sort(al);
        System.out.println("\nSorted ArrayList: " + al);
        
        //accessing elements
        Iterator it = al.iterator();
        System.out.println("\nArrayList elements: ");
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        
        //accessing elements
        System.out.println("\nArrayList elements: ");
        Object[] object = al.toArray();
        for(Object ob : object) {
            System.out.print(ob + " ");
        }
        System.out.println("");
        
        //accessing elements
        System.out.println("\nArrayList elements: ");
        Integer[] obj = new Integer[al.size()];
        al.toArray(obj);
        for(Object o : obj) {
            System.out.print(o + " ");
        }
        System.out.println("");
        
        System.out.println("\nArrayList elements: ");
        al.forEach(System.out::println);
    }
}
