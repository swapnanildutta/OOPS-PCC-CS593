package exceptiontest;

class X {} //superclass
//subclasses of X (i.e. siblings)
class Y extends X {}
class Z extends X {}

public class ExceptionTest04 {
    
    public static void main(String[] args) {
        //String str = "xyz";
        X x1 = new Y(); //object of Y
        X x2 = new Z(); //object of Z
        String str = "india";
        try {
            //Integer ob = Integer.parseInt(str); //illegal code
            //Y y = (Y)x2;
            int n = str.charAt(7);
        }        
        catch(Exception e) {
            System.out.println("Caught = " + e);
        }
    }
}
