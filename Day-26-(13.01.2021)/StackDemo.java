package mycollections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        // Create Stack object
        Stack stack = new Stack<>();
        Iterator iterator;

        // Push operation
        custom_push(stack);

        // Iterate through the elements of stack
        iterator = stack.iterator();
        System.out.println("\nStack elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Pop operation
        custom_pop(stack);

        // Check empty or not
        System.out.println(custom_empty(stack));

        // Push operation
        custom_push(stack);

        // Iterate through the elements of stack
        iterator = stack.iterator();
        System.out.println("\nStack elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Peek operation
        custom_peek(stack);

        // Search operations
        custom_search(stack, 4); 
        custom_search(stack, 7);

        // Check empty or not
        System.out.println(custom_empty(stack));
    }

    // Pushing element onto the top of the stack 
    static void custom_push(Stack st) {
        System.out.println("\nPush operation:~ ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Item pushed: " + i);
            st.push(i);
        }
    }

    // Popping element from the top of the stack 
    static void custom_pop(Stack st) {
        System.out.println("\nPop operation:~ ");

        for (int i = 1; i <= 5; i++) {
            Integer item = (Integer) st.pop();
            System.out.println("Item popped: "+ item);
        }
    }

    // Displaying element on the top of the stack 
    static void custom_peek(Stack st) {
        System.out.println("\nPeek operation:~ ");
        Integer element = (Integer) st.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack 
    static void custom_search(Stack st, int element) {
        System.out.println("\nSearch operation:~ ");
        Integer pos = (Integer) st.search(element);

        if (pos == -1) {
            System.out.println("Element " + element + " is not found");
        } else {
            System.out.println("Element " + element + " is found at position " + pos);
        }
    }

    // Checking stack is empty or not
    static String custom_empty(Stack st) {
        System.out.println("\nChecking stack is empty or not:~ ");
        if(st.empty() == true)
            return "Stack is empty!";
        else
            return "Stack is not empty!"; 
    }

}

//Deque<Integer> stack = new ArrayDeque<Integer>();