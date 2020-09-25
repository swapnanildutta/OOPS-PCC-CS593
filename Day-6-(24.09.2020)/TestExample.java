class Test{
    int x;
    Test(int x) {
        this.x = x;
    }
}
public class TestExample{
    public static Test getObj(int x) {
        return new Test(x);
    }
    public static void main(String[] args) {
        Test obj = getObj(24);
        System.out.println("Value of X: "+obj.x);
    }
}