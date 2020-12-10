//package mycollections;

class Generic<T> {
    T obj; // Declare an object reference of type T 

    // Constructor
    public Generic(T obj) {
        this.obj = obj;
    }
 
    // Instance method returning an object of type T
    public T getObject() {
        return obj;
    }

    // Instance method printing type of T
    public void printType() {
        System.out.print("Type = " + obj.getClass().getName());
    }
}

public class GenericsDemo {

    public static void main(String[] args) {
        // Create a Generic object for String types
        Generic<String> strObj = new Generic<String>("Asia");
        strObj.printType();
        String val1 = strObj.getObject();
        System.out.print(";  Value = " + val1 + "\n");

        // Create a Generic object for Double types
        Generic<Double> doubleObj = new Generic<Double>(123.75);
        doubleObj.printType();
        double val2 = doubleObj.getObject();
        System.out.print(";  Value = " + val2 + "\n");
        
        // Create a Generic object for Integer types
        Generic<Integer> intObj = new Generic<Integer>(99);
        intObj.printType();
        int val3 = intObj.getObject();
        System.out.print("; Value = " + val3 + "\n");
    }
}