package basicprograms;

public class StringTest {

    public static void main(String[] args) {
        String s1 = new String("india"); //1: non-pool area in heap
        String s2 = "india";             //2: string constant pool (part of heap)
        String s3 = s1.intern();         //returned to string pool
        
        if(s1==s2)
            System.out.println("same memory location");
        else
            System.out.println("different memory location");
        
        if(s2==s3)
            System.out.println("same memory location");
        else
            System.out.println("different memory location");
        
        if(s1==s3)
            System.out.println("same memory location");
        else
            System.out.println("different memory location");
        
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        
        String ob1 = "mother";
        System.out.println(ob1.concat("land"));
        System.out.println(ob1); //string objects are immutable
        String ob2 = ob1 + "land";
        System.out.println(ob2);
                
        //Constructing String objects can also be done from 
        //array of bytes, array of characters, or string itself.
        byte[] bytes = {0, 2, 4, 6, 8};  // byte array    
        //unicode: '\u0000' to '\uffff'
        char[] characters = {'a', 'b', 'C', 'D'}; // char array
        System.out.println((int)characters[0]);
        int[] nos = {0, 2, 4, 6, 8};  // byte array  
        String str = new String("pqrst"); // string object

        // Examples of Creation of Strings
        String byteStr = new String(bytes); //1
        String charStr = new String(characters); //1
        //String intStr = new String(nos); //1
        String newStr = new String(str); //1
        
        System.out.println(byteStr); 
        System.out.println(charStr); 
    }
}
