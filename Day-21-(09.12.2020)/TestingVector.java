import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector; //implements a generic dynamic array

public class TestingVector {

    public static void main(String[] args) {
        int a = 10;
        Integer I = a; // autoboxing (1)
        int k = I; // unboxing (2)
        Integer ob = new Integer(a); // old technique (1): converting primitive type to wrapper type
        int j = ob.intValue(); // old technique (2): converting wrapper type to primitive type

        // 1st vector object
        Vector<Integer> v1 = new Vector<Integer>();
        System.out.println("vector1 = " + v1);
        System.out.println("size = " + v1.size());
        System.out.println("capacity = " + v1.capacity());

        // adding elements
        for (int i = 1; i <= 12; i++) {
            v1.add(i);
        }
        System.out.println("vector1 = " + v1);
        System.out.println("size = " + v1.size());
        System.out.println("capacity = " + v1.capacity());

        // accessing elements
        System.out.println("\nvector1 elements: ");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(v1.get(i) + " ");
        }
        System.out.println();

        // 2nd vector object
        Vector<String> v2 = new Vector<String>(4); // initial capacity value of 4
        System.out.println("\nvector2 = " + v2);
        System.out.println("size = " + v2.size());
        System.out.println("capacity = " + v2.capacity());

        // adding elements
        v2.add("hi");
        v2.add("bye");
        v2.add("hello");
        v2.add("thanks");
        v2.add("welcome");
        System.out.println("\nvector2 = " + v2);
        System.out.println("size = " + v2.size());
        System.out.println("capacity = " + v2.capacity());

        // accessing elements
        Enumeration<String> e = v2.elements();
        System.out.println("\nvector2 elements: ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        Object[] object = v2.toArray();
        System.out.println("\nvector2 elements: ");
        for (Object obj : object) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 3rd vector object
        Vector<Double> v3;
        v3 = new Vector<Double>(5, 3); // initial capacity value of 5, capacity increment value of 3
        System.out.println("\nvector3 = " + v3);
        System.out.println("size = " + v3.size());
        System.out.println("capacity = " + v3.capacity());

        for (double i = 11; i < 100; i = i + 11) {
            v3.add(i);
        }

        System.out.println("\nvector3 = " + v3);
        System.out.println("size = " + v3.size());
        System.out.println("capacity = " + v3.capacity());

        // accessing elements
        Iterator<Double> it = v3.iterator();
        System.out.println("\nvector3 elements: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
