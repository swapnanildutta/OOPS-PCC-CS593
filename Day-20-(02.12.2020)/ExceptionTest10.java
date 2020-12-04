package exceptiontest;

import java.io.IOException;

public class ExceptionTest10 {
    
    public static void main(String[] args) {
        //new IOException(message, cause);
        IOException ex = new IOException("top level", new NullPointerException("cause"));
        //ex.initCause(new NullPointerException("cause"));
        try {
            throw ex;
        }
        catch(IOException e) {
            System.out.println("Caught = " + e);
            System.out.println("Cause = " + e.getCause());
        }
    }
}
