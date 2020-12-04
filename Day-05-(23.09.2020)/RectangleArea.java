import java.util.Scanner;

class Rectangle{
    private int length,breadth;

    public void inputData(int l , int b){
        length = l;
        breadth = b;
    }

    public int computeArea(){
        return length * breadth;
    }
}

public class RectangleArea{
    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        int l= sc.nextInt();
        int b= sc.nextInt();
        rect.inputData(l, b);
        int area = rect.computeArea();
        System.out.println("Area: " + area);
    }
}