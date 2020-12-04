package specialtest;

public class VarargsTest {
    //demonstrating varags
    public static void testMethod(Object... args) {
        for (Object arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        testMethod(23, 34, 78); 
        testMethod("Hello", "Students"); 
        testMethod(123.75);
    }
}
