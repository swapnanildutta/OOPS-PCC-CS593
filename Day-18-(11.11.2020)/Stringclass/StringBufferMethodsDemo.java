package basicprograms;

public class StringBufferMethodsDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Object Programming languages");
        System.out.println("Original String = " + sb);
        System.out.println("Length = " + sb.length());
        System.out.println("Capacity = " + sb.capacity());
        
        // Accessing characters in a string
        for (int i = 0; i < sb.length(); i++) {
           System.out.print(sb.charAt(i)+ ",");
        }
        System.out.println();
        
        // Inserting a string in the middle
        int pos = sb.indexOf(" Programming");
        sb.insert(pos, " Oriented");
        System.out.println("Modified String = " + sb);
        
        // Setting a character to a specified position
        sb.setCharAt(6, '-');
        System.out.println("String now = " + sb);
        
        // Appending a string
        sb.append(" are very popular.");
        System.out.println("Appended String = " + sb);
        
        // Deletion and insertion example w.r.t a character
        StringBuffer sb1 = sb;
        sb1.deleteCharAt(6);
        sb1.insert(6, ' ');
        System.out.println("New String = " + sb1);
        
        // Deleting the characters in a substring of this sequence
        sb.delete(1, 7);
        System.out.println("Deleted String1 = " + sb);
        sb.delete(2, 10);
        System.out.println("Deleted String2 = " + sb);
        sb.delete(3, 13);
        System.out.println("Deleted String3 = " + sb);
        
        // Converting StringBuffer object to String object
        String s = sb.toString();
        System.out.println("Converted String = " + s);
        
        // Reversing the contents of StringBuffer object
        sb.reverse();
        System.out.println("Reverse String = " + sb);
        
        sb.setLength(0);
        System.out.println("Final String = " + sb);
    }
}
