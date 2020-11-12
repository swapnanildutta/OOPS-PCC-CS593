package basicprograms;

public class StringBufferTest {
    
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java"); //1
        StringBuffer sb2 = new StringBuffer(100);    //2
        StringBuffer sb3 = new StringBuffer();       //3
        
        System.out.println("sb1 length : " + sb1.length() + "; sb1 capacity : " + sb1.capacity());
        System.out.println("sb2 length : " + sb2.length() + "; sb2 capacity : " + sb2.capacity());
        System.out.println("sb3 length : " + sb3.length() + "; sb3 capacity : " + sb3.capacity());
        
        String str = " and JavaScript languages are very popular "; //length: 43
        System.out.println(str.length());
        sb1.append(str);
        System.out.println("\nsb1 length : " + sb1.length() + "; sb1 capacity : " + sb1.capacity());
        
        //str = " are very popular"; //length: 17
        //System.out.println(str.length());
        //sb1.append(str);
        //System.out.println("sb1 length : " + sb1.length() + "; sb1 capacity : " + sb1.capacity());
    }
}
