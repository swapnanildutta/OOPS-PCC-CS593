class Student{
    void doWork(){
        System.out.println("Student specific work.");
    }
}
class UGStudent extends Student{
    @Override
    void doWork(){
        System.out.println("UG Student specific work.");
    }
}
public class MethodOverride{
    public static void main(String[] args) {
        Student student = new Student();
    }
}