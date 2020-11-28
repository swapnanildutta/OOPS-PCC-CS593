package exceptiontest;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest06 {    
    
    public static void main(String[] args) {
        //Case 1: Throwable class no-argument constructor
        try {
            method1();
        }
        catch(Exception e) {
            System.out.println("Caught = " + e);
        }        
        //Case 2: Throwable class constructor with String argument
        try {
            method2();
        }
        catch(Exception e) {
            System.out.println("Caught = " + e);
        }
    }
    static void method1() {
        throw new NullPointerException(); //exception created explicitly
    }
    static void method2() throws IOException, ClassNotFoundException, SQLException {
        throw new IOException("checked"); //exception created explicitly
    }
}
