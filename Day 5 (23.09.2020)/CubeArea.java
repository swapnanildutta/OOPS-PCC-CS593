import java.util.Scanner;
public class CubeArea {
    static double length, breadth, height;
    public static void inputData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the cube");
        length=sc.nextDouble();
        System.out.println("Enter the breadth of the cube");
        breadth=sc.nextDouble();
        System.out.println("Enter the height of the cube");
        height=sc.nextDouble();
        }
    public static double computeVolume(){
        return length*breadth*height;
    }
    public static void main(String[] args){
        inputData();
        double vol=computeVolume();
        System.out.format("Volume of the cube: %.2f", vol);
    }
}