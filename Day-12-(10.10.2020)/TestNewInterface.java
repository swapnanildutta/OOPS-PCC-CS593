interface Test {	
	//default method
	default void check() {  
        pvtMethod(); // JSE 9: calling private method  
        pvtStaticMethod(); // JSE 9: calling private static method  
    }  
	
    // private method   
    private void pvtMethod() {  
        System.out.println("private method called");  
    }  
	
    // private static method   
    private static void pvtStaticMethod() {  
        System.out.println("private static method called");  
    }  
}  

public class TestNewInterface implements Test {
	
    public static void main(String[] args) {
        Test t = new TestNewInterface();
        t.check();
    }
}
