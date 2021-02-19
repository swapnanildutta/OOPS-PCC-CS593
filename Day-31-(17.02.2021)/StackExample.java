import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("stack = " + st);
        System.out.println("size: " + st.size());
        System.out.println("capacity: " + st.capacity());

        for (int i = 10; i <= 50; i = i + 10) {
            st.add(i);
        }
        System.out.println("\nstack = " + st);
        System.out.println("size: " + st.size());
        System.out.println("capacity: " + st.capacity());

        st.addElement(70);
        st.push(80);
        System.out.println("\nstack = " + st);
        System.out.println("size: " + st.size());
        System.out.println("capacity: " + st.capacity());

        st.add(5, 60);
        System.out.println("\nstack = " + st);
        System.out.println("size: " + st.size());
        System.out.println("capacity: " + st.capacity());

        int item = st.pop();
        System.out.println("\nItem popped: " + item);
        System.out.println("stack = " + st);

        item = st.peek();
        System.out.println("\nItem at the top: " + item);
        System.out.println("stack = " + st);

        st.clear();
        System.out.println("\nstack = " + st);
        System.out.println("size: " + st.size());
        System.out.println("capacity: " + st.capacity());
    }
}
