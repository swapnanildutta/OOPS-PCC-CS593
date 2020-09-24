class Test{
    int x;
    Test(int x) {
        this.x = x;
    }
    void show(Test obj){
        System.out.println("Printing X: "+ obj.x);
    }
    public static void main(String[] args) {
        Test obj = new Test(12);
        obj.show(obj);
    }
}
public class TestEx{
    public static void main(String[] args) {
        Test obj = new Test(24);
        obj.show(obj);
    }
}