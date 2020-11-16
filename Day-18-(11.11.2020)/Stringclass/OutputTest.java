package outputtest;

public class OutputTest {

    public static void main(String[] args) {
        int i = 10;
        Integer I = new Integer(i); //convert primitive type to object type
        
        System.out.println(I.getClass());
        
        int a = I.intValue(); //convert object type to primitive type 
        
        I = i; //autoboxing
        int j = I; //unboxing
        
        String str = "123";
        int num = Integer.parseInt(str);
        
        str = "123.75";
        double num1 = Double.parseDouble(str);
    }    
}
