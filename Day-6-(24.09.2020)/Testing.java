import java.util.Scanner;
public class Testing
{
    private int a, b;
    public Testing(int a, int b){
        this.a=a;
        this.b=b;
    }
    public static void swap(Testing ob){
        int t=ob.a;
        ob.a=ob.b;
        ob.b=t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Testing ob=new Testing(x, y);
        System.out.println("Before Swapping");
        System.out.format("Value of a=%d b=%d\n", ob.a, ob.b);
        swap(ob);
        System.out.println("After Swapping");
        System.out.format("Value of a=%d b=%d", ob.a, ob.b);
    }
}